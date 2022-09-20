package DesginPattern.BehaviorPattern.ObserverPattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Video implements IVideo {
    List<EventObserver> observerList = new ArrayList<>();
    int state;


        public int getState() {

        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyMessage();
    }

    @Override
    public void attach(EventObserver events) {

        observerList.add(events);
    }

    @Override
    public void detach(EventObserver events) {

        observerList.remove(events);
    }

    @Override
    public void notifyMessage() {
        for (EventObserver event : observerList) {
            event.update();
        }
    }
}
