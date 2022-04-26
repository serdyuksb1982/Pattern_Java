package patterns.singleton.simplesolution;

public class SimpleSolutionSingleton {
    private static final SimpleSolutionSingleton INSTANCE = new SimpleSolutionSingleton ();

    private SimpleSolutionSingleton() {

    }

    public static SimpleSolutionSingleton getInstance() {
        return INSTANCE;
    }
}
