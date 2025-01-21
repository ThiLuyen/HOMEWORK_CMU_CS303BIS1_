package phamthiluyen_0711;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercise11 {

    public static void main(String[] args) {
       ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("a["+i+"]=");
            int number = scanner.nextInt();
            numbers.add(number);
        }
        int max=numbers.get(0);
        int min=numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
            if (min > numbers.get(i)) {
                min = numbers.get(i);
            }
        }
        System.out.println("Max="+max);
        System.out.println("Min="+min);
    }
}
