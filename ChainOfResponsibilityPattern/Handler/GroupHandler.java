package ChainOfResponsibilityPattern.Handler;

public class GroupHandler implements Handler{
    private final boolean result;

    public GroupHandler(boolean bool){
        this.result = bool;

    }
    @Override
    public boolean doHandler() {
        if(this.result){
            System.out.println("讨论通过");
        }else{
            System.out.println("讨论不通过");
        }
        return this.result;
    }
}
