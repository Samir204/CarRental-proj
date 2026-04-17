package Domain.Carro;

public class enginAndPerformance extends car{
    private String enginDisplacement;
    private int horsePower;
    private int torque;
    private String fuelType;
    private int acceleration;
    private String transmission;
    private String drivetrain;

    // other | getter/ setters |  @Override -> toString && clone && ++

    private enginAndPerformance(){
        this.enginDisplacement="";
        this.horsePower=0;
        this.torque=0;
        this.fuelType="";
        this.acceleration=0;
        this.transmission="";
        this.drivetrain="";
    }

    private enginAndPerformance(String enginDisplacement, int horsePower, int torque,
                                String fuelType, int acceleration, String transmission,
                                String drivetrain){
        this.enginDisplacement=enginDisplacement;
        this.horsePower=horsePower;
        this.torque=torque;
        this.fuelType=fuelType;
        this.acceleration=acceleration;
        this.transmission=transmission;
        this.drivetrain=drivetrain;
    }

    private enginAndPerformance(enginAndPerformance other){
        this.enginDisplacement=other.enginDisplacement;
        this.horsePower=other.horsePower;
        this.torque=other.torque;
        this.fuelType=other.fuelType;
        this.acceleration=other.acceleration;
        this.transmission=other.transmission;
        this.drivetrain=other.drivetrain;
    }

    //getters
    public String getEnginDisplacement(){ return this.enginDisplacement; }
    public int getHorsePower(){ return this.horsePower; }
    public int getTorque(){ return this.torque; }
    public String getFuelType(){ return this.fuelType; }
    public int getAcceleration(){ return this.acceleration; }
    public String getTransmission(){ return this.transmission; }
    public String getDrivetrain(){ return this.drivetrain; }

    // setters
    public void setEnginDisplacement(String enginDisplacement){ this.enginDisplacement=enginDisplacement; }
    public void setHorsePower(int horsePower){ this.horsePower=horsePower; }
    public void setTorque(int torque){ this.torque=torque; }
    public void setFuelType(String fueltype){this.fuelType=fueltype;}
    public void setAcceleration(int acceleration){this.acceleration=acceleration;}
    public void setTransmission(String transmission){this.transmission=transmission; }
    public void setDriveTrain(String driveTrain){this.drivetrain=driveTrain;}


    @Override
    public enginAndPerformance clone(){return new enginAndPerformance(this);}

    @Override
    public String toString(){
        return "the info about the engin and performance that ill write later.";
    }
}
