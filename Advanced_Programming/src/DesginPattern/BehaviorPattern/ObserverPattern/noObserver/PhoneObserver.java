package DesginPattern.BehaviorPattern.ObserverPattern.noObserver;

public class PhoneObserver {
    private Video video;
    public PhoneObserver(Video video) {

        this.video = video;
    }
    public void notifyMessage() {

        System.out.println("Phone: State change to " + this.video.getState());
    }
}
