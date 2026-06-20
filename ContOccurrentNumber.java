package contoccurrentnumber.pkg7;

import java.util.Scanner;

public class ContOccurrentNumber7 {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in); 
      int[] counts=new int [100];
        System.out.println("please enter ineger betwen 1--100");
      int number=input.nextInt();
      while (number !=0){
       if (number >=1 && number <=100){
         counts[number]++;
       } 
       number =input.nextInt();
      }
      for (int i=0;i<=100;i++){
          if (counts[i]>1){
              System.out.println(i+"occure"+counts[i]+(counts[i]>1?"times":"time"));
              
          }
      }
      
    }
    
}
