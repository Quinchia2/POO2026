public class Vehicle {
    private String licensePlate;
    private String brand;
    private double currentSpeed;
    private double maximumSpeed;

    public Vehicle(String licensePlate, String brand, double maximumSpeed) {
        this.brand = (brand != null && !brand.trim().isEmpty()) ? brand.trim() : "Generic Brand";
        this.maximumSpeed = (maximumSpeed > 0) ? maximumSpeed : 100.0;
        this.currentSpeed = 0.0;
        
        if (setLicensePlate(licensePlate) == 0) {
            this.licensePlate = "AAA000";
        }
    }

    public int setLicensePlate(String licensePlate) {
        if (licensePlate == null) {
            return 0; 
        }

        String trimmedPlate = licensePlate.trim();
        if (!trimmedPlate.matches("(?i)^[a-z]{3}\\d{3}$")) {
            return 0;
        }

        String uppercasePlate = trimmedPlate.toUpperCase();
        boolean wasNormalized = !trimmedPlate.equals(uppercasePlate);
        
        this.licensePlate = uppercasePlate;
        return wasNormalized ? 2 : 1;
    }

    public boolean accelerate() {
        if (this.currentSpeed + 10.0 <= this.maximumSpeed) {
            this.currentSpeed += 10.0;
            return true;
        }
        return false;
    }

    public boolean brake() {
        if (this.currentSpeed - 10.0 >= 0.0) {
            this.currentSpeed -= 10.0;
            return true;
        }
        return false;
    }

    public String getLicensePlate() { return this.licensePlate; }
    public String getBrand() { return this.brand; }
    public double getCurrentSpeed() { return this.currentSpeed; }
    public double getMaximumSpeed() { return this.maximumSpeed; }
}
