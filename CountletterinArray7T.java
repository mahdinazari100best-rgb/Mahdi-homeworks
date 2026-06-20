package countletterinarray.pkg7.t;
public class CountletterinArray7T {
    public static void main(String[] args) {
    
     char [] chars=new char [100];
     for (int i=0;i<chars.length;i++){
         chars[i]=(char)('a'+(int )(Math.random()*26));  }
        System.out.println(" random value");
    
        for (int i=0;i<chars.length;i++){
            System.out.println(" "+chars[i]); 
        if ((i+1)%20==0)System.out.println(""); }
        
        int [] count=new int [26];
        for (int i=0;i<chars.length;i++){
         count[chars[i]-'a']++;}
            System.out.println("cout of letters ");
            
            for (int i=0;i<count.length;i++){
                System.out.println(""+(char)('a'+i) +" : "+ count[i]+"");
                if ((i+1)%8==0)System.out.println("");
            }
        }
    }
 
