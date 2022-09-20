package DesginPattern.StructralPattern.ProxyPatternDemo.ProxyRemoteLight;
//duy trì tham chiesu đến RealSubject để Proxy có thể truy cập nó
//Nó cũng thực hiện các giao diện tương tự như RealSubject
// để Proxy có thể được sử dụng thay cho RealSubject.
//Proxy điều khiển truy cập vào RealSubject và có thể tạo hoặc xóa đối tượng này.
public class LazyRemoteProxy implements Remote{
    private RemoteImpl remote = null;
    @Override
    public void turnOn() {
        System.out.println("Wrapee "+this.remote);
        if (this.remote ==null){
            this.remote = new RemoteImpl();
        }
        this.remote.turnOn();
    }

    @Override
    public void turnOff() {
        System.out.println("Wrapee "+this.remote);
        if (this.remote ==null){
            this.remote = new RemoteImpl();
        }
        this.remote.turnOff();
    }
}
