package New;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tokens=scanner.nextLine().split("\\s+");
        Vehicle car= new Car(
                Double.parseDouble(tokens[0]),Double.parseDouble(tokens[1]));
        int commandsCount =Integer.parseInt(scanner.nextLine());
        while (commandsCount-->0){
            String command =scanner.nextLine();
            String[] params =command.split("\\s+");
            double argument= Double.parseDouble(params[2]);
            if (command.contains("Drive")){
                if (params[1].equals("Car")){
                    car.drive(argument);
                } else {

                }
            }else {
                if (params[1].equals("Car")){
                    System.out.println(car.refuel(argument ));
                }else {

                }
            }
        }
        System.out.println();
    }
}
