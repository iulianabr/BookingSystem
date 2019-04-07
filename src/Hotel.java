import java.util.ArrayList;

public class Hotel {
    private long ID;
    Administrator admin;
    private ArrayList<Room> rooms;
    private ArrayList<String> reviews;
    public Hotel(long ID, Administrator admin, ArrayList<Room> rooms) {
        this.ID = ID;
        this.admin = admin;
        this.rooms = rooms;
        reviews = new ArrayList<>();
    }

    public void addReview(String text) {
        reviews.add(text);
    }

    ArrayList<Room> getRooms() {
        return rooms;
    }

    ArrayList<String> getReviews() {
        return reviews;
    }
}
