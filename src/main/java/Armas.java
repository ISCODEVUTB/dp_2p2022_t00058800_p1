public class Armas extends Characterization{
    private float ultraje;
    private int velocidadAdicional;
    private float saludAdicional;
    //Constructor de la clase
    public Armas(String nombre, String historia, float ultraje, int velocidadAdicional, float saludAdicional) {
        super(nombre, historia);
        this.ultraje = ultraje;
        this.velocidadAdicional = velocidadAdicional;
        this.saludAdicional = saludAdicional;
    }
    //Getters and setters

    public float getUltraje() {
        return ultraje;
    }

    public void setUltraje(float ultraje) {
        this.ultraje = ultraje;
    }

    public int getVelocidadAdicional() {
        return velocidadAdicional;
    }

    public void setVelocidadAdicional(int velocidadAdicional) {
        this.velocidadAdicional = velocidadAdicional;
    }

    public float getSaludAdicional() {
        return saludAdicional;
    }

    public void setSaludAdicional(float saludAdicional) {
        this.saludAdicional = saludAdicional;
    }
}
