package DesginPattern.BehaviorPattern.ObserverPattern.observer;

public class FacebookObserver extends EventObserver{
    public FacebookObserver(Video video) {
        this.video = video;
        this.video.attach(this);
    }

    @Override
    public void update() {

        System.out.println("Facebook: State change to " + this.video.getState());
    }
}
