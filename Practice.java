package variables;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value : ");
        int num= sc.nextInt();
        int temp = num;
        int reverce = 0;
        int reminder= 0;

        while (temp>0){
            reminder = temp % 10;
            reverce = reverce *10 +reminder;
            temp /=10;
        }
        System.out.println("The reverce of the entered value is :" +reverce);


    }
}
