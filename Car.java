/** This is a class that represents a car
 * Rachel Warner 9/12/2021
 */
public class Car {
    private final int yearModel; //hold the car's year model.

    private final String make; // holds the make of the care

    private int speed; //holds the current speed of the car

    /**
     * This constructor takes a yearModel and make to assign to the classes field values and assigns 0 to the speed.
     * @param yearModel
     * @param make
     */
    public Car(int yearModel, String make) {
        this.yearModel = yearModel;
        this.make = make;
        speed = 0;
    }

    // Accessors

    /**
     * Accessor Method returns the speed of the car
     * @return the speed of the car (int)
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Accessor Method returns the year model of the car
     * @return the yearModel of the car (int)
     */
    public int getYearModel() {
        return yearModel;
    }

    /**
     * Accessor Method returns the make of the car
     * @return the make of the car (String)
     */
    public String getMake() {
        return make;
    }

    /**
     * This method accelerates the car's speed by 5.
     */
    public void accelerate(){
        speed += 5;
    }

    /**
     * This method decelerates the car's speed by 5.
     */
    public void brake(){
        speed -= 5;
    }


}
