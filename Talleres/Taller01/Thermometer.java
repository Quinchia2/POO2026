public class Thermometer {
    private double temperature;
    public double getTemperature(){
        return temperature;
    }
    public boolean setTemperature(double newTemperature){
        if (newTemperature<=100 && newTemperature>=-50){
            this.temperature=newTemperature;
            return true;
        }
        return false;
    }
}
