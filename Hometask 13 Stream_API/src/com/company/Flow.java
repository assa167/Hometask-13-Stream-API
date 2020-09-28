package com.company;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.*;

//public class Flow {
//    public static void main(String[] args) {
//
//        ArrayList<String> cities = new ArrayList<String>();
//        Collections.addAll(cities, "Париж", "Лондон", "Мадрид");
//        cities.stream(); //получаем поток
//            .filter(s -> s.length() == 6)   //применяем фильтрацию по длинне строки
//                .forEach(s -> System.out.println(s));  //выводим отфильтрованные строки в консоль
//
//
//        ArrayList<String> cities = new ArrayList<String>();
//        Collections.addAll(cities, "Париж", "Лондон", "Мадрид");
//        Stream<String> citiesStream = cities.stream(); //получаем поток
//        citiesStream = citiesStream.filter(s -> s.length() == 6); //применяем фильтрацию по длинне строки
//        citiesStream.forEach(s -> System.out.println(s)); //выводим отфильтрованные строки в консоль
//
//        citiesStream.forEach(s -> System.out.prinln(s)); //терминальная операция употребляет поток
//        long number = citiesStream.count(); // здесь ошибка, т.к.  поток уже употреблен
//        System.out.println(number);
//        citiesStream = citiesStream.filter(s > s.lenght() > 5); //тоже нельзя т.к. поток уже употреблен
//
//
//        Stream<String> citiesStream = Arrays.stream(new String[]{"Париж", "Лондон", "Мадрид"});
//        citiesStream.forEach(s -> System.out.println(s)); //Выводим все элементы массива
//
//        IntStream intStream = Arrays.stream(new int[]{1, 2, 4, 5, 7});
//        intStream.forEach(i -> System.out.println(i));
//
//        LongStream longStream = Arrays.stream(new long[]{100, 200, 400, 500, 34534586});
//        longStream.forEach(k -> System.out.println(k));
//
//        DoubleStream doubleStream = Arrays.stream(new double[]{2.3, 7.8, 9.1, 6759.456, 585333227.49});
//        doubleStream.forEach(b -> System.out.println(b));
//
//
//        Stream<String> citiesStream = Stream.of("Париж", "Лондон", "Мадрид");
//        citiesStream.forEach(d -> System.out.prinln(d));
//
//        //можно передать массив
//        String[] cities = {"Париж", "Лондон", "Мадрид"};
//        Stream<String> citiesStream2 = Stream.of(cities);
//
//        IntStream intStream = IntStream.of(1, 2, 4, 5, 7);
//        intStream.forEach(q -> System.out.println(q));
//
//        LongStream longStream = LongStream.of(100, 200, 400, 500, 34534586);
//        intStream.forEach(a -> System.out.println(a));
//
//        DoubleStream doubleStream = DoubleStream.of(2.3, 7.8, 9.1, 6759.456, 585333227.49);
//        intStream.forEach(z -> System.out.println(z));
//    }
//}

