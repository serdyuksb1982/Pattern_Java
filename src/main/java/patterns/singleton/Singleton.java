package patterns.singleton;

public class Singleton {
    private Singleton() {}
    private static Singleton singleton;

    public static Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
