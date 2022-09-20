package DesginPattern.StructralPattern.ProxyPatternDemo.ProxyRemoteLight;
//là một class service sẽ thực hiện các thao tác thực sự,
// là đối tượng chính mà proxy đại diện.
public class RemoteImpl implements Remote {
    @Override
    public void turnOn() {
        System.out.println("Turn on the light");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off the light");

    }
}
