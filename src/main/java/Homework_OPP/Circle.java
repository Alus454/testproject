package Homework_OPP;

public class Circle extends Figure {
    int sideA;
    int sideB;
    public Circle(int sideA, int sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public float countArea() {
        float wynik = sideA*sideB;
        return wynik;
    }

    @Override
    public void displayArea() {
        System.out.println("Figura: Koło, pole: "+countArea());

    }
}
