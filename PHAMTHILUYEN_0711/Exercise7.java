package phamthiluyen_0711;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
         ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("a["+i+"]=");
            int number = scanner.nextInt();
            numbers.add(number);
        }
        System.out.println("Cac phan tu:" + numbers);
        
        Collections.reverse(numbers);

        System.out.println("Reversed list: " + numbers);
    }
}

