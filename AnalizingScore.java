package analizingscore.pkg4.pkg7;

import java.util.Scanner;

public class AnalizingScore47 {
    public static void main(String[] args) {
      Scanner input=new Scanner (System.in);
      int [] scoure =new int [15];
     int sum=0; 
     int count=0;
      for (int i=0;i<15;i++){
          int num=input.nextInt();
          if (num <0)break;
          scoure[i]=num;
           sum +=num;
           count++;
      }
     double avrage =sum/count;
     int aboveoraqual=0;int blow=0;
     for (int i=0;i<count;i++){
         if (scoure[i]>avrage){
             aboveoraqual++;     
         }
         else blow++;
     }
        System.out.println("this is avrage "+avrage);
        System.out.println("this is  over or aqual"+aboveoraqual);
        System.out.println("this is blow "+blow );
      
    }
    
}
