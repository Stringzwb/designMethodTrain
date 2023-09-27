package PrototypeMethod;

import PrototypeMethod.concretePrototype.ConcretePrototypeMenus;

import java.util.ArrayList;
import java.util.List;

public class clientTest {
    public static void main(String[] args) {
        // 初始化原始对象
        List<String> menuItems = new ArrayList<>();
        menuItems.add("牛奶");
        menuItems.add("咖啡");
        menuItems.add("茶");
        ConcretePrototypeMenus menus = new ConcretePrototypeMenus("菜单A", menuItems);

        // 创建浅拷贝和深拷贝对象
        ConcretePrototypeMenus menus1 = menus.shallowClone();
        ConcretePrototypeMenus menus2 = menus.DeapClone();

        // 输出原始对象和拷贝对象，确认它们是不同的实例但有相同的内容
        System.out.println("Before modification:");
        System.out.println("Original: " + menus);
        System.out.println("Shallow Clone: " + menus1);
        System.out.println("Deep Clone: " + menus2);

        // 修改原始对象、浅拷贝和深拷贝对象
        menuItems.set(0, "果汁");
        menus1.setDate("菜单B");
        List<String> deepCloneItems = menus2.getItems();
        deepCloneItems.set(0, "面包");

        // 输出修改后的对象，检查如何影响其他对象
        System.out.println("\nAfter modification:");
        System.out.println("Original: " + menus);
        System.out.println("Shallow Clone: " + menus1);
        System.out.println("Deep Clone: " + menus2);
    }
}
