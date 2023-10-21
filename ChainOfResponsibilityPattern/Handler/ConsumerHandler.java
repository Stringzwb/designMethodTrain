package ChainOfResponsibilityPattern.Handler;

public class ConsumerHandler implements Handler{

    private Integer agree = 0;
    private Integer disagree = 0;


    public void doVoter(boolean bool){
        if(bool){
            System.out.println("顾客支持");
            agree++;
        }else{
            System.out.println("顾客不 支持");
            disagree++;
        }
    }

    public boolean doHandler(){
        System.out.println("支持人数"+agree);
        if (agree>disagree) {
            System.out.println("顾客多数支持");
            return true;
        } else {
            System.out.println("顾客多数不支持");
            return false;
        }
    }

}
