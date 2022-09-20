package DesginPattern.BehaviorPattern.ObserverPattern.noObserver;

public class Video {
    private String title;
    int state;

    public int getState() {

        return state;
    }

    public void setState(int state) {
        this.state = state;
        EmailNotify emailNotify = new EmailNotify(this);
        PhoneObserver phoneObserver = new PhoneObserver(this);
        emailNotify.notifyMessage();
        phoneObserver.notifyMessage();
    }
}
