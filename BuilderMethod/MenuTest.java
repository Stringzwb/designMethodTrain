package BuilderMethod;

import BuilderMethod.Menus.Menus;

public class MenuTest {
    public static void main(String[] args) {
        Menus m = new Menus();
        System.out.println(Menus.getMilkTea().toString());
        System.out.println(Menus.getMeishi().toString());
        System.out.println(Menus.getJuice().toString());
    }
}
