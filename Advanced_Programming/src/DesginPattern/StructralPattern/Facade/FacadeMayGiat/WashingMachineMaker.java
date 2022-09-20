package DesginPattern.StructralPattern.Facade.FacadeMayGiat;

public class WashingMachineMaker {
    private static WashingMachineMaker instance;
    private Wash wash;
    private Rinse rinse;
    private Spin spin;
    private WashingMachineMaker(){
        wash = new Wash();
        rinse = new Rinse();
        spin = new Spin();
    }
    public static WashingMachineMaker getInstance(){
        if (instance == null){
            instance = new WashingMachineMaker();
        }
        return instance;
    }
    public void activityWash(){
        wash.activity();
    }
    public void activityRinse(){
        rinse.activity();
    }
    public void activitySpin(){
        spin.activity();
    }
}
