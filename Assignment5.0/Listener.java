public class Listener implements MyObserver
{
    @Override
    public void update(ScoreEvent event) 
    {
        System.out.println("Score Event : " + event.getScoreData());
    }
}
