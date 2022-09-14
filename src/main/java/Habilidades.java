public class Habilidades extends Characterization{
    private float ultraje;
    private int tiempoDeUso;
    private int bonus;
    public Habilidades(String nombre, String historia,float ultraje, int tiempoDeUso, int bonus) {
        super(nombre, historia);
        this.ultraje = ultraje;
        this.tiempoDeUso = tiempoDeUso;
        this.bonus = bonus;
    }

    public float getUltraje() {
        return ultraje;
    }

    public void setUltraje(float ultraje) {
        this.ultraje = ultraje;
    }

    public int getTiempoDeUso() {
        return tiempoDeUso;
    }

    public void setTiempoDeUso(int tiempoDeUso) {
        this.tiempoDeUso = tiempoDeUso;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
