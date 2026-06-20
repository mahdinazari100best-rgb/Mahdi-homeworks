package distinctnumber.pkg5.pkg7;

import java.util.Scanner;

public class DistinctNumber57 ;{
    public static void main(String[] args) {
    Scanner input=new Scanner (System.in);
    int []distinctN=new int [10];
    int count =0 ;
        System.out.println("Entetr 10 number ");
        for (int i=0 ;i<10;i++){
           int value =input.nextInt();
           if (!InAlreadyInArray(distinctN,count,value)){
               distinctN[count]=value;
               count++;
           }
        }
        System.out.println("the number of distinct number is "+count);
        System.out.println("the distinct number are");
        for (int i=0;i<count ;i++){
            System.out.println(distinctN[i]);
        }
    }
  public static boolean InAlreadyInArray(int []array,int size ,int value){
      for (int i=0;i<size;i++){
      if (array [i]==value ) {
          return true;   
      }   
      }
   return false;
  }  
}
