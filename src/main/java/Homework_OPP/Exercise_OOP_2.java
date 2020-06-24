package Homework_OPP;

public class Exercise_OOP_2 {

    public static void SportCar(String producer, String model, String color,
                                int seatsNumber, int capacity, int horsePower, int fuelConsumption){

        SportCar sportCar = new SportCar(producer, model, color, seatsNumber,
                capacity, horsePower, fuelConsumption);
        System.out.println(sportCar.producer+" "+sportCar.model+" "+sportCar.color+" "+sportCar.seatsNumber+" "+sportCar.capacity+" "+sportCar.horsePower+" "+sportCar.fuelConsumption);
    }
    public static void SportCar2(String producer, String model, String color,
                                 int seatsNumber){

        SportCar sportCar = new SportCar(producer, model, color, seatsNumber);
        System.out.println(sportCar.producer+" "+sportCar.model+" "+sportCar.color+" "+sportCar.seatsNumber);
    }

    public static void main(String[] args) {
        SportCar("VW", "C6", "blue", 5, 1,1,1);
        SportCar2("VW", "C6", "blue", 5 );
    }
}
