package iterator;

public interface ApplicationCollection {

    void addApplication(Application application);

    void removeApplication(Application application);

    ApplicationIterator getIterator(ApplicationType type);
}
