import com.lambton.magicalcardgame.Magiccardgamemodel;

import java.util.Scanner;

public class C0748584w2019midtermtestmad3463 {

    public static void main(String [] args)
    {
        Magiccardgamemodel obj= new Magiccardgamemodel();

        System.out.println("please enter the card");
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        obj.display();

        System.out.println("please enter the column from which the card has been choose" );

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

    }
}
