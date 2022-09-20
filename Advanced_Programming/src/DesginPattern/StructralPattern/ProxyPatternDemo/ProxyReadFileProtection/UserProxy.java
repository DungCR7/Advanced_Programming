package DesginPattern.StructralPattern.ProxyPatternDemo.ProxyReadFileProtection;

public class UserProxy implements ReadFile{
    private String name;
    private String role;
    private User user;
    public UserProxy(String name,String role){
        this.name = name;
        this.role = role;
    }
    @Override
    public String readFile() {
        if (this.role.toLowerCase().equals("admin")){
            user = new User(this.name);
            return user.readFile();
        }
        return "You can't read file";
    };
}
