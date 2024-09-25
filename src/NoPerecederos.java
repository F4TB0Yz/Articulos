public class NoPerecederos extends Articulos{

    public NoPerecederos(int codigo, String nombre, double precio) {
        super(codigo, nombre, precio);
    }

    @Override
    public double calcular(int cant_articulos) {
        return this.precio * cant_articulos;
    }

}
