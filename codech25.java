// ////q1
import java.util.Scanner;
public class codech25{
    void evenorodd(int number)
    {
        if(number%2==0)
        {
            System.out.println("even number");
        }
        else
        {
            System.out.println("odd number");
        }

    }
    public static void main(String args[])
    {
        Scanner san=new Scanner(System.in);
        int number=san.nextInt();
        codech25 ob1=new codech25();
        ob1.evenorodd(number);

    }
}
// ////q2
import java.util.Scanner;
public class codech25{
    void passorfail(int number)
    {
        if(number<35)
        {
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
    }
    public static void main(String args[])
    {
        Scanner san=new Scanner(System.in);
        int number=san.nextInt();
        codech25 ob1=new codech25();
        ob1.passorfail(number);
        
    }

}