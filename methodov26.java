public class methodov26{
    void sum(int a,int b)
    {
        System.out.println(a+b);
    }
    void sum(int a,int b,int c)
    {
        System.out.println(a*b*c);
    }
    public static void main(String args[])
    {
        methodov26 ob1=new methodov26();
        ob1.sum(8,9);
        ob1.sum(8,9,5);

    }
}