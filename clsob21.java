public class clsob21{
    int coffee=20;
    int tea=10;
    public static void main(String args[])
    {
        clsob21 server1=new clsob21();
        System.out.println(server1.tea);
    }
}
////same as for laptop
public class clsob21{
    String name="";
    String proc="";
    int ram=0;
    int price=0;
    public static void main(String args[])
    {
        clsob21 lap1=new clsob21();
        lap1.name="hp";
        lap1.proc="is5";
        lap1.ram=5;
        lap1.price=400000;
        clsob21 lap2=new clsob21();
        lap2.name="acer";
        lap2.proc="is7";
        lap2.ram=8;
        lap2.price=50000;
        System.out.println(lap1.ram);
    }

}