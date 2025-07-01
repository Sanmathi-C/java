class equalif8{
    public static void main(String args[])
    {
        int num1=67;
        int num2=89;
        if(num1==num2)
        {
            System.out.println("both are equal");
        
        }
        else{
            System.out.println("not equal");
        }
    }
}
// same but input from user
import java.util.Scanner;
class eqaulif8{
    public static void main(String args[])
    {
        Scanner san = new Scanner(System.in);
        int num1=san.nextInt();
        int num2=san.nextInt();
        if(num1==num2)
        {
            System.out.println("both are equal");
        
        }
        else{
            System.out.println("not equal");
        }
    }

}