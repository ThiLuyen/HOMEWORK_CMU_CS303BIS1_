
package PHAMTHILUYEN_0711;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercise8 {
   public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(); 
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Loai "+(i+1)+":");
            String fruit = scanner.nextLine(); 
            fruits.add(fruit); 
        }       
        ArrayList<String> copy = new ArrayList<>(fruits);

        System.out.println("Danh sach dau: " + fruits);
        System.out.println("Danh sach sau khi sao chep: " + copy);
}
}
