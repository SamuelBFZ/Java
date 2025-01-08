package CalcularPoligonos;

public abstract class Poligono {
    protected int nlados;

    public Poligono(int nlados) {
        this.nlados = nlados;
    }

    public int getnLados(){
        return nlados;
    }

    public String toString(){
        return "Numero de lados: "+nlados;
    }

    public abstract double area(); //firma de metodo abstracto
}
