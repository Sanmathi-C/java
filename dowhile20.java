// class dowhile20{
//     public static void main(String args[])
//     {
//         int count=0;
//         do{
//             System.out.println("sanmathi");
//             count=count+1;
//         }
//         while(count<=2);
    
//         }
//     }
import java.util.Scanner;
class dowhile20{
    public static void main(String args[])
    {
        Scanner san=new Scanner(System.in);
        int count=0;
        do{
            System.out.println("enter the number >10:");
            count=san.nextInt();
        }
        while(count<10);
    }
}
