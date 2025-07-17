public class return24{
    int getsoap(int money)
    {
        int soap_price=15;
        int rem=20-15;
        return rem;
    }
    public static void main(String args[])
    {
        return24 ob1=new return24();
        int remainder=ob1.getsoap(20);
        // System.out.println(remainder);

    }
}
////q2
public class return24{
    int sum(int a,int b)
    {
        int c=a+b;
        return c;
    }
    public static void main(String args[])
    {
        return24 ob1=new return24();
        int sum=ob1.sum(78,56);
        System.out.println(sum);

    }
}
////q3
public class return24{
    String getname()
    {
        return "sanmathi";
    }
    long getphone()
    {

        return 7812838573L;
    }
    public static void main(String args[])
    {
        return24 ob1=new return24();
        String name=ob1.getname();
        long phone=ob1.getphone();
        System.out.println(name);
        System.out.println(phone);
    }
}
