package com.company;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.*;
import java.util.Scanner;

public class UniteFlows {

    //метод takeWhile - выбирает элементы из потока до тех пор, пока они соответствуют условию
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(-3, -2, -1, 0, 1, 2, 3, -4, -5);
        numbers.takeWhile(m -> m < 0)
                .forEach(m -> System.out.println(m));
    }

    Stream<Integer> numberss = Stream.of(-3, -2, -1, 0, 1, 2, 3, -4, -5);
    numberss.sorted().

    takeWhile(n ->n< 0)
            .

    forEach(n ->System.out.println(n));

    //метод DropWhile- пропускает элементы,котор не соответствуют условию
    Stream<Integer> number = Stream.of(-3, -2, -1, 0, 1, 2, 3, -4, -5);
    number.sorted().

    dropWhile(b->b< 0)
            .

    forEach(b ->System.out.println(b));

}

class DifferentFlowsMethods {
    //метод concat - объеденяет элементы 2-х потоков и возвращает объедененный поток

    public static void main(String[] args) {
        Stream<String> people1 = Stream.of("Tom", "Bob", "Sam");
        Stream<String> people2 = Stream.of("Alice", "Kate", "Sam");
        Stream.concat(people1, people2).forEach(n -> System.out.println(n));

        //метод distinct - возвращает только уникальные элементы потока
        Stream<String> people = Stream.of("Tom", "Bob", "Sam", "Tom", "Alice", "Kate", "Sam");
        people.distinct().forEach(f -> System.out.println(f));
    }

    //метод skip - используется для пропуска n кол-ва элементов

    Stream<String> phoneStream = Stream.of("iPhone 6 S", "Lumia 950", "Samsung Galaxy S 6", "LG G 4", "Nexus 7");

    phoneStream.skip(1)   //пропуск 1 эл
        .limit(2)       //выбор последующих 2-х элементов
        .forEach(e -> System.out.println(e));

}


// метод limit применяется для выборки первых n элементов потока
class Programs {
    public static void main(String[] args) {

        List<String> phones = new ArrayList<String>();
        phones.addAll(Arrays.asList(new String[]
                        {"iPhone 6 S", "Lumia 950", "Huawei Nexus 6P",
                        "Samsung Galaxy S 6", "LG G 4", "Xiaomi MI 5",
                        "ASUS Zenfone 2", "Sony Xperia Z5", "Meizu Pro 5",
                        "Lenovo S 850" }));

        int pageSize = 3; //кол-во элементов на страницу
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите номер страницы: ");
            int page = scanner.nextInt();

            if (page<1) break; //если число меньше 1, то выходим из цикла

            phones.stream().skip((page1) * pageSize)
                    .limit(pageSize)
                    .forEach(u -> System.out.println(u));
        }
    }
}






