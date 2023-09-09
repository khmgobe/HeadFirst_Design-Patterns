package designPattern.IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * 루의 구현.
 */
public class PancakeHouseMenu {
    List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        /**
         * 메뉴 항목 저장, 각 메뉴는 생성자 내에서 ArrayList로 추가된다.
         */
        menuItems = new ArrayList<MenuItem>();

        addItem("K&B 팬케이크 세트",
                "스크램블 에그와 토스트가 곁들여진 팬케이크",
                true,
                2.99);

        addItem("레귤러 팬케이크 세트",
                "달걀 프라이와 소시지가 곁들여진 팬케이크",
                false, 2.99);
        addItem("블루베리 팬케이크",
                "신선한 블루베리와 블루베리 시럽으로 만든 팬케이크",
        true, 3.49);
        addItem("와플",
                "취향에 따라 블루베리나 딸기를 얹을 수 있는 와플",
                true,
                3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        /**
         * 메뉴 항목을 추가하고 싶다면 필요 인자를 전달하여 객체 생성 후 ArrayList에 추가 할 것.
         */
        MenuItem menuitem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuitem);
    }
    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }


}
