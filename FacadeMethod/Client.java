package FacadeMethod;

public class Client {
    public static void main(String[] args) {
        CafeFacade cf = new CafeFacade();
        cf.doSomeThingInCafe("购买商品","milk");
        cf.doSomeThingInCafe("购买商品","coffee");
        cf.doSomeThingInCafe("购买商品","juice");
        cf.doSomeThingInCafe("租用场地","");
    }

}
