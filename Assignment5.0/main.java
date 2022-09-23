
import java.util.*;

public class main {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        String TempScore = " ";

        BallScore BallScore = new BallScore();
        MyObserver user1 = new Listener();
        Listener user2 = new Listener();
        BallScore.addMyListener(user1);
        BallScore.addMyListener(user2);

        while (true)
        {
            TempScore = " ";
            System.out.print("\nEnter score :" + TempScore);
            TempScore = input.nextLine();
            if (TempScore == "") break;
            BallScore.setScoreData(TempScore);
            
        }
        input.close(); 
        System.out.print("It's time to sleep");

    }
}