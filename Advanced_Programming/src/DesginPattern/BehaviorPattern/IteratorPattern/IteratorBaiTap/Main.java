package DesginPattern.BehaviorPattern.IteratorPattern.IteratorBaiTap;

public class Main  {
    public static void main(String[] args) {
        MenuManager manager = new MenuManager();
        manager.addItem(new Menu("Home","/home"));
        manager.addItem(new Menu("Shop","/shop"));
        manager.addItem(new Menu("About Us","/about us"));
        manager.addItem(new Menu("Contact","/contact"));
        manager.addItem(new Menu("News","/news"));

        Iterator menuIterator = manager.getIterator();
        while (menuIterator.hasNext()){
            System.out.println(menuIterator.next());
        }
    }
}
