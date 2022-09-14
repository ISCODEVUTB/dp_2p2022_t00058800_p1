public abstract class Characterization {
    private String nombre;
    private String historia;
    //Constructor de la clase
    public Characterization(String nombre, String historia) {
        this.nombre = nombre;
        this.historia = historia;
    }
    //toString
    @Override
    public String toString() {
        return "Characterization{" +
                "nombre='" + nombre + '\'' +
                ", historia='" + historia + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }
}
