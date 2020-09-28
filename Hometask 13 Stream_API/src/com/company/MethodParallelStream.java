package com.company;
import java.util.Optional;
import java.util.stream.Stream;

//метод parallelStream() интерфейса Collection для создания параллельного потока из
// коллекции.
public class MethodParallelStream {
    static class Program{


    public static void main(String[] args) {
        Stream<Integer> numbersStrem = Stream.of(1, 2, 3, 4, 5, 6);
        Optional<Integer> result = numbersStrem.parallel().reduce((x,y)-> x*y);
        System.out.println(result.get());  //720

        Stream<String> wordsStream = Stream.of("мама", "мыла", "раму", "hello world");
        String sentence = wordsStream.parallel()
                .filter(s->s.length()<10)  //фильтрация над параллельным потоком
                .sequential()
                .reduce("Результат:", (x,y)->x + " " + y); // операция над последовательным потоком
        System.out.println(sentence);


    }

    Stream<Integer> wordsStream = Stream.of(1, 2, 3, 4, 5, 6);
    Integer result = wordsStream.parallel().reduce(1,(x,y)-> x * y);
    System.out.println(result);

    //упорядоченость в параллельных потоках
    //И чтобы сохранить порядок следования, необходимо применять метод forEachOrdered:
        phones.parallelStream()
            .sorted()
            .forEachOrdered(d->System.out.println(d));

        phones.parallelStream()
            .sorted()
            .forEach(s-> System.out.println(s));
    }
}
