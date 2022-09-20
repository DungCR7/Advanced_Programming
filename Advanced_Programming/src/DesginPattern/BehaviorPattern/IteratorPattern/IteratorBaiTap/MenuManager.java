package DesginPattern.BehaviorPattern.IteratorPattern.IteratorBaiTap;

import java.util.ArrayList;
import java.util.List;

public class MenuManager implements iMenu {
    List<Menu> menuList = new ArrayList<>();

    @Override
    public void addItem(Menu menu) {

        menuList.add(menu);
    }

    @Override
    public void removeIterator(Menu menu) {

        menuList.remove(menu);
    }

    @Override
    public Iterator getIterator() {

        return new MenuIterator();
    }
    private class MenuIterator implements Iterator{
        int index = 0;
        @Override
        public boolean hasNext() {
            if (index < menuList.size()){
                return true;
            }
            return false;
        }

        @Override
        public Menu next() {
            return menuList.get(index++);
        }
    }
}
