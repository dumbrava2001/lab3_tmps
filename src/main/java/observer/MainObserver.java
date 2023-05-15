package observer;

public class MainObserver {

    public static void main(String[] args) {
        Subject redaction = new NewsLetter();

        Observer observer1 = new Subscriber("User1");
        Observer observer2 = new Subscriber("User2");
        Observer observer3 = new Subscriber("User3");

        observer1.setSubject(redaction);
        observer2.setSubject(redaction);
        observer3.setSubject(redaction);

        redaction.addObserver(observer1);
        redaction.addObserver(observer2);
        redaction.addObserver(observer3);

        redaction.postNews("News 1");

        System.out.println("Removing User 2");
        redaction.removeObserver(observer2);

        redaction.postNews("News 2");
    }
}
