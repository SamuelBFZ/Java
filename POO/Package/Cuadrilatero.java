package Package;

public class Cuadrilatero {

    private float lado1;
    private float lado2;

    //constructor
    public Cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Cuadrilatero(float _lado1){
        lado1 = this.lado2 = _lado1;
    }

    public float getPermietro(){
        float permietro = 2 * (lado1 + lado2);
        return permietro;
    }

    public float getArea(){
        float area = lado1 * lado2;
        return area;
    }
}
