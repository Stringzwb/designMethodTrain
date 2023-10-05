package FacadePattern;

import FacadePattern.domain.BuyItem;
import FacadePattern.domain.RentalPlace;

public class CafeFacade {

    public void doSomeThingInCafe(String type, String item){

        switch (type){
            case "购买商品":{
                new BuyItem(item);
                break;
            }
            case "租用场地":{
                new RentalPlace(item);
                break;
            }
        }
    }


}
