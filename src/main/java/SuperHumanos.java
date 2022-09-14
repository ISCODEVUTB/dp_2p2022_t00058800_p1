public class SuperHumanos extends Personajes{
    private boolean volar;
    private boolean superSalto;
    private int superIncremento;

    public SuperHumanos(String nombre, float salud,String sexo,Characterization[] characterization, float ultraje, float velocidad, int escudo,boolean volar, boolean superSalto, int superIncremento,Personajes[] personajes,String[] liga) {
        super(nombre, salud, ultraje, velocidad, escudo,sexo,characterization,personajes,liga);
        this.volar = volar;
        this.superSalto = superSalto;
        this.superIncremento = superIncremento;
    }

    @Override
    public String toString() {
        return "SuperHumanos{" +
                "volar=" + volar +
                ", superSalto=" + superSalto +
                ", superIncremento=" + superIncremento +
                '}';
    }

    public boolean isVolar() {
        return volar;
    }

    public void setVolar(boolean volar) {
        this.volar = volar;
    }

    public boolean isSuperSalto() {
        return superSalto;
    }

    public void setSuperSalto(boolean superSalto) {
        this.superSalto = superSalto;
    }

    public int getSuperIncremento() {
        return superIncremento;
    }

    public void setSuperIncremento(int superIncremento) {
        this.superIncremento = superIncremento;
    }
}
