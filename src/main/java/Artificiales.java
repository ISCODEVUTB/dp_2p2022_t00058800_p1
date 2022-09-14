public class Artificiales extends Personajes{
    private int vidas;
    private boolean volar;
    private float explosion;
    //Constructor de la clase
    public Artificiales(String nombre, float salud,String sexo,Characterization[] characterization, float ultraje, float velocidad, int escudo, int vidas, boolean volar, float explosion,Personajes[] personajes,String[] liga) {
        super(nombre, salud, ultraje, velocidad, escudo,sexo,characterization,personajes,liga);
        this.vidas = vidas;
        this.volar = volar;
        this.explosion = explosion;
    }
    //toString
    @Override
    public String toString() {
        return "Artificiales{" +
                "vidas=" + vidas +
                ", volar=" + volar +
                ", explosion=" + explosion +
                '}';
    }

    //Getters and setters
    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public boolean isVolar() {
        return volar;
    }

    public void setVolar(boolean volar) {
        this.volar = volar;
    }

    public float getExplosion() {
        return explosion;
    }

    public void setExplosion(float explosion) {
        this.explosion = explosion;
    }
}
