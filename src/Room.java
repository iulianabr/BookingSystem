public class Room {
    private int number;
    private boolean available;
    private int beds;
    private String description;

    public Room(int number, boolean available, int beds, String description) {
        this.number = number;
        this.available = available;
        this.beds = beds;
        this.description = description;
    }

    boolean isAvailable() {
        return available;
    }

    int getBedsNumber() {
        return beds;
    }

    void setBedsNumber(int beds) {
        this.beds = beds;
    }

    String getDescription() {
        return description;
    }

    void updateDescription(String description) {
        this.description = description;
    }
}
