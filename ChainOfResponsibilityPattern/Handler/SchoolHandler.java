package ChainOfResponsibilityPattern.Handler;

public class SchoolHandler implements Handler{

    private final boolean result;

    public SchoolHandler(boolean bool){
        this.result = bool;
    }
    @Override
    public boolean doHandler(){
        if (this.result) {
            System.out.println("校领导已批注");
        } else {
            System.out.println("校领导驳回");
        }
        return this.result;
    }
}
