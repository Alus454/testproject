package Homework_OPP;

public class Square extends Figure{
    int sideA;
    int sideB;
    public Square(int sideA, int sideB){
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
        System.out.println("Figura: Kwadrat, pole: "+countArea());

    }
}
