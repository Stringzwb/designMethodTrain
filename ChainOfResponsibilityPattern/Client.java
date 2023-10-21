package ChainOfResponsibilityPattern;

import ChainOfResponsibilityPattern.Handler.ConsumerHandler;
import ChainOfResponsibilityPattern.Handler.GroupHandler;
import ChainOfResponsibilityPattern.Handler.Handler;
import ChainOfResponsibilityPattern.Handler.SchoolHandler;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Handler> handlerList =new ArrayList<Handler>();
        SchoolHandler schoolHandler = new SchoolHandler(true);
        GroupHandler groupHandler = new GroupHandler(true);
        ConsumerHandler consumerHandler = new ConsumerHandler();
        consumerHandler.doVoter(true);
        consumerHandler.doVoter(true);
        consumerHandler.doVoter(false);
        handlerList.add(schoolHandler);
        handlerList.add(groupHandler);
        handlerList.add(consumerHandler);
        ResponsibilityChain responsibilityChain = new ResponsibilityChain((ArrayList<Handler>) handlerList);
        responsibilityChain.audit();
    }

}
