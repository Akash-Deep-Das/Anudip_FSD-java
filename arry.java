import java.util.Random;  
public class arry { 
    public static void main(String[] args){
                        randm();
                        sum();
                    }
                    static void randm(){
                        Random num=new Random();
                        int ran=num.nextInt(4);
                        String[] student={"akash","ram","nalin","shubahm"};
                      
                        System.out.println("Student name"+'\n'+'\n');
                        System.out.println(student[ran]);
                    }
                    static void sum(){
                        int[] nums={1,2,3,4,5,6};
                        int sum=0;
                        for(int i=0;i<=nums.length;i++){
                            sum=sum+nums[i];
                        }
                        System.out.println(sum);
                    }
                    
    }


