package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Comparator;
import java.util.stream.Stream;



public class Sort {
    public static void main(String[] args) {
        List<String> phones = new ArrayList<>();
        Collections.addAll((phones, "iPhone X", "Nokia 9", "Huawei Nexus 6P",
                "Samsung Galaxy S8", "LG G6", "Xiaomi MI6",
                "ASUS Zenfone 3", "Sony Xperia Z5", "Meizu Pro 6",
                "Pixel 2");
        
        phones.stream()
                .filter(l->l.length()<12);
                .sorted()  //сортировка по возростанию
                .forEach(j->System.out.println(j));
                
    }

}

class Phones {
    private String name;
    private String company;
    private int price;

    public Phones(String name, String company, int price) {
        this.name = name;
        this.company = company;
        this.price = price;
    }

    public String getNames() {return name;}
    public int getPrices() {return price;}
    public String getCompany() {return company;}

}

 class Program {
     public static void main(String[] args) {

         Stream<Phones> phonesStream = Stream.of(new Phones("iPhone X", "Apple", 600),
                 new Phones("Pixel 2", "Google", 500),
                 new Phones("iPhone 8", "Apple", 450),
                 new Phones("Nokia 9", "HMD Global", 150),
                 new Phones("Galaxy S10", "Samsung", 250));

         phonesStream.sorted(new PhonesComparator())
                 .forEach(d-> System.out.printf("%s (%s) - %d \n",
                         d.getName(), d.getCompany(), d.getPrice()));
     }

}

class PhonesComparator implements Comparator<Phones> {
    public int compare(Phone a, Phone b) {
        return a.getName().toUpperCase().compareTo(b.getName()).toUpperCase());
    }

}