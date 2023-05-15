package iterator;

import java.util.List;

class AppIterator implements ApplicationIterator{

    private final List<Application> applicationList;
    private int index;
    private final ApplicationType type;

    public AppIterator(List<Application> applicationList, ApplicationType type) {
        this.applicationList = applicationList;
        this.type = type;
    }

    @Override
    public boolean hasNext() {
        while (index < applicationList.size()) {
            Application currentApplication = applicationList.get(index);
            if (currentApplication.getType() == type){
                return true;
            }
            index++;
        }
        return false;
    }

    @Override
    public Application next() {
        Application application = applicationList.get(index);
        index++;
        return application;
    }
}
