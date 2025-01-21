package phamthiluyen_0711;

import java.util.ArrayList;
import java.util.Random;

public class Exercise6 {

    public static void main(String[] args) {
        ArrayList<Integer> digit = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            int randomDigit = random.nextInt(50) + 1;
            digit.add(randomDigit);
        }
        System.out.println("Danh sach sau khi random:" + digit);
        int odd = 0;
        int even = 0;
        for (int i = 0; i < digit.size(); i++) {
            if (digit.get(i) % 2 == 0) {
                even++;
            } else {
                odd++;
            }

        }
        System.out.println("Cac so chan:"+even);
        System.out.println("Cac so  le:"+odd);
    }
}
