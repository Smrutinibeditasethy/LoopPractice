package variables;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4 integers : ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int d= sc.nextInt();
        int even1=0,even2=0,even3=0,even4=0;
        int odd1=0,odd2=0,odd3=0,odd4=0;
        if (a%2==0){
             even1=a;
        }else odd1= a;
        if (b%2==0){
             even2=b;
        }else odd2= b;
        if (c%2==0){
            even3=c;
        }else odd3= c;
        if (d%2==0){
            even4=d;
        }else odd4= d;
        int result= even1+even2+even3+even4;
        int result2= odd1+odd2+odd3+odd4;
        System.out.println("The value of even num : " +result);
        System.out.println("The value of odd num : " +result2);

    }
}
