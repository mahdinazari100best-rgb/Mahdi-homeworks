package printthenumbers.pkg7.pkg7;
public class PrinttheNumbers77 {
    public static void main(String[] args) {
      
       int [] count=new int [100];
       for (int i=0;i<100;i++){
          int num=(int)(Math.random()*100);  
          count[num]++;
           System.out.println(""+count[i]);
      
       }
    }}