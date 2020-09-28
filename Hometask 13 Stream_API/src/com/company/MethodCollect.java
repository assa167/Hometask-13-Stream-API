package com.company;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


//метод collect позволяет получать данные не в виде потока, а в виде коллекция для использ в ArrayList, Hashset
//<R,A> R collect(Collector<? super T,A,R> collector) общий вид

public class MethodCollect {
    public static void main(String[] args) {

        // метод toList(): преобразование к типу List
        List<String> new ArrayList<String>();
        Collections.addAll(phones, "iPhone 8", "HTC U12", "Huawei Nexus 6P",
                "Samsung Galaxy S9", "LG G6", "Xiaomi MI6", "ASUS Zenfone 2",
                "Sony Xperia Z5", "Meizu Pro 6", "Lenovo S850");

        List<String> filteredPhones = phones.stream()
                .filter(s->s.length()<10)
                .collect(Collectors.toList());

        for (String s : filteredPhones) {
            System.out.println(s);
        }

        //метод toSet(): преобразование к типу Set

        Set<String> filtredPhones = phones.stream()
                .filter.(s->s.length()<10)
                .collect(Collectors.toSet());
    }
}
    //для метода toMap нужен ключ и значение
   class Telephone {
        private String name;
        private int price;

        public Telephone(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }
    }

class FunctionalProgram {

    public static void main(String[] args) {
        Stream<Telephone> telephoneStream = Stream.of(new Telephone("iPhone 8", 54000),
                new Telephone("Nokia 9", 45000),
                new Telephone("Samsung Galaxy S9", 40000),
                new Telephone("LG G6", 32000));

        Map<String, Integer> telephones = telephoneStream
                .collect(Collectors.toMap(p->p.getName(), t->t.getPrice()));

        telephones.forEach((k,l)-> System.out.println(k + " " + l));
    }
}


//использование с HashSet
//Выражение HashSet::new представляет функцию создания коллекции. Аналогичным
// образом можно получать другие коллекции, например, ArrayList
//ArrayList<String> result = phones.collect(Collectors.toCollection(ArrayList::new));

class FunctionalPrograms {
    public static void main(String[] args) {
        Stream<String> phones = Stream.of("iPhone 8", "HTC U12", "Huawei Nexus 6P",
                "Samsung Galaxy S9", "LG G6", "Xiaomi MI6", "ASUS Zenfone 2",
                "Sony Xperia Z5", "Meizu Pro 6", "Lenovo S850");

        HashSet<String> filtredPhone = phones.filter(s->s.length()<12).
                collect(Collectors.toCollection(HashSet::new));

        filtredPhone.forEach(s -> System.out.println(s));
    }

}
 //Вторая форма метода collect имеет три параметра
//<R> R collect(Supplier<R> supplier, BiConsumer<R,? super T> accumulator, BiConsumer<R,R> combiner)
//supplier: создает объект коллекции
//accumulator: добавляет элемент в коллекцию
//combiner: бинарная функция, которая объединяет два объекта

class BestProgram {
    public static void main(String[] args) {
        Stream<String> phones = Stream.of("iPhone 8", "HTC U12", "Huawei Nexus 6P",
                "Samsung Galaxy S9", "LG G6", "Xiaomi MI6", "ASUS Zenfone 2",
                "Sony Xperia Z5", "Meizu Pro 6", "Lenovo S850");

        ArrayList<String> filtredPhones = phones.filter(s->s.lenght()<12)
                .collect(
                        () -> new ArrayList<String>(), //создаем ArrayList
                        (list, item) ->list.add(item), // добавляем в список элемент
                        (list1, list2) -> list1.addAll(list2)); // добавляем в список другой список

        filtredPhones.forEach(s-> System.out.println(s));
    }
}

