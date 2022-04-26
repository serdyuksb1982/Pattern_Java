package patterns.singleton.DoubleChecked;

public class DoubleCheckedSingleton {
    /**
     *    Singleton:
     * ---------------------------
     * - instance: Singleton;
     * ---------------------------
     * - Singleton();
     * + getInstance(): Singleton
     * ---------------------------
     */
    private DoubleCheckedSingleton() {

    }
    private static volatile DoubleCheckedSingleton instance;

    public static DoubleCheckedSingleton getInstance() {

        if (instance == null) {
            synchronized (DoubleCheckedSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedSingleton ();
                }
            }
        }
        return instance;
    }
}
