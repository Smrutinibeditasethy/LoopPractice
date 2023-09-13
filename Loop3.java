package variables;

import java.util.Scanner;

public class Loop3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int reminder, dividend, divisor, hcf= 0;
        System.out.println("Enter the value : ");
        dividend= sc.nextInt();
        System.out.println("Enter the value : ");
        divisor= sc.nextInt();
        do {
            reminder = dividend % divisor;
            if (reminder == 0) {
                hcf = divisor;
            } else {
                dividend = divisor;
                divisor = reminder;
            }
        }
            while (reminder != 0);
            System.out.println("The HCF of the two values is :" +hcf);
    }
}
