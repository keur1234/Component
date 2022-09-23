import java.util.EventListener;

public interface MyObserver extends EventListener{
    public void update(ScoreEvent event);
}
