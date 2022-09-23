import java.util.*;

public class BallScore 
{
    private ArrayList<MyObserver> ScoreList; 

    public BallScore()
    {
        this.ScoreList = new ArrayList<MyObserver>();
    
    }

    public void setScoreData(String sData)
    {
        ScoreEvent(new ScoreEvent(this, sData));
    }

    public void addMyListener(MyObserver o) {
        ScoreList.add(o);
    }

    public void removeMyListener(MyObserver o) {
        ScoreList.remove(o);
    }

    public void ScoreEvent(ScoreEvent e)
    {
        for (int i = 0; i < ScoreList.size(); i++)
        {
            MyObserver o = ScoreList.get(i);
            o.update(e); 
        }
    }

   

}
