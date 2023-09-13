package variables;

import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value: ");
        int num= sc.nextInt();
        boolean store= true;
        for (int i=2; i<num; i++){
            if (num%i==0){
                store= false;
                break;
            }
        }
        if (store&&num>1){
            System.out.println("The entered value is prime number.");
        }else System.out.println("The entered value is not a prime number.");
    }
}
