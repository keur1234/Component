
import java.util.EventObject;

public class ScoreEvent extends EventObject
{
   private String scoreData;
   public ScoreEvent(Object o, String scoreData) 
   {
    super(o);
    this.scoreData = scoreData;
   }

    public String getScoreData() 
    {
        return scoreData;
    }
   
}
