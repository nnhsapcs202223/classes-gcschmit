/**
 * This class models a mileage tracker for a car.
 *
 * @author 
 * @version 
 */
public class MileageTracker
{
    /*
     * 2. Define the instance variables (store the object's attributes):
     *      specify the visibility (e.g., private)
     *          public: accessible by any code in any class
     *          private: only accessible by methods in this class
     *      specify the type (e.g., int, double, String)
     *      specify the name (e.g., distanceDriven)
     *      
     *  Instance variables differ from local variables in the following ways:
     *      scoped to the class (accessible in all method of the class;
     *          lifetime is the same as the object)
     *      automatically initialized to a default value (0, false, null)
     *      best practice is not to immediately initialize instance variables
     */
    private int distanceDriven;     // in units of miles
    private int fuelConsumed;       // in units of gallons
    private String vin;             // vehicle identification
    
    
    /*
     * 3. Define the constructor(s):
     *      responsible for initializing newly created objects
     *      invoked automatically via the new operator
     *      name of the constructor must match the name of the class
     *      has no return type (not even void)
     *      multiple constructors may be defined a class
     *      one constructor may call another constructor (with restrictions)
     */
    
    /**
     * Default constructor for the MileageTracker class.
     *      Initializes the object's miles driven and fuel consumed to 0
     *          and the VIN to null
     */
    public MileageTracker()
    {
        
    }
    
    /**
     * Constructs a new MileageTracker object with the specified
     *      miles driven and fuel consumed.
     *      
     *  @param initialDistanceDriven the number of miles already driven
     *  @param initialFuelConsumed the number of gallons of fuel already consumed
     */
    public MileageTracker(int initialDistanceDriven, int initialFuelConsumed)
    {
        
    }
    
    
    
    
    
    
    /*
     * 1. Define methods by specifying:
     *      the visibility (e.g., public, private)
     *      the return type (e.g., void, int)
     *      the method name (e.g., incrementDistanceDriven, getDistanceDriven)
     *      the parameters and their type (e.g., miles of type int)
     */
    
    /**
     * Increments the number of miles that the car has driven.
     * 
     * @param miles the additional distance, in miles, this car has driven
     */
    public void incrementDistanceDriven(int miles)
    {
        
    }
    
    /**
     * Returns the total number of miles driven.
     * 
     * @return the total number of miles driven
     */
    public int getDistanceDriven()
    {
        return 0;
    }
    
    /**
     * Increment the number of gallons of fuel that this car has consumed
     * 
     * @param gallons    the additional fuel, in gallons, this car has consumed
     */
    public void incrementFuelConsumed(int gallons)
    {
        //this.fuelConsumed += gallons;
    }
    
    /**
     * Returns the total number of gallons of fuel consumed
     * 
     * @return the total number of gallons of fuel consumed
     */
    public int getFuelConsumed()
    {
        //return this.fuelConsumed;
        return 0;
    }
    
    
    /**
     * Returns the current mileage, in miles per gallon
     * 
     * @return the current mileage, in miles per gallon
     */
    public int getMileage()
    {
        //double mileage = this.fuelConsumed / this.distanceDriven;
        //return mileage;
        return 0;
    }
    
    /**
     * Returns the vehicle identification (VIN) of this car.
     * 
     * @return the vehicle identification (VIN) of this car
     */
    public String getVIN()
    {
        //return this.vin;
        return "";
    }
    
    /**
     * Sets the vehicle identification (VIN) of this car.
     * 
     * @param vin    the vehicle identification (VIN) of this car
     */
    public void setVIN(String vin)
    {
        //vin = vin;
    }
}






