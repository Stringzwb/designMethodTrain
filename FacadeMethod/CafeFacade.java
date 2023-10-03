package FacadeMethod;

import FacadeMethod.domain.BuyItem;
import FacadeMethod.domain.RentalPlace;

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
