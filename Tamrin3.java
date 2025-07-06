package Test1;
import java.util.Scanner;
public class Tamrin3 {
    public static void main(String[]args){
        Scanner num = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num1 = num.nextInt();
        System.out.println("Enter a number2:");
        int num2 = num.nextInt();

        System.out.println("لطفاً یک عملگر وارد کنید (+, -, *, /): ");
        String operator = num.next();

        switch (operator) {
            case "+":
                int result1 = num1 + num2;
                System.out.println("عملگر جمع انتخاب شد حاصل می شود:" + " " + result1);
                break;
            case "-":
                int result2 = num1 - num2;
                System.out.println("عملگر تفریق انتخاب شد حاصل می شود:" + " " + result2);
                break;
            case "*":
                int result3 = num1 * num2;
                System.out.println("عملگر ضرب انتخاب شد حاصل می شود:" + " " + result3);
                break;
            case "/":
                float result4 =(float) num1 / num2;
                System.out.println("عملگر تقسیم انتخاب شد حاصل می شود:" + " " + result4);
                break;
            default:
                System.out.println("عملگر نامعتبر وارد شده است.");
        }
    }
}