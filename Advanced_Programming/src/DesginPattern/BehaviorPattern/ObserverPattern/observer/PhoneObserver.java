package DesginPattern.BehaviorPattern.ObserverPattern.observer;

public class PhoneObserver extends EventObserver{
    public PhoneObserver(Video video) {
        this.video = video;
        this.video.attach(this);
    }

    @Override
    public void update() {

        System.out.println("Phone: State change to " + this.video.getState());
    }
}
