package iterator;

import java.util.ArrayList;
import java.util.List;

public class AppList implements ApplicationCollection{

    private List<Application> applicationList;

    public AppList() {
        applicationList = new ArrayList<>();
    }

    @Override
    public void addApplication(Application application) {
        applicationList.add(application);
    }

    @Override
    public void removeApplication(Application application) {
        applicationList.remove(application);
    }

    @Override
    public ApplicationIterator getIterator(ApplicationType type) {
        return new AppIterator(this.applicationList, type);
    }
}
