package Domain.Carro.CarTypes;
import Domain.Carro.car;

// adding more later

public class hybridCar extends combustion{

    private double batteryCap;
    private double kwPer100; // Kw consumption per 100 km 
    private double kwhPrice; // Kw per houre price 


    public hybridCar(String brand ,String vimNum, String model, int year,String engin, Double mileage,
                        int topSpeed, String fouleType,
                    double batteryCap, double kwPer100, double kwhPrice){
        super(brand, vimNum, model, year, engin, mileage, topSpeed, batteryCap, kwPer100, kwhPrice, fouleType);
        this.batteryCap=batteryCap;
        this.kwPer100=kwPer100;
        this.kwhPrice=kwhPrice;
    }


    @Override
    public double costPerKM(){
        return (kwPer100 / 100) * kwhPrice;
    }

    // getters
    public double getBatteryCap(){ return this.batteryCap; }
    public double getKwPer100(){ return this.kwPer100; }
    public double getKwhPrice(){ return this.kwhPrice; }

    // setters
    public void setBatteryCap(double batteryCap){ this.batteryCap=batteryCap; }
    public void setKwPer100(double kwPer100){ this.kwPer100=kwPer100; }
    public void setKwhPrice(double kwhPrice){ this.kwhPrice=kwhPrice; }
    
}