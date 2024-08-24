package JavaStreams;

public interface Car {
    
    
    int age = 7;
    String typeOfEngine = "PETROL";

    public void carStarts();
    void carMoves();

    default void carDrives() {
        System.out.println("The car drives");
    }
    
}
