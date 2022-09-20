package DesginPattern.StructralPattern.ProxyPatternDemo.ProxyReadFileProtection;

public class User implements ReadFile{
    private String name;
    private String role ="admin";
    public User(String name){
        this.name = name;
    }
    @Override
    public String readFile() {
        return name + "readed";
    }
}
