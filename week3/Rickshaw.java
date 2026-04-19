import java.util.Scanner;

public class Rickshaw{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter distance (km)");
    int distance = input.nextInt();

    System.out.println("Enter estimated travel time in minutes: ");
    int time = input.nextInt();

    System.out.println("Is it night right now? y/n");
    String nightInput = input.next();
    boolean isNight = nightInput.equals("y");

    int baseFare = 50;
    int costperKm = 20;
    int costperMin = 5;

    int price = baseFare + (distance * costperKm) + (time * costperMin);

    if(isNight){
        price = price + (price * 15 / 100);
    }

    System.out.println("Your final fare is: Rs. " + price);
    }
}