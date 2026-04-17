package Domain.Carro;
import java.util.*;

public class car {
    private String brand;
    private String name;
    private String vinNum;
    private String platNum;
    private String engin;
    private Double mileage;
    private int topSpeed;
    private Double combustionRat;
    private String trim; // can remove 
    private int year; // year of manufacture
    private String country; // country of registration

    public car(){
        this.brand="";
        this.name="";
        this.vinNum="";
        this.platNum="";
        this.engin="";
        this.mileage=0.0;
        this.topSpeed=0;
        this.combustionRat=0.0;
        this.trim="";
        this.year=0;
        this.country="";
    }
    public car(String brand, String name, String vinNum, String platNum,
                        String engin, Double mileage, int topSpeed, Double combustionRat,
                        String trim, int year, String country){
        this.brand=brand;
        this.name=name; 
        this.vinNum=vinNum;
        this.platNum=platNum;
        this.engin=engin;
        this.mileage=mileage;
        this.topSpeed=topSpeed;
        this.combustionRat=combustionRat;
        this.trim=trim;
        this.year=year;
        this.country=country;
    }

    // other | getter/ setters |  @Override -> toString && clone && ++
    
    public car(car other){
        this.brand=other.brand;
        this.name=other.name;
        this.vinNum=other.vinNum;
        this.platNum=other.platNum;
        this.engin=other.engin;
        this.mileage=other.mileage;
        this.topSpeed=other.topSpeed;
        this.combustionRat=other.combustionRat;
        this.trim=other.trim;
        this.year=other.year;
        this.country=other.country;
    }

    // getters
    public String getBrand(){ return this.brand; }
    public String getName(){ return this.name; }
    public String getVIN(){ return this.vinNum; }
    public String getPlat(){ return this.platNum; }
    public String getEngin(){ return this.engin; }
    public Double getMileage(){ return this.mileage; }
    public int getTopSpeed(){ return this.topSpeed; }
    public Double getCombustionRat(){ return this.combustionRat; }
    public String getTrip(){ return this.trim; }
    public int getManufactureYear(){ return this.year; }
    public String getCuntryOfRegistration(){ return this.country; }

    // setters
    public void setBrand(String brand){ this.brand=brand; }
    public void setName(String Name){this.name=name; }
    public void setVIN(String vin){ this.vinNum=vin; }
    public void setPaleNum(String platNum){ this.platNum=platNum; }
    public void setEnginType(String engin){ this.engin=engin; }
    public void setTopSpeed(int topSpeed){ this.topSpeed=topSpeed; }
    public void SetConbustionRat(Double rat){ this.combustionRat=rat; }
    public void setTrim(String trip){ this.trim=trim; }
    public void setYearOfManufacture(int year){this.year=year; }
    public void setCountryOfRegistration(String country){this.country=country; }


    @Override
    public car clone(){ return new car(this); }

    @Override
    public String toString(){
        return "Car INFO: Brand: " + this.brand 
                 +", Name: " + this.name
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
