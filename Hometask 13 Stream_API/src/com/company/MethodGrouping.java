package com.company;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.IntSummaryStatistics;

//метод grouping  Чтобы сгруппировать данные по какому-нибудь признаку, нам надо
// использовать в связке метод collect() объекта Stream и метод Collectors.groupingBy()


public class MethodGrouping {
    class Phone {
        private String name;
        private String company;
        private int price;

        public Phone(String name, String company, int price) {
            this.name = name;
            this.company = company;
            this.price = price;
        }

        public String getName() { return name;}
        public int getPrice() { return price;}
        public String getCompany() { return company;}
    }

    public static void main(String[] args) {

        Stream<Phone> phoneStream = Stream.of(new  Phone("iPhone X", "Apple", 600),
                new Phone("Pixel 2", "Google", 500),
                new Phone("iPhone 8", "Apple",450),
                new Phone("Galaxy S9", "Samsung", 440),
                new Phone("Galaxy S8", "Samsung", 340));

        Map<String, List<Phone>> phonesByCompany = phoneStream.collect(
                Collectors.groupingBy(Phone::getCompany));

        for (Map.Entry<String, List<Phone>>) item : phonesByCompany.entrySet() {
            System.out.println(item.getKey());
            for (Phone phone : item.getValue()){
                System.out.println(phone.getName());
            }
            System.out.println();
        }

        //Метод Collectors.partitioningBy() имеет похожее действие, только он делит
        // элементы на группы по принципу, соответствует ли элемент определенному
        // условию.

        Map<Bollean, List<Phone>> phonesByCompanyy = phoneStream.collect(
                Collectors.partitioningBy(p->p.getCompany()=="Apple"));

        for (Map.Entry<Boolean, List<Phone>> item : phonesByCompanyy.entrySet()) {
            System.out.println(item.getKey());
            for (Phone phone : item.getValue()) {
                System.out.println(phone.getName());
            }
            System.out.println();
        }

//Метод Collectors.counting применяется в Collectors.groupingBy() для вычисления
// количества элементов в каждой группе

        Map<String, Long> phonesByCompan = phonesByCompan.collect(
                Collectors.groupingBy(Phone :: getCompany, Collectors.counting()));

        for (Map.Entry<String, Long> item : phonesByCompan.entrySet()) {
            System.out.println(item.getKey() + " " + item.getValue());
        }
//Метод Collectors.summing применяется для подсчета суммы.

        Map<String, Integer> phoneByComp = phonesByComp.collect(
                Collectors.groupingBy(Phone::getCompany, Collectors.summingInt(Phone::getPrice)));

        for (Map.Entry<String, Integer> item : phoneByComp.entrySet()) {
            System.out.println(item.getKey() + item.getValue());
        }

// Методы maxBy и minBy применяются для подсчета минимального и максимального значения

        Map<String, Optional<Phone>> phoneByCom = phoneByCom.collect(
                Collectors.groupingBy(Phone::getCompany,
                        Collectors.minBy(Comparator.comparing(Phone::getPrice)));

                for (Map.Entry<String, Optional<Phone>> item : phoneByCom.entrySet()) {
                    System.out.println(item.getKey() + " - " + item.getValue().get().getName());
                }

//Методы summarizingInt() / summarizingLong() / summarizingDouble() позволяют
// объединить в набор значения соответствующих типов
//        getAverage(): возвращает среднее значение
//        getCount(): возвращает количество элементов в наборе
//        getMax(): возвращает максимальное значение
//        getMin(): возвращает минимальное значение
//        getSum(): возвращает сумму элементов
//        accept(): добавляет в набор новый элемент

        Map<String, IntSummaryStatistics> priceSummary = phoneStream.collect(
                Collectors.groupingBy(Phone::getCompany,
                        Collectors.summingInt(Phone::getPrice)));

                for (Map.Entry<String, IntSummaryStatistics> item : priceSummary.entrySet()){
                    System.out.println(item.getKey() + " - " + item.getValue().getAverage());
                }
//Метод mapping позволяет дополнительно обработать данные и задать функцию отображения
// объектов из потока на какой-нибудь другой тип данных. Например:

        Map<String, List<String>> phoneByCo = phoneStream.collect(
                Collectors.groupingBy(Phone::getCompany,
                        Collectors.mapping(Phone::getName, Collectors.toList())));

                for (Map.Entry<String, List<String>> item : phoneByCo.entrySet()) {
                    System.out.println(item.getKey());
                    for (String name : item.getValue()) {
                        System.out.println(name);
                    }
                }
//Выражение Collectors.mapping(Phone::getName, Collectors.toList()) указывает, что в
// группу будут выделятся названия смартфонов, причем группа будет представлять объект List.
    }
}
