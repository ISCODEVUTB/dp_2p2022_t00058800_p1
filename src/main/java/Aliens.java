public class Aliens extends Personajes{
    private boolean volar;
    private boolean rayosLaser;

    //Constructor de la clase
    public Aliens(String nombre, float salud,String sexo, float ultraje,Characterization[] characterizations, float velocidad, int escudo, boolean volar,boolean rayosLaser, Personajes[] personajes,String[] liga) {
        super(nombre, salud, ultraje, velocidad, escudo,sexo,characterizations,personajes,liga);
        this.volar = volar;
        this.rayosLaser = rayosLaser;
    }
    //Getters and setters
    public boolean isVolar() {
        return volar;
    }

    public void setVolar(boolean volar) {
        this.volar = volar;
    }

    public boolean isRayosLaser() {
        return rayosLaser;
    }
    //toString
    @Override
    public String toString() {
        return "Aliens{" +
                "volar=" + volar +
                ", rayosLaser=" + rayosLaser +
                '}';
    }

    public void setRayosLaser(boolean rayosLaser) {
        this.rayosLaser = rayosLaser;
    }
}
