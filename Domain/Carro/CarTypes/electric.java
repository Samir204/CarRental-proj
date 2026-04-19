package Domain.Carro.CarTypes;

import Domain.Carro.car;

//adding more later

public class electric extends car{
    
    private double batteryCap; // battery capacity 
    private double consumptionPer100KM; 
    private double kwhPrice; // price for Kw per 1 km

    public electric(String brand, String model, String vinNum, int year,
                        String engin, Double mileage, int topSpeed,
                    double batteryCap, double consumptionPer100KM, double kwhPrice){
        super(brand, model, vinNum, year, engin, mileage, topSpeed);
        this.batteryCap=batteryCap;
        this.consumptionPer100KM=consumptionPer100KM;
        this.kwhPrice=kwhPrice;
    }

    // getter
    public double getBatteryCap(){ return this.batteryCap; }
    public double getConsumptionPer100KM(){ return this.consumptionPer100KM; }
    public double getKwhPrice(){ return this.kwhPrice; }

    // setters
    public void setBatteryCap(double batteryCap){ this.batteryCap=batteryCap; }
    public void setConsumptionPer100KM(double consumptionPer100KM){ this.consumptionPer100KM=consumptionPer100KM;}
    public void setKwhPrice(double kwhPrice){ this.kwhPrice=kwhPrice; }


    @Override
    public double costPerKM(){
        return (consumptionPer100KM / 100) * kwhPrice;
    }




}
