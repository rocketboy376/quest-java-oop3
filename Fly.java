public interface Fly {

    void takeOff();

    // takes an integer meters as an argument, and returns an integer
    int descend(int meters);

    // takes an integer meters as an argument, and returns an integer
    int ascend(int meters);
        
    void land();

    default void glide() {
        System.out.println("Glides into the air.");
    }
}