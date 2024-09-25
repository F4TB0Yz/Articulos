public abstract class Articulos {
    protected int codigo;
    protected String nombre;
    protected double precio;

    public Articulos(int codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    // Metodo para aplicar override
    public abstract double calcular();

}
