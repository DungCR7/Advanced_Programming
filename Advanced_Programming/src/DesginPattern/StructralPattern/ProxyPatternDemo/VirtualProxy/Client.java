package DesginPattern.StructralPattern.ProxyPatternDemo.VirtualProxy;

public class Client {
    public static void main(String[] args){
        // Khởi tạo proxy lúc này image chưa được load
        ProxyImage proxyImage = new ProxyImage("C:\\Windows\\bootload.png");

        // Khi cần show image, lúc này hình ảnh mới thật sự được load
        proxyImage.ShowImage();

        // Khi ta sử dụng lần tiếp theo, image không cần load lại nữa, chỉ lấy image được cache trong proxy ra sử dụng
        proxyImage.ShowImage();
    }
}
