//q1(given in and out)
import java.util.Scanner;
class codech15{
    public static void main(String args[])
    {
        Scanner san=new Scanner(System.in);
        System.out.println("enter the num1");
        int a=san.nextInt();
        System.out.println("enter the num2");
        int b=san.nextInt();
        for(int i=a;i<=b;i=i+1)
        {
            System.out.println(i);
        }
    }
}
//q2(print even no btwn 1to10)
class codech15{
    public static void main(String args[])
    {
        for(int i=1;i<=10;i=i+1)
        {
            if(i%2==0)
            {
                System.out.println("even no:"+i);
            }
        }
    }
}
//q3(count odd no btwn 1to10)
class codech15{
    public static void main(String args[])
    {
        int count=0;
        for(int i=1;i<=10;i++)
        {
            if(i%2!=0)
            {
               count++;
               

            }
        }
        System.out.println("oddcount:"+count);
    }
}
//q4(count  even no btwn 1 t0100)
class codech{
    public static void main(String args[])
    {
        int evencount=0;
        for(int i=1;i<=100;i=i+1)
        {
            if(i%2==0){
                evencount=evencount+1;
            }
        }
        System.out.println("even no count:"+evencount);
    }
}
//q5(divisible by both 3 and 5)
class codech15{
    public static void main(String rags[])
    {
        for(int i=1;i<=100;i=i+1)
        {
            if(i%3==0 && i%5==0)
            {
                System.out.println("divisible by both 3 and 5:"+i);
            }
        }
    }
}
            
        
