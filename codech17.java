//q1(input for 5 no using array and for loop)
import java.util.Scanner;
class codech17{
    public static void main(String args[])
    {
        int[] mark=new int[5];
        Scanner san=new Scanner(System.in);
        for(int i=1;i<=4;i=i+1)
        {
            mark[i]=san.nextInt();
        }
        
        System.out.println(mark[i]);
        
    }
}
//q2(print 10 no using array and for loop)
class codech17{
    public static void main(String args[])
{
    int[]num=new int[10];
    for(int i=1;i<=10;i=i+1){
        System.out.println(i);
    }
}}
//q3(print 2 table using for loop)
class codech17{
    public static void main(String args[])
    {
        for(int i=1;i<=10;i=i+1){
            System.out.println(i+"x2="+i*2);
        }

    }
}
//(get input for size of array
//get input for each element
//finf and middle no)
import java.util.Scanner;
class codech17{
    public static void main(String args[])
    {
        Scanner san=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int num=san.nextInt();
        int[]array=new int[num];
        System.out.println("enter"+num+"elemnts");
        for(int i=0;i<num;i=i+1)
        {
            System.out.println("elements"+ (i+1) +":");
            array[i]=san.nextInt();
        }

    }
}