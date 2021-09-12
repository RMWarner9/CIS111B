/**
 * This is a demo of the Car object
 * Rachel Warner 9/12/2021
 */
import java.util.Calendar; //Used to get the current year
import java.util.Scanner; //Used to get input from user


public class CarDemo {
    public static void main(String[] args){

        int year; //instantiate year variable
        String make; //instantiate make variable

        //instantiate currentYearModelLimit to the current year + 1 as the next years models are available
        int currentYearModelLimit = Calendar.getInstance().get(Calendar.YEAR) + 1;



        Scanner stdin = new Scanner(System.in); //instantiate Scanner for input

        System.out.println("What is the make of your car?");
        make = stdin.nextLine();

        //Use a while loop to check user input if empty or if it contains numbers using regex
        while (make.isEmpty() || make.matches(".*[0-9].*")){
            //the only brand of car that has a number is an exception
            if(make.toUpperCase().equals("9FF")){
                break;
            }
            System.out.println("Please enter a valid make: ");
            make = stdin.nextLine();
        }


        System.out.println("What year is your car?");
        year = stdin.nextInt();

        while (year > currentYearModelLimit){
            System.out.println("Please enter a valid year: ");
            year = stdin.nextInt();
        }

        Car vroom = new Car(year, make);

        System.out.printf("You are driving a %d %s \nAccelerating...\n", vroom.getYearModel(), vroom.getMake());

        //accelerate the car 5 times and display the current speed
        for (int i = 1; i <= 5; i ++){
            vroom.accelerate();
            System.out.printf("Current speed: %d \n", vroom.getSpeed());
        }

        System.out.println("Braking...");

        //decelerate the car 5 times and display the current speed
        for (int i = 1; i <= 5; i ++){
            vroom.brake();
            System.out.printf("Current speed: %d\n", vroom.getSpeed());
        }

    }
}
