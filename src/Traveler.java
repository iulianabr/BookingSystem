import java.util.ArrayList;

public class Traveler {
    private long ID;
    private Profile profile;
    private ArrayList<Reservation> reservations;

    public Traveler(long ID, Profile profile, ArrayList<Reservation> reservations) {
        this.ID = ID;
        this.profile = profile;
        this.reservations = reservations;
    }

    void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    void cancelReservation(Reservation reservation) {
        reservations.remove(reservation);
    }
}
