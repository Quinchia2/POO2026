public class TestVehicle {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("abc123", "Toyota", 30.0);

        System.out.println("--- VEHICLE TESTS ---");
        System.out.println("Initial Plate: " + vehicle.getLicensePlate());

        System.out.println("Plate 'xyz789' status: " + vehicle.setLicensePlate("xyz789"));
        System.out.println("Plate 'XYZ789' status: " + vehicle.setLicensePlate("XYZ789")); 
        System.out.println("Plate '123ABC' status: " + vehicle.setLicensePlate("123ABC")); 

        System.out.println("\nAccelerating (Max speed: " + vehicle.getMaximumSpeed() + "):");
        System.out.println("Accelerate 10 km/h: " + vehicle.accelerate());
        System.out.println("Accelerate 10 km/h: " + vehicle.accelerate());
        System.out.println("Accelerate 10 km/h: " + vehicle.accelerate()); 
        System.out.println("Accelerate 10 km/h (Exceeds max): " + vehicle.accelerate());

        System.out.println("\nBraking:");
        System.out.println("Brake 10 km/h: " + vehicle.brake());
        System.out.println("Brake 10 km/h: " + vehicle.brake());
        System.out.println("Brake 10 km/h: " + vehicle.brake());
        System.out.println("Brake 10 km/h (Already stopped): " + vehicle.brake());
        }
}
