package DesginPattern.BehaviorPattern.IteratorPattern.IteratorBaiTap;

public class Menu {
    private String name;
    private String url;
    public Menu(String name,String url){
        this.name = name;
        this.url = url;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
