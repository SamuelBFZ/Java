package Automovil;

public class Automovil {

    private String marca;
    private String modelo;
    private float precio;

    public Automovil(String _marca, String _modelo, float _precio) {
        marca = _marca;
        modelo = _modelo;
        precio = _precio;
    }

    public float getPrecio(){
        return precio;
    }

    public String mostrarDatos(){
        return "Marca: "+marca+"\nModelo: "+modelo+"\nPrecio: "+precio;
    }
}
