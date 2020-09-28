package com.company;
import java.util.Arrays;
import java.util.Comparator;


public class ParallelOperationArray {
    static class Program {
        public static void main(String[] args) {

            int[] numbers = initializeArray(6);
            for (int i: numbers)
                System.out.println(i);

        }

        public static int[] initializeArray(int size) {
            int[] values = new int[size];
            Arrays.parallelSetAll(values, i-> i*10);
            return values;
        }

        class Phone {
            private String name;
            private int price;

            public Phone (String name, int price) {
                this.name = name;
                this.price = price;
            }
            public String getName() {
                return name;
            }

            public void setName(String val) {
                this.name = val;
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int val) {
                this.price = val;
            }

        }

        Phone[] phones = new Phone[] {new Phone("iPhone 8", 54000),
                new Phone("Pixel 2", 45000),
                new Phone("Samsung Galaxy S9", 40000),
                new Phone("Nokia 9", 32000),};

        Arrays.parallelSetAll(phones, i -> {
            phones[i].setPrice(phones[i].getPrice()-10000);
            return phones[i];
        });

        for(Phone p: phones)
            System.out.printf("%s - %d \n", p.getName(), p.getPrice());

        //Сортировка
        int[] nums = {30, -4, 5, 29, 7, -8};
        Arrays.parallelSort(nums);
        for(int i: nums)
            System.out.prinln(i);
    }
}

class Sortring {
    public static void main(String[] args) {
        Phone [] phones = new Phone[] {new Phone("iPhone 8", 54000),
                new Phone("Pixel 2", 45000),
                new Phone("Samsung Galaxy S9", 40000),
                new Phone("Nokia 9", 32000)};

        Arrays.parallelSort(phones, new PhonesComparator());

        for (Phone p: phones)
            System.out.println(p.getName());

    }
}

class PhonesComporator implements Comparator<Phone> {
    public int compare (Phone a, Phone b) {
        return a.getName().toUpperCase().compareTo(b.getName().toUpperCase());
    }
}

//Метод parallelPrefix() походит для тех случаев, когда надо получить элемент массива
// или объект того же типа, что и элементы массива, который обладает некоторыми
// признаками.

class ParallelPref {
    int[] numbers = {1, 2, 3, 4, 5, 6};
    Arrays.parallelPrefix(numbers, (x,y) -> x * y);

    for(int i: numbers)
        System.out.println(i);
}