package singlationPatterm;

public class HangrySinglation {
    private static final HangrySinglation hangrySinglation;
    static{
        hangrySinglation = new HangrySinglation();
    }
    private HangrySinglation(){};

    public HangrySinglation getInstance(){
        return hangrySinglation;
    }
}
