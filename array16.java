class array16{
    public static void main(String args[])
    {
        String[] playlist=new String[3];
        playlist[0]="song1";
        System.out.println(playlist[0]);
        playlist[1]="song2";
        System.out.println(playlist[1]);
        playlist[2]="song3";
        System.out.println(playlist[2]);
        
    }
}
////get input for 5 no and add it
import java.util.Scanner;
class array16{
    public static void main(String args[])
    {
        int[] score=new int[5];
        Scanner san=new Scanner(System.in);
        score[0]=san.nextInt();
        score[1]=san.nextInt();
        score[2]=san.nextInt();
        score[3]=san.nextInt();
        score[4]=san.nextInt();
        System.out.println(score[0]+score[1]+score[2]+score[3]+score[4]);

    }

}