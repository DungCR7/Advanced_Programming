package DesginPattern.StructralPattern.Facade.FacadeMayGiat;

public class Main {
    public static void main(String[] args) {
        WashingMachineMaker artist = WashingMachineMaker.getInstance();
        artist.activityWash();
        artist.activityRinse();
        artist.activitySpin();
    }
}
