public class Poderes extends Characterization {
    private float ultraje;
    private int tiempoRecarga;
    private boolean saludAdicional;

    public Poderes(String nombre, String historia, float ultraje, int tiempoRecarga, boolean saludAdicional) {
        super(nombre, historia);
        this.ultraje = ultraje;
        this.tiempoRecarga = tiempoRecarga;
        this.saludAdicional = saludAdicional;
    }

    public float getUltraje() {
        return ultraje;
    }

    public void setUltraje(float ultraje) {
        this.ultraje = ultraje;
    }

    public int getTiempoRecarga() {
        return tiempoRecarga;
    }

    public void setTiempoRecarga(int tiempoRecarga) {
        this.tiempoRecarga = tiempoRecarga;
    }

    public boolean isSaludAdicional() {
        return saludAdicional;
    }

    public void setSaludAdicional(boolean saludAdicional) {
        this.saludAdicional = saludAdicional;
    }
}
