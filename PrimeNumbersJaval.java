package prime.numbersjaval.pkg7.pkg6;
public class PrimeNumbersJaval76 {
    public static void main(String[] args) {
     final int NUMBER_OF_PRIME =50; 
     int [] prime=new int [ NUMBER_OF_PRIME];
     int count=0 ;
     int number =2;
        System.out.println("the first prime of number 50");
        while (count < NUMBER_OF_PRIME){
             boolean  isprime=  true ;
        
     for (int i=0;i<count && prime[i]<Math.sqrt(number);i++){
         if (number%prime[i]==0){
             isprime=false;
             break;
         }
     }
           
     if (isprime){
       prime[count ]=number; 
       count++;
    
     if (count %NUMBER_OF_PRIME==0){
         System.out.println("the number is this "+number);
     }
     else {
         System.out.println("the number is this "+number);
     }
     number++;
    }
        }}
  
}