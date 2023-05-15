package observer;

public interface Subject {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

    String getUpdatedData();

    void postNews(String news);
}
