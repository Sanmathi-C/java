public class funcpara23
{
    void chocolate(int money)
    {
        System.out.println(money);
        System.out.println("chocolate purchase");
    }
    void biscuit(int money)
    {
         System.out.println(money);
        System.out.println("biscuit purchased");
    }
    public static void main(String args[])
    {
        funcpara23 san=new funcpara23();
        san.chocolate(23);
        san.biscuit(23);
    }


}

/////q2 exercise
public class funcpara23
{
    void sum(int a,int b)
    {
        System.out.println(a+b);
    }
    void sub(int a,int b)
    {
        System.out.println(a-b);
    }
    void mul(int a,int b)
    {
        System.out.println(a*b);
    }
    void div(int a,int b)
    {
        System.out.println(a/b);
    }
    public static void main(String args[])
    {
        funcpara23 san=new funcpara23();
        san.sum(6,9);
        san.sub(4,8);
        san.mul(2,9);
        san.div(5,9);
    }
}