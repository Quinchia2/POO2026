public class RoomReservation {
    private String guestName;
    private int roomNumber;
    private int numberOfNights;
    private double pricePerNight;

    public RoomReservation(String guestName, int roomNumber, int numberOfNights, double pricePerNight) {
        this.guestName = "Guest";
        this.roomNumber = (roomNumber > 0) ? roomNumber : 101;
        this.numberOfNights = 1;
        this.pricePerNight = 50.0;

        setGuestName(guestName);
        setNumberOfNights(numberOfNights);
        setPricePerNight(pricePerNight);
    }

    public boolean setGuestName(String guestName) {
        if (guestName != null && !guestName.trim().isEmpty()) {
            this.guestName = guestName.trim();
            return true;
        }
        return false;
    }

    public boolean setNumberOfNights(int numberOfNights) {
        if (numberOfNights > 0) {
            this.numberOfNights = numberOfNights;
            return true;
        }
        return false;
    }

    public boolean setPricePerNight(double pricePerNight) {
        if (pricePerNight > 0) {
            this.pricePerNight = pricePerNight;
            return true;
        }
        return false;
    }

    public double calculateTotalCost() {
        return this.numberOfNights * this.pricePerNight;
    }

    public String getGuestName() { return this.guestName; }
    public int getRoomNumber() { return this.roomNumber; }
    public int getNumberOfNights() { return this.numberOfNights; }
    public double getPricePerNight() { return this.pricePerNight; }
}
