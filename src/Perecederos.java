public class Perecederos extends Articulos{
    private int dias_caducar;

    public Perecederos(int codigo, String nombre, double precio, int dias_caducar) {
        super(codigo, nombre, precio);
        this.dias_caducar = dias_caducar;
    }

    @Override
    public double calcular() {
        double descuento = 0.0;
        double precio_final;

        switch (dias_caducar) {
            case 1: descuento = 0.6; break;
            case 2: descuento = 0.4; break;
            case 3: descuento = 0.2; break;
        }

        if (descuento != 0.0) { precio_final = this.getPrecio() - (this.getPrecio() * descuento); }
        else { precio_final = this.getPrecio(); }

        return precio_final;
    }
}
