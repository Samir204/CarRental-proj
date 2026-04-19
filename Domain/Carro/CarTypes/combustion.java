package Domain.Carro.CarTypes;

import Domain.Carro.car;

// adding more later

public class combustion extends car{
    
    private String fouleType;
    private double depositSize;
    private double cunsumptionPer100Km;
    private double literPrice;

    // other | getter/ setters |  @Override -> toString && clone && ++
    

    public combustion(String brand ,String vimNum, String model, int year,String engin, Double mileage,
                        int topSpeed, 
                        double depositSize, double cunsumptionPer100Km, double literPrice, String fouleType){
        super(brand, model, vimNum, year, engin, mileage, topSpeed);
        this.fouleType=fouleType;
        this.depositSize=depositSize;
        this.cunsumptionPer100Km=cunsumptionPer100Km;
        this.literPrice=literPrice;
    }

    // private combustion(combustion other){
    //     super(other.getBrand(), other.getModel(), other.getVIN(), other.getManufactureYear(), 
    //                 other.getEngin(), other.getMileage(), other.getTopSpeed());
    //     this.fouleType=other.fouleType;
    //     this.depositSize=other.depositSize;
    //     this.cunsumptionPer100Km=other.cunsumptionPer100Km;
    //     this.literPrice=other.literPrice;
    // }

    //setters
    public void setFouleType(String fouleType){ this.fouleType=fouleType; }
    public void setDepositSize(double depositSize){ this.depositSize=depositSize; }
    public void setCunsumptionPer100Km(double cunsumptionPer100Km){ this.cunsumptionPer100Km=cunsumptionPer100Km; }
    public void setLiterPrice(double literPrice){ this.literPrice=literPrice; }


    // getters
    public String getFouleType(){ return this.fouleType; }
    public double getDepositSize(){ return this.depositSize; }
    public double getCunsumptionPer100Km(){ return this.cunsumptionPer100Km; }
    public double getLiterPrice(){ return this.literPrice; }

    @Override
    public double costPerKM(){
        return (cunsumptionPer100Km / 100) * literPrice;
    } 


}
