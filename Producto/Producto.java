package Producto;

public class Producto {

    private int id;
    private String nombre;
    private int cantidad;
    private String categoria;
    private double precio;

    
    //Propiedades Get y Set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    //Constructores

    public Producto() {
    }

    public Producto(String nombre, int cantidad, String categoria, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.categoria = categoria;
        this.precio = precio;
    }
    
    
    
    
    
    public static void main(String[] args) {
        
    }
    
}
