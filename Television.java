/**
 * The purpose of this cass is to model a television.
 * Rachel Warner 9/8/2021
 */
public class Television {
    private final String manufacturer;

    private final int screenSize; //screenSize represents the Television's size

    private boolean powerOn; // represents the TV's power state

    private int channel; //represents the channel

    private int volume; // represents the volume


    /**
     * This constructor takes the brand and size as parameters to set for the object's fields
     * and sets values for the remaining fields (channel, powerOn, and volume).
     * @param brand
     * @param size
     */
    public Television(String brand, int size){
        manufacturer = brand;

        screenSize = size;

        channel = 2;

        powerOn = false;

        volume = 20;

    }

    /**
     * This method sets the Television's channel
     * @param chan :the Television's channel to be set
     */
    public void setChannel(int chan){
        channel = chan;
    }

    /**
     * Mutator method that changes the Televisions power state from true to false and vice versa.
     */
    public void power(){
        powerOn = !powerOn;
    }

    /**
     * Mutator method that increases the volume of the Television
     */
    public void increaseVolume(){
        volume++;
    }

    /**
     * Mutator method that decreases the volume of the Television
     */
    public void decreaseVolume(){
        volume--;
    }

    /**
     * @return returns channel of the Television
     */
    public int getChannel(){
        return channel;
    }

    /**
     * @return the volume of the Television
     */
    public int getVolume() {
        return volume;
    }

    /**
     *
     * @return the manufacturer of the Television
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * @return the screenSize of the Television
     */
    public int getScreenSize() {
        return screenSize;
    }
}
