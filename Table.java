import java.util.Scanner;
public class Table {
   public static void main(String[] args) {
      
      table();
      
}
static void table(){
    Scanner reader = new Scanner(System.in);
      System.out.print("Enter an integer: ");
      int number = reader.nextInt();
      System.out.println("Table of the given no."+number);
      int table;
       for(int i=1;i<=10;i++){
        table=number*i;
        System.out.println(number+"*"+i+"="+table);
 }

}
}