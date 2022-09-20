package DesginPattern.BehaviorPattern.ObserverPattern.observer;

public class App {
    public static void main(String[] args) {
        Video video = new Video();
        EmailObserver email = new EmailObserver(video);
        PhoneObserver phone = new PhoneObserver(video);
        FacebookObserver fb = new FacebookObserver(video);
        System.out.println("----- Send all------");
        video.setState(10);
        System.out.println("----- Detach Phone -----");
        video.detach(phone);
        System.out.println("-----Remove PhoneObserver-----");
        video.setState(15);
    }
}
