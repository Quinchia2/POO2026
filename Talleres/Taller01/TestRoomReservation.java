public class TestRoomReservation {
    public static void main(String[] args) {
        RoomReservation reservation = new RoomReservation("Mariana Morcillo", 302, 3, 120.0);

        System.out.println("--- ROOM RESERVATION TESTS ---");
        System.out.println("Guest: " + reservation.getGuestName());
        System.out.println("Initial Total Cost (3 nights * $120): $" + reservation.calculateTotalCost());

        System.out.println("\nChanging nights to 5: " + reservation.setNumberOfNights(5));
        System.out.println("New Total Cost: $" + reservation.calculateTotalCost());

        System.out.println("Changing price per night to $150: " + reservation.setPricePerNight(150.0));
        System.out.println("New Total Cost: $" + reservation.calculateTotalCost());

        System.out.println("\nTrying invalid nights (-2): " + reservation.setNumberOfNights(-2));
        System.out.println("Trying empty guest name: " + reservation.setGuestName("   "));

        System.out.println("Final Total Cost remains consistent: $" + reservation.calculateTotalCost());
    }
}
