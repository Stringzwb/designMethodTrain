package factoryMethod.coffee.Impl;

import factoryMethod.coffee.Coffee;

public class TeaCoffee implements Coffee{
        public TeaCoffee(){
            System.out.println("我是茶咖啡");
        }
        public static TeaCoffee createTeaCoffee(){
            return new TeaCoffee();
        }
}
