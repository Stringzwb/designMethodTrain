package BridgePatterm;

import BridgePatterm.active.Activity;
import BridgePatterm.active.BoardGameActivity;
import BridgePatterm.active.QuestionAnsweringActivity;
import BridgePatterm.channel.CafeChannel;
import BridgePatterm.channel.ClubsChannel;

public class Client {
    public static void main(String[] args) {
        BoardGameActivity boardGameActivity = new BoardGameActivity();
        QuestionAnsweringActivity questionAnsweringActivity = new QuestionAnsweringActivity();
        CafeChannel cafeChannel = new CafeChannel(boardGameActivity);
        cafeChannel.signUp();
        cafeChannel.joinIn();
        ClubsChannel clubsChannel = new ClubsChannel(questionAnsweringActivity);
        cafeChannel.signUp();
        cafeChannel.joinIn();
    }
}
