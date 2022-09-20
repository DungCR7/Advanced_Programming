package DesginPattern.BehaviorPattern.ObserverPattern.observer;

public class EmailObserver extends EventObserver{
    public EmailObserver(Video video) {
        this.video = video;
        this.video.attach(this);
    }
    @Override
    public void update() {

        System.out.println("Email: State changed to " + this.video.getState());
    }


}
