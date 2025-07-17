public class foreachloop27{
    public static void main(String args[])
    {
        int num[]={4,7,9,4};
        for(int i=0;i<4;i++)
        {
            System.out.println(num[i]);
        }
        for(int var:num)
        {
            System.out.println(var);
        }
    }
}