package Domain.Carro;
import java.util.*;

public abstract class car {
    private String brand;
    private String model;
    private String vinNum;
    private String platNum;
    private String engin;
    private int numOfEngins;
    private Double mileage;
    private int topSpeed;
    private Double combustionRat;
    private String trim; // can remove 
    private int year; // year of manufacture
    private String country; // country of registration

    public car(){
        this.brand="";
        this.model="";
        this.vinNum="";
        this.platNum="";
        this.engin="";
        this.numOfEngins=0;
        this.mileage=0.0;
        this.topSpeed=0;
        this.combustionRat=0.0;
        this.trim="";
        this.year=0;
        this.country="";
    }
    public car(String brand, String model, String vinNum, int year,
                        String engin, Double mileage, int topSpeed){
        this.brand=brand;
        this.model=model; 
        this.vinNum=vinNum;
        this.engin=engin;
        this.mileage=mileage;
        this.topSpeed=topSpeed;
        this.year=year;
    }

    // other | getter/ setters |  @Override -> toString && clone && ++
    
    public car(car other){
        this.brand=other.brand;
        this.model=other.model;
        this.vinNum=other.vinNum;
        this.platNum=other.platNum;
        this.engin=other.engin;
        this.numOfEngins=other.numOfEngins;
        this.mileage=other.mileage;
        this.topSpeed=other.topSpeed;
        this.combustionRat=other.combustionRat;
        this.trim=other.trim;
        this.year=other.year;
        this.country=other.country;
    }

    // getters
    public String getBrand(){ return this.brand; }
    public String getModel(){ return this.model; }
    public String getVIN(){ return this.vinNum; }
    public String getPlat(){ return this.platNum; }
    public String getEngin(){ return this.engin; }
    public int getNumOfEngins(){ return this.numOfEngins; }
    public Double getMileage(){ return this.mileage; }
    public int getTopSpeed(){ return this.topSpeed; }
    public Double getCombustionRat(){ return this.combustionRat; }
    public String getTrip(){ return this.trim; }
    public int getManufactureYear(){ return this.year; }
    public String getCuntryOfRegistration(){ return this.country; }

    // setters
    public void setBrand(String brand){ this.brand=brand; }
    public void setModel(String model){this.model=model; }
    public void setVIN(String vin){ this.vinNum=vin; }
    public void setPaleNum(String platNum){ this.platNum=platNum; }
    public void setEnginType(String engin){ this.engin=engin; }
    public void setNumOfEngins(int num){ this.numOfEngins=num; }
    public void setTopSpeed(int topSpeed){ this.topSpeed=topSpeed; }
    public void SetConbustionRat(Double rat){ this.combustionRat=rat; }
    public void setTrim(String trip){ this.trim=trim; }
    public void setYearOfManufacture(int year){this.year=year; }
    public void setCountryOfRegistration(String country){this.country=country; }

    
    public abstract double costPerKM();

    @Override
    public String toString(){
        return "Car INFO: Brand: " + this.brand 
                 +", Name: " + this.model
                 +", VIN number: " + this.vinNum
                 +", plat number: " + this.platNum
                 +",  engin type: " + this.engin
                 +", mileage: " + this.mileage
                 +", top speed: "+ this.topSpeed
                 +", combustion rat: "+ this.combustionRat
                 +", trim: "+ this.trim
                 +", year of manufacture: "+ this.year
                 +" and the county of registration: " + this.year;
    }

}
