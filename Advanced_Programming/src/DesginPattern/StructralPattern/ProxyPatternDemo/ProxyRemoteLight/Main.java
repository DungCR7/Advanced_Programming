package DesginPattern.StructralPattern.ProxyPatternDemo.ProxyRemoteLight;
//Client sử dụng RealSubject nhưng thông qua LazyRemoteProxy
public class Main {
    public static void main(String[] args) {
        Remote remoteProxy = new LazyRemoteProxy();
        remoteProxy.turnOn();
        remoteProxy.turnOff();
    }
}
