import java.util.Scanner;
public class Avg {
    public static void main(String[] args){
        System.out.println("1st code\n");

        copy();
        System.out.println("\n2nd code\n");
        rev();
        System.out.println("\n3rd code\n");
        pn();
    }
    static void avg(){
        int[] a={1,2,3,4,1};
        int i=0, sum=0;
        
        while(i<a.length){
                sum=sum+a[i];
                i++;
        }
        int avg=sum/a.length;
        System.out.println("avg of no.s"+avg);

        }
        static void copy(){
            int[] a={24,5,3,2,4};
             System.out.println("\nfirst arry");
            for(int j=0;j<=a.length-1;j++){
                System.out.print(a[j]);
            }
            int[] b=new int[a.length];
            int i=0;
            while(i<a.length){
                            b[i]=a[i];
                            i++;
                    }
                    System.out.println();
                    System.out.println("\nsecond arry");
                    
                    for(int j=0;j<=a.length-1;j++){
                       
                        System.out.print(b[j]);
                    }
                    
                    
        }
        static void rev(){
            int[] a={24,5,3,2,4};
                            for(int j=a.length-1;j>=0;j--){
                               
                                System.out.print(a[j]+":");
                            }
                            
                        }
   static void pn(){
            System.out.println("\ngiven arry :");
            int[] a={24,5,3,2,4,45,234};
            for(int j=0;j<a.length;j++){
                               
                System.out.print(a[j]+" ");
            }
            Scanner myObj = new Scanner(System.in);  
            System.out.println("\nEnter no");
                int num = myObj.nextInt();
            for(int j=0;j<a.length;j++){          
            if(num==a[j]){
                System.out.println(num+" is  found in  :"+j);
            break;}
            else if(num!=a[j]){
            System.out.println(num+" is not found in  ");
            break;}
        }
       
           
            
        
        
     }
}
