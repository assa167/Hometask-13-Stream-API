package com.company;
import javax.swing.text.html.Option;
import java.lang.reflect.Array;
import java.util.stream.Stream;
import java.util.Optional;
import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Stream;


public class MixingOperations {
    public static void main(String[] args) {

        //метод count возвращает кол-во элементов в потоке данных.
        ArrayList<String> names = new ArrayList<String>();
        names.addAll(Arrays.asList(new String() {"Tom","Sam","Bob","Alice"}));
        System.out.println(names.stream().count()); //4

        //количество элементов с длиной не больше 3 символов
        System.out.println(names.stream().filter(n -> n.length() <= 3).count()); //3


        //метод findFirst (извлекает 1-й элемент), findAny(извлекает случайный объект потока)

        ArrayList<String> names = new ArrayList<String>();
        names.adAll(Arrays.asList(new String[]{"Tom", "Sam", "Bob", "Alice"}));

        Optional<String> first = names.stream().findFirst();
        System.out.println(first.get()); //Tom

        Optional<String> any = names.stream().findAny();
        System.out.println(first.get()); //Tom

  }
}

class Programsss {
    //методы allMatch, anyMatch, noneMatch
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.addAll(Array.asList(new String([]{"Tom", "Sam", "Bob", "Alice"}));

        // есть ли в потоке строка, длина которой больше 3
        boolean any = names.stream().anyMatch(s->s.length()>3);
        System.out.println(any);  //true

        // все ли строки имеют длину в 3 символа
        boolean all = names.stream().allMatch(g->g.length()==3);
        System.out.println(all);  //false

        // НЕТ ЛИ в потоке строки "Bill". Если нет, то true, если есть, то false
        boolean none = names.stream().noneMatch(s->s=="Bill");
        System.out.println(none)  //true;


    //методы min, max
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.addAll(Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9}));

        Optional<Integer> min = numbers.stream().min(Integer::compare);
        Optional<Integer> max = numbers.stream().max(Integer::compare);
        System.out.println(min.get());   //1
        System.out.println(max.get());   //9

    }
}

class Programmer {
    public static void main(String[] args) {
        ArrayList<Phone> phones = new ArrayList<Phone>();
        phones.addAll(Arrays.asList(new Phone[]{
                new Phone("ipHone 8", 25000),
                new Phone("Xiaomi Mi 9 SE", 10000),
                new Phone("Samsung S10 SE", 15000),
                new Phone("One Plus 8 Pro", 20000)
        }));

        Phone min = phones.stream().min(Phoneee::compare).get();
        Phone max = phones.stream().max(Phoneee::compare).get();
        System.out.println("MIN Name: %s Price %d \n", min.getName(), min.getPrice());
        System.out.println("MAX Name: %s Price %d \n", max.getName(), max.getPrice());
    }
}

class Phoneee {
    private String name;
    private int price;

    public Phoneee(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public static int compare (Phone p1, Phone p2) {
        if (p1.getPrice() > p2.getPrice())
            return 1;
        return -1;
    }

    public String getName() { return name; }
    public int getPrice() { return price; }
}

//метод reduce выполняет терминальные операции сведение, возвращая некоторые знач - результат операции
class Prog {
    public static void main(String[] args) {

        Stream<Integer> numbersStream = Stream.of(1,2,3,4,5,6);
        Optional<Integer> result = numbersStream.reduce((x,y)->x*y);
        System.out.println(result.get());  //720


        Stream<String> wordsStream = Stream.of("мама", "мыла", "пол");
        Optional<String> sentence = wordsStream.reduce((x,y)-> " " + y);
        System.out.println(sentence.get());

        Stream<String> wordsStreams = Stream.of("мама", "мыла", "раму");
        String sentences = wordsStreams.reduce("Результат: ", (x,y)-> " " + y);
        System.out.println(sentences);   //Результат: мама мыла раму.
    }
}

class Phon {
    private String name;
    private int price;

    public Phon(String name, int price) {
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

class Fine {
    public static void main(String[] args) {
        Stream<Phon> phonStream = Stream.of(new Phon("iPhone X", 20000),
                new Phon("Xiaomi Mi 9SE", 10000),
                new Phon("Samsung 10 SE", 15000),
                new Phon("One Plus 8 Pro", 19000));

        int sum = phonStream (0, (x,y)-> {
            if (y.getPrice()<50000)
                return x + y.getPrice();
            else
                return x + 0;
                },
                (x,y)->x+y);

        )
        System.out.println(sum);   ///64000
    }
}

//тип Optional  Ряд операций сведения, такие как min, max, reduce, возвращают объект
// Optional<T>. Этот объект фактически обертывает результат операции. После выполнения
// операции с помощью метода get() объекта Optional мы можем получить его значение.
class Programma {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.addAll(Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
        Optional<Integer> min = numbers.stream().min(Integer::compare);
        System.out.println(min.get());  //1

        //список numbers пустой
        ArrayList<Integer> number = new ArrayList<Integer>();
        Optional<Integer> mins = number.stream().min(Integer::compare);
        System.out.println(min.get());  //java.util.NoSuchElementException

        // метод isPresent Он возврашает true, если значение присутствует в Optional
        //  и false, если значение отсутствует
        ArrayList<Integer> numberss = new ArrayList<Integer>();
        Optional<Integer> minss = numberss.stream().min(Integer::compare);
        if (min.isPresent()) {
            System.out.println(min.get());
        }

        //Метод orElse() позволяет определить альтернативное значение, которое будет
        // возвращаться, если Optional не получит из потока какого-нибудь значения:

        //пустой список
        ArrayList<Integer> nomer = new ArrayList<Integer>();
        Optional<Integer> minn = nomer.stream().min(Integer::compare);
        System.out.println(min.orElse(-1));  //-1

        //не пустой список
        nomer.addAll(Arrays.asList(new Integer[]{4,5,6,7,8,9}));
        minn = nomer.stream().min(Integer::compare);
        System.out.println(min.orElse(-1)); //4

        //Метод orElseGet() позволяет задать функцию, которая будет возвращать значение
        // по умолчанию:

        ArrayList<Integer> nomers = new ArrayList<Integer>();
        Optional<Integer> minnn = nomers.stream().min(Integer::compare);
        Random rnd = new Random();
        System.out.println(min.orElse(()->rnd.nextInt(100)));


        //Еще один метод - orElseThrow позволяет сгенерировать исключение, если Optional
        // не содержит значения
        ArrayList<Integer> nomerss = new ArrayList<Integer>();
        Optional<Integer> minnnn = nomerss.stream().min(Integer::compare);
        // генеррация исключения IllegalStateException
        System.out.println(min.orElseThrow(IllegalStateException::new));

        //Метод ifPresent() определяет действия со значением в Optional, если значение имеется:
        ArrayList<Integer> nomersss = new ArrayList<Integer>();
        nomerss.addAll(Arrays.asList(new Integer[]{4,5,6,7,8,9}));
        Optional<Integer> minnnnn = nomersss.stream().min(Integer::compare);
        minnnnn.ifPresent(v-> System.out.println(v));  //v

        //Метод ifPresentOrElse() позволяет определить альтернативную логику на случай,
        // если значение в Optional отсутствует:

        ArrayList<Integer> nom = new ArrayList<Integer>();
        Optional<Integer> minimal = nom.stream().min(Integer::compare);
        minimal.ifPresentOrElse(
                g-> System.out.println(g),
                ()-> System.out.println("Value not found")
    }
}