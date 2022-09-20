package DesginPattern.StructralPattern.ProxyPatternDemo.ProxyRemoteLight;
//subject,xác định giao diện chung cho RemoteImp và LazyRemoteProxy
//để LazyRemoteProxy có thể được sử dụng bất cứ nơi nào mà RealSubject mong đợi
public interface Remote {
    void turnOn();
    void turnOff();
}
