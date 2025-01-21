package phamthiluyen_0711;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("a["+i+"]=");
            int number = scanner.nextInt();
            numbers.add(number);
        }
        System.out.println("Cac phan tu:" + numbers);
        int sum=0;
        for(int i=0;i<10;i++){
            sum=sum+numbers.get(i);
        }
        System.out.println("S="+sum);
    }
}
