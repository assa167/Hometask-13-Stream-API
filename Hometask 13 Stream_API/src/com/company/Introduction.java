package com.company;
import java.util.stream.*;


public class Introduction {
    public static void main(String[] args) {


        int[] numbers = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        int count = 0;
        for (int b : numbers) {
            if (b > 0) count++;
        }
        System.out.println(count);
    }
}

class TestStream {
    public static void main(String[] args) {
        //....................
        long count = IntStream.of(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5).filter(g -> g > 0).count();
        System.out.println(count);
    }
}



