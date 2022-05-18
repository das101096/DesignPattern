package BehavioralPattern.Mediator;

public class Main {
    public static void main(String[] args) {
        Mediator kakaoTalk = new KaKaoTalk();
        Colleague cA = new KaKaoTalkColleague();
        Colleague cB = new KaKaoTalkColleague();
        Colleague cC = new KaKaoTalkColleague();

        cA.setMediator(kakaoTalk);
        cB.setMediator(kakaoTalk);
        cC.setMediator(kakaoTalk);

        cA.sendMsg("메세지");
    }
}
