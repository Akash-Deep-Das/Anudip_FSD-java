import java.util.Scanner;
public class greaterbtthree {   
   public static void main(String[] args) {
      
      greater();
      
}
static void greater(){
    Scanner reader = new Scanner(System.in);
      System.out.print("Enter three no.s: ");
      System.out.print("\n");
      int  a= reader.nextInt();
      int b= reader.nextInt();
      int c = reader.nextInt();
    
        if(a>=b && a>=c)
        System.out.println(a+"greater   :");
        elseif(b>=c && b>=a);
        System.out.println(b+"greater   :");
        elseif( c>=a && c>=b);
        System.out.println(c+"greater   :");
    

    
} 
} 
 


