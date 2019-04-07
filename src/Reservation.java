import java.util.Date;
import java.util.ArrayList;

public class Reservation {
    private Hotel hotel;
    private ArrayList<Room> rooms;
    private Traveler traveler;
    private Date checkIn;
    private Date checkOut;

    public Reservation(Hotel hotel, ArrayList<Room> rooms, Traveler traveler, Date checkIn, Date checkOut) {
        this.hotel = hotel;
        this.rooms = rooms;
        this.traveler = traveler;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public Traveler getTraveler() {
        return traveler;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }
}
