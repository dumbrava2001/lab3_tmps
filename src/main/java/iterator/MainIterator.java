package iterator;

import java.util.List;

public class MainIterator {

    public static void main(String[] args) {
        var applicationList = createApplicationList();
        AppList appList = new AppList();
        for (Application application : applicationList){
            appList.addApplication(application);
        }

        System.out.println("Get only games");
        ApplicationIterator gameIterator = appList.getIterator(ApplicationType.GAME);
        while (gameIterator.hasNext()){
            System.out.println(gameIterator.next());
        }

        System.out.println("Get only productivity");
        ApplicationIterator productivityIterator = appList.getIterator(ApplicationType.PRODUCTIVITY);
        while (productivityIterator.hasNext()){
            System.out.println(productivityIterator.next());
        }

    }

    public static List<Application> createApplicationList(){
        return List.of(
                new Application("Skype", "Microsoft", ApplicationType.PRODUCTIVITY),
                new Application("Doom", "Bethesda", ApplicationType.GAME),
                new Application("SQL Server", "Microsoft", ApplicationType.WINDOWS),
                new Application("Cortana", "Microsoft", ApplicationType.WINDOWS),
                new Application("IDEA", "JetBrains", ApplicationType.PRODUCTIVITY),
                new Application("Rider", "JetBrains", ApplicationType.PRODUCTIVITY),
                new Application("Data Grip", "JetBrains", ApplicationType.PRODUCTIVITY),
                new Application("Elden Ring", "From Software", ApplicationType.GAME),
                new Application("God of War", "Sony", ApplicationType.GAME)
        );
    }
}
