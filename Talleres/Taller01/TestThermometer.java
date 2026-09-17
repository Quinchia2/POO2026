public class TestThermometer {
    public static void main(String[] args) {
        Thermometer t = new Thermometer();
        boolean accepted = t.setTemperature(150);
        System.out.println("Accepted? "+ accepted);
        System.out.println("Actual temperature in Celsius "+ t.getTemperature());

    }
}
