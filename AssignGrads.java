
package assigngrads.pkg7;

import java.util.Scanner;

public class AssignGrads7 {
    public static void main(String[] args) {
      
 Scanner input =new Scanner (System.in);  
  System.out.println(" please enter the numbe of students");
    int ns=input.nextInt();
    
    int [] scoure=new int [ns];
      int best =0;
        System.out.println("please enter the socre of studerts"+ns);
        for (int i=0;i<scoure.length;i++){
            scoure[i]=input.nextInt();
            if (scoure[i]>best){
                scoure[i]=best;
            }
        }
     for (int i=0;i<ns;i++){
        char grade;
        if (scoure[i]>=best-10){grade='A';}
         else if (scoure[i]>=best-20){grade='B';}
         else if (scoure[i]>=best-30){grade='C';}
         else if (scoure[i]>=best-40){grade='D';}
         else { grade ='E';}
         System.out.println("Students"+i+"the scoure"+scoure[i]+"and grade is "+grade);
     }
        System.out.println("");
    
}
}