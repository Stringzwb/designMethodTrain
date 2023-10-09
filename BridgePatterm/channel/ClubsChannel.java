package BridgePatterm.channel;

import BridgePatterm.active.Activity;

public class ClubsChannel implements Channel{

    private final Activity activity;

    public ClubsChannel(Activity activity){
        this.activity = activity;
    }
    @Override
    public void signUp() {
        System.out.println("报名参加："+activity.doActive());
    }

    @Override
    public void joinIn() {
        System.out.println("参加："+activity.doActive());
        System.out.println("赠送一个奖品");
    }


}
