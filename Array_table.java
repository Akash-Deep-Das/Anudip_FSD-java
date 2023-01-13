import java.io.*;
public class Array_table{
 public static void main(String[] args){
   table();
   sqare();
   
}

static void table(){
    //make a method for printing multiplication table of a number adn number comes from an array
//int[] a={3,5,6,7};
    int[] table={3,5,6,7};
    System.out.println('\n');
    for(int i=0;i<=table.length;i++){
        for(int j=1;j<=10;j++){
            System.out.println(table[i]+"X"+j+"="+table[i]*j);
        }
        System.out.println('\n');
    }
    
   // wap to make a arry of number ans store sqyuare of all ary values in anothr arry
}
static void sqare(){
    int[] a = {1, 2, 3, 4, 5};
int[] b = new int[a.length];

for (int i = 0; i < a.length; i++) {
    b[i] = a[i]*a[i];
}for (int j = 0; j < a.length; j++) {
    System.out.println(b[j]+" ");
}

    }
}
