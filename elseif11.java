//// i can get video game if i score>35
//// i can get iphonr if i score>60
//// i can get macbook if i score>90
import java.util.Scanner;
class elseif11{
    public static void main(String args[]){
        Scanner san=new Scanner(System.in);
        System.out.println("enter the score");
        int score=san.nextInt();
        if(score>35 && score<60)
        {
            System.out.println("video game");

        }
        else if(score>60 && score<90)
        {
            System.out.println("iphone");

        }
        else if(score>90)
        {
            System.out.println("macbook");
        }

        }
}

    
