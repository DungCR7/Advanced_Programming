package DesginPattern.BehaviorPattern.ObserverPattern.noObserver;

public class EmailNotify {
    private Video video;
    public EmailNotify(Video video) {

        this.video = video;
    }
    public void notifyMessage() {

        System.out.println("Email: State change to " + this.video.getState());
    }
}
