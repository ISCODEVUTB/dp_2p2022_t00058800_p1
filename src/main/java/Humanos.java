public class Humanos extends Personajes{
    public Humanos(String nombre, float salud, float ultraje, float velocidad, int escudo,String sexo, Characterization[] characterization,Personajes[] personajes,String[] liga) {
        super(nombre, salud, ultraje, velocidad, escudo, sexo,characterization,personajes,liga);
    }

    @Override
    public String toString() {
        return "Humanos{}";
    }
}
