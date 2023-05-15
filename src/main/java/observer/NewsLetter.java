package observer;

import java.util.ArrayList;
import java.util.List;

public class NewsLetter implements Subject {

    private List<Observer> subscribers = new ArrayList<>();

    private String news;

    @Override
    public void postNews(String news) {
        this.news = news;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer subscriber : subscribers) {
            subscriber.update();
        }
    }

    @Override
    public String getUpdatedData() {
        return this.news;
    }
}
