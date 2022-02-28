package patterns.singleton;

public class Singleton {
    /**
     *    Singleton:
     * ---------------------------
     * - instance: Singleton;
     * ---------------------------
     * - Singleton();
     * + getInstance(): Singleton
     * ---------------------------
     */
    private Singleton() {}
    private static volatile Singleton singleton;

    public static Singleton getSingleton() {

        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }

        }
        return singleton;
    }
}
