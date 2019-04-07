import java.util.ArrayList;

public class Administrator {
    private long ID;
    private Profile profile;
    private ArrayList<Hotel> hotels;

    public Administrator(long ID, Profile profile, ArrayList<Hotel> hotels) {
        this.ID = ID;
        this.profile = profile;
        this.hotels = hotels;
    }

    public ArrayList<Hotel> getHotels() {
        return hotels;
    }

    void addHotel(Hotel hotel) {
        hotels.add(hotel);
    }

    void removeHotel(Hotel hotel) {
        hotels.remove(hotel);
    }


}
