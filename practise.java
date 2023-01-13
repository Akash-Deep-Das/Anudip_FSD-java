import java.util.random;
public class practise {
    public static void main(String a[]){
       T1();
       T2();
       
    }
       static void T1(){
        System.out.println("First Programms"+'\n');
        int n=5 ,r=1;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(r++);
            }
            System.out.println();
        }}
                    
                

                static void T2(){
                    System.out.println("Second Programms"+'\n');
                    int n=5 ,r=6;
                    for(int i=1;i<=5;i++){
                        for(int j=5;j>=i;j--){
                            System.out.print(r-i);
                        }
                        System.out.println();
                    }
                }
                static void student(){
                    
                        Random num=new Random();
                        Double ran=num.nextDouble(10);
                        String[] student={"akash","ram","nalin","shubahm"};
                        
                        System.out.println(student[ran]);
                    }
                
    }
            
