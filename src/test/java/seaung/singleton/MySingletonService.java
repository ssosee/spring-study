package seaung.singleton;

public class MySingletonService {

    private static final MySingletonService instance = new MySingletonService();

    public static MySingletonService getInstance() {
        return instance;
    }

    private MySingletonService() {

    }

    public void logic() {
        System.out.println("MySingletonService.logic");
    }
}
