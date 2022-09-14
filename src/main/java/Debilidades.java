public class Debilidades extends Characterization{
    private float ultrajeMenos;
    private float saludMenos;
    private float velocidadMenos;

    public Debilidades(String nombre, String historia, float ultrajeMenos, float saludMenos, float velocidadMenos) {
        super(nombre, historia);
        this.ultrajeMenos = ultrajeMenos;
        this.saludMenos = saludMenos;
        this.velocidadMenos = velocidadMenos;
    }

    public float getUltrajeMenos() {
        return ultrajeMenos;
    }

    public void setUltrajeMenos(float ultrajeMenos) {
        this.ultrajeMenos = ultrajeMenos;
    }

    public float getSaludMenos() {
        return saludMenos;
    }

    public void setSaludMenos(float saludMenos) {
        this.saludMenos = saludMenos;
    }

    public float getVelocidadMenos() {
        return velocidadMenos;
    }

    public void setVelocidadMenos(float velocidadMenos) {
        this.velocidadMenos = velocidadMenos;
    }
}
