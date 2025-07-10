////normal ternary
class ternary13{
    public static void main(String args[])
    {
        boolean rain=true;
        String result=rain? "take an umbrella" : "enjoy the sunlight";
        System.out.println(result);
    }
}
/////which number is greater using ternary
import java.util.Scanner;
class ternary13{
    public static void main(String args[])
    {
        Scanner san=new Scanner(System.in);
        System.out.println("enter the num1");
        int num1=san.nextInt();
        System.out.println("enter the num2");
        int num2=san.nextInt();
        int result=(num1>num2)?num1:num2;
        System.out.println("greater number is:"+result);
    }
}