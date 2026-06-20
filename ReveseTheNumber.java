package revesethenumber.pkg7;

import java.util.Scanner;

public class ReveseTheNumber7 {
    public static void main(String[] args) {
Scanner input=new Scanner (System.in);
  int [] num=new int [10];
        System.out.println("please enter all of numbers");
        for (int i=0;i<10;i++){
            num[i]=input.nextInt();
            
        }
        System.out.println("the Oppsent of numbers ");
        for (int i=9;i>=1;i--){
            System.out.println("this is the numbers "+num[i]);
        }
        
    }
    
}
