import java.util.Arrays;

public abstract class  Personajes implements IFicha{
    private String nombre;
    private String sexo;
    private float salud;
    private float ultraje;
    private float velocidad;
    private int escudo;
    private Characterization[] characterization;
    private Personajes[] enemigos;
    private String[] liga;


    public Personajes(String nombre, float salud, float ultraje, float velocidad, int escudo, String sexo, Characterization[] characterization, Personajes[] enemigos, String[] liga) {
        this.nombre = nombre;
        this.salud = salud;
        this.ultraje = ultraje;
        this.velocidad = velocidad;
        this.escudo = escudo;
        this.sexo = sexo;
        this.characterization = characterization;
        this.enemigos = enemigos;
        this.liga = liga;
    }

    public String getNombre() {
        return nombre;
    }

    public float getSalud() {
        return salud;
    }

    public float getUltraje() {
        return ultraje;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalud(float salud) {
        this.salud = salud;
    }

    public void setUltraje(float ultraje) {
        this.ultraje = ultraje;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public Characterization[] getCharacterization() {
        return characterization;
    }

    public void setCharacterization(Characterization[] characterization) {
        this.characterization = characterization;
    }
    public Personajes[] getEnemigos() {
        return enemigos;
    }

    public void setEnemigos(Personajes[] enemigos) {
        this.enemigos = enemigos;
    }

    public String[] getLiga() {
        return liga;
    }

    public void setLiga(String[] liga) {
        this.liga = liga;
    }

    public void add(Characterization characterization, Personajes personaje) {
        Characterization[] aux = personaje.getCharacterization();
        aux[0] = characterization;
        personaje.setCharacterization(aux);
    }

    @Override
    public String toString() {
        return "Personajes{" +
                "nombre='" + nombre + '\'' +
                ", sexo='" + sexo + '\'' +
                ", salud=" + salud +
                ", ultraje=" + ultraje +
                ", velocidad=" + velocidad +
                ", escudo=" + escudo +
                ", characterization=" + Arrays.toString(characterization) +
                ", enemigos=" + Arrays.toString(enemigos) +
                ", liga=" + Arrays.toString(liga) +
                '}';
    }

    @Override
    public void liga(String liga, Personajes personaje) {
        String[] aux = personaje.getLiga();
        aux[0] = liga;
        personaje.setLiga(aux);
    }

    @Override
    public void enemigo(Personajes enemigo,Personajes personaje) {
        Personajes[] aux = personaje.getEnemigos();
        aux[0] = enemigo;
        personaje.setEnemigos(aux);
    }
}
