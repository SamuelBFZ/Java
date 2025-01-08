package CalcularPoligonos;

public class Triangulo extends Poligono{
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        super(3);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado1(){
        return lado1;
    }

    public double getLado2(){
        return lado2;
    }

    public double getLado3(){
        return lado3;
    }

    @Override
    public String toString(){
        return String.format(
            "Triangulo:\n" +
            "%s\n" +
            "Lado 1: %.2f\n" +
            "Lado 2: %.2f\n" +
            "Lado 3: %.2f\n",
            super.toString(), lado1, lado2, lado3, area()
        );
    }

    @Override
    //calculo del area mediante la formula de heron
    public double area() {
        double p = (lado1+lado2+lado3)/2;
        return Math.sqrt(p*(p-lado1)*(p-lado2)*(p-lado3));
    }
}
