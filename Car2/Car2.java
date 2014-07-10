
import comp102x.IO;
/**
 * A class of Car objects that can move forward, backward and turn
 */
public class Car2
{
    private String owner = "NoName";
    private ColorImage carimage = new ColorImage("Car1.png");
    private double gasMileage = 10.0; // Liters for every 100km
    private double gasInTank = 10.0;
    
    // constructors
    
    public Car2(){}
    
    // second constructor
    
    public Car2(String nameOfOwner)
    {
        owner = nameOfOwner;
        carImage = new ColorImage();
    }
    
    // third constructor
    
    public Car2(String nameOfOwner, double newGasMileage)
    {
        owner = nameOfOwner;
        carImage = new ColorImage();
        gasMileage = newGasMileage;
    }
    
    
    // methods
    public void moveForward(int dist)
    {
        carImage.setX(carImage.getX() + dist);
        double gasUsed = dist / 100.0 * gasMileage;
        gasInTank = gasInTank - gasUsed;
        IO.outputln("Amount of gas used: " + gasUsed + ", gas remaining: " + gasInTank);
    }
    
    public void makeTurn(int angle) 
    {
        carImage.setRotation(carImage.getRotation() + angle);
    }
    
    public void addGas(double gasToAdd)
    {
        gasInTank = gasInTank + gasToAdd;
    }
    
    public void moveBackwards(int dist)
    {
        carImage.setX(carImage.getX() - dist);
        double gasUsed = dist / 100.0 * gasMileage;
        gasInTank = gasInTank - gasUsed;
        IO.outputln("Amount of gas used: " + gasUsed + ", gas remaining: " + gasInTank);
    }
    
}
    
    
 