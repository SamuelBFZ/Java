package Isosceles;

public class Triangulo {
    private double lado;
    private double base;

    public Triangulo(double _lado, double _base) {
        lado = _lado;
        base = _base;
    }

    public double getPerimetro(){
        double perimetro = (lado * 2) + base;
        return perimetro;
    }

    public double getArea(){
        double area = (base * Math.sqrt((lado * lado) - ((base * base)/4)))/2;
        return area;
    }
}
