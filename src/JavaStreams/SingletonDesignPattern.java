package JavaStreams;

public class SingletonDesignPattern {

    private static SingletonDesignPattern instance;
    private SingletonDesignPattern() {

     }
     /*synchronized public static SingletonDesignPattern getInstance() {

        if(instance == null) {
            instance = new SingletonDesignPattern();
        }
        return instance;
     }*/

    public static SingletonDesignPattern getInstance() {
        if(instance == null) {
            synchronized (SingletonDesignPattern.class) {
                instance = new SingletonDesignPattern();
            }
        }
        return instance;
    }
}
