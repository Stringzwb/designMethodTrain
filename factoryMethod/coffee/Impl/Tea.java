package factoryMethod.coffee.Impl;

import factoryMethod.coffee.Coffee;

public class Tea implements Coffee{
        public Tea(){
            System.out.println("我是茶");
        }
        public static Tea createTea(){
            return new Tea();
        }
}
