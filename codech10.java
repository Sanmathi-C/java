////q1(input for mark)
import java.util.Scanner;
class codech10{
    public static void main(String args[])
    {
        Scanner san=new Scanner(System.in);
        System.out.println("enter value for mark");
        int mark=san.nextInt();
        if(mark>=35)
        {
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
    }
}
////q2(input for income)
import java.util.Scanner;
class codech10{
    public static void main(String args[])
    {
        Scanner san=new Scanner(System.in);
        System.out.println("enter the income");
        int income=san.nextInt();
        if(income>7000){
            System.out.println("Scholarship is available");
        }
        else{
            System.out.println("not eligible for scholarship");
        }
    }
}
////q3 (divisible by 3 and 5)
import java.util.Scanner;
class codech10{
    public static void main(String args[])
    {
        Scanner san=new Scanner(System.in);
        System.out.println("enter the number");
        int num=san.nextInt();
        if(num%3==0 && num%5==0)
        {
            System.out.println("divisible by both 3 and 5");

        }
        else{
            System.out.println("not divisible");
        }
    }
}
//q4(even or odd)
import java.util.Scanner;
class codech10{
    public static void main(String args[])
    {
        Scanner san=new Scanner(System.in);
        System.out.println("enter the no");
        int num=san.nextInt();
        if(num%2==0)
        {
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}