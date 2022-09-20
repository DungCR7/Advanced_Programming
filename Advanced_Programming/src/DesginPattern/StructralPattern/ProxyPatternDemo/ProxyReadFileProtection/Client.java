package DesginPattern.StructralPattern.ProxyPatternDemo.ProxyReadFileProtection;

public class Client {
    public static void main(String[] args) {
        UserProxy userProxy1 = new UserProxy("BBB ","admin");
        System.out.println(userProxy1.readFile());
        // BBB readed
        UserProxy userProxy2 = new UserProxy("Member ","member");
        System.out.println(userProxy2.readFile());
        //you can't read file
    }
}
