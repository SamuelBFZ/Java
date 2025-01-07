package Isosceles;

public class Triangulo {
    private double lado;
    private double base;

    public Triangulo(double lado, double base) {
        this.lado = lado;
        this.base = base;
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
