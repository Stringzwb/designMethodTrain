package FacadePattern.domain;

public class BuyItem {
    public BuyItem(String item) {
        switch (item){
            case "coffee":{
                System.out.println("购买咖啡");
                break;
            }
            case "milk":{
                System.out.println("购买牛奶");
                break;
            }
            case "juice":{
                System.out.println("购买果汁");
                break;
            }
            default:
                System.out.println("购买其他饮品");
                break;

        }
    }
}
