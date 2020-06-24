package Homework_OPP;

public class SportCar extends Car {

    public SportCar(String producer, String model, String color, int seatsNumber, int capacity, int horsePower, int fuelConsumption) {
        this.producer = producer;
        this.model = model;
        this.color = color;
        this.seatsNumber = seatsNumber;
        this.capacity = capacity;
        this.horsePower = horsePower;
        this.fuelConsumption = fuelConsumption;
    }
    public SportCar(String producer, String model, String color, int seatsNumber){
        super(producer, model, color, seatsNumber);
    }


}
