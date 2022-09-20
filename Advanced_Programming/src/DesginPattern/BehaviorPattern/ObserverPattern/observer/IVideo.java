package DesginPattern.BehaviorPattern.ObserverPattern.observer;

public interface IVideo {
    void attach(EventObserver events);
    void detach(EventObserver events);
    void notifyMessage();
}
