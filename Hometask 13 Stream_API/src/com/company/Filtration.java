package com.company;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Stream;


public class Filtration {
    public static void main(String[] args) {

        //перебор методов. Метод ForEach
        Stream<String> citiesStream = Stream.of("Париж", "Лондон", "Мадрид", "Берлин", "Брюссель");
        citiesStream.forEach(s -> System.out.println(s));

        Stream<String> citiesStreams = Stream.of("Париж", "Лондон", "Мадрид", "Берлин", "Брюссель");
        citiesStreams.forEach(System.out::println);

        //Фильтрация. Метод filter
        Stream<String> citiesStreamF = Stream.of("Париж", "Лондон", "Мадрид", "Берлин", "Брюссель");
        citiesStreamF.filter(f->f.length()==6).forEach(f-> System.out.println(f));

    }
}




class Phone {

    private String name;
    private int price;

    public Phone(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getPrice(int price) {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    Stream<Phone> phoneStream = Stream.of(new Phone("Iphone 7", 25000), new Phone("Xiaomi Mi 9 SE", 12000), new Phone("Samsung Galasy S10", 20000));
    //phone.Stream.filter(p->p.getPrice()<19000).forEach(p->System.out.prinln(p.getName()));

    //Отображение. Метод Map
    //<R> Stream<R> map(Function<? super T>, ? extends R> mapper  - структура

    Stream<Phone> phoneStream = Stream.of(new Phone("Iphone 7", 25000), new Phone("Xiaomi Mi 9 SE", 12000), new Phone("Samsung Galasy S10", 20000));

    phoneStream
        .map(j-> j.getName())  //помещаем в поток только название телефонов
        .forEach(h-> System.out.println(h));

    phoneStream
        .map(k-> "название" + k.getName() + "цена" + p.getPrice());
        .forEach(v-> System.out.println(v));

    //Плоское отображение. Метод flatMap
    //<R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper) - структура

    Stream<Phone> phoneStream = Stream.of(new Phone("Iphone 7", 25000), new Phone("Xiaomi Mi 9 SE", 12000), new Phone("Samsung Galasy S10", 20000));

    phoneStream
        .flatMap(j->Stream.of(
                String.format("название: %s цена без скидки: %d", j.getName(), j.getPrice()),
                String.format("название: %s цена со скидки: %d", j.getName(), j.getPrice() - (int)(j.getPrice)())*0.1)
            ))
        .forEach(s-> System.out.println(s));

}



