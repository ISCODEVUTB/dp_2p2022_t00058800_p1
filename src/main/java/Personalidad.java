public class Personalidad extends Characterization{
    private boolean velocidadAdicional;
    private boolean saludAdicional;
    private boolean ultrajeAdicional;

    public Personalidad(String nombre, String historia,boolean velocidadAdicional, boolean saludAdicional, boolean ultrajeAdicional) {
        super(nombre, historia);
        this.velocidadAdicional = velocidadAdicional;
        this.saludAdicional = saludAdicional;
        this.ultrajeAdicional = ultrajeAdicional;
    }
}
