
public class function {
    public static void main(String []arg){
        sayHello();
        int sum1=sumoFTwoInt(5,7);
        System.out.println(sum1);

        System.out.println(sumoFTwoInt(18,7));
        System.out.println(sum1);

        System.out.println(sumoFTwoInt(4,9));
        Square(a);

    }
    static void sayHello(){
        System.out.println("hi There !");
    }
    static int sumoFTwoInt(int num1,int num2){
        int numOne=num1;
        int numTwo=num2;
        int sum=numOne+numTwo;
    
        System.out.println(sum);

    }
}
//squaring  of two no.s
static int Square(int a){
    int square=a*a;
    return square;
}