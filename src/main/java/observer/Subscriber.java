package observer;

public class Subscriber implements Observer {

    private Subject subject;

    private String content;

    private final String username;

    public Subscriber(String username) {
        this.username = username;
    }


    @Override
    public void update() {
        this.content = subject.getUpdatedData();
        System.out.println(username + " received news!");
    }

    @Override
    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
