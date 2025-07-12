// class while19{
//     public static void main(String args[])
//     {
//         int j=1;
//         while(j<=2)
//         {
//             System.out.println(j);
//             j=j+1;
//         }
//     }
// }
////q2(generate a random number untill 5)
import java.util.Random;
class while19{
    public static void main(String args[])
    {
        Random san=new Random();
        int newnum=0;
        while(newnum!=5){
            newnum=san.nextInt(bound,11);
        
        System.out.println(newnum);
        }
    }
}