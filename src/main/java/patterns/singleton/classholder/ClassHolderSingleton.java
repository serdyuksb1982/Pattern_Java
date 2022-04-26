package patterns.singleton.classholder;

public class ClassHolderSingleton {
    private ClassHolderSingleton() {

    }

    private static class HolderSingleton {
        public static final ClassHolderSingleton INSTANCE = new ClassHolderSingleton ();
    }

    public static ClassHolderSingleton getInstance() {
        return HolderSingleton.INSTANCE;
    }
}
