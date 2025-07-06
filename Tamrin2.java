//برنامه ای که 2 عدد از کاربر بگیرد و مجموع را به دست آورد؟
package Test1;

import java.util.Scanner;

public class Tamrin2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = num.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = num.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum of numbers: " + sum);
    }
}