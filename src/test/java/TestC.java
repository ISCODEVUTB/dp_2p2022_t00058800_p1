import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestC {
    /**
     * Add test.
     */
    @Test
    public void addCharacterization() {
        Characterization[] characterization = new Characterization[5];
        characterization[0] = new Poderes("Enojo", "Cuando se enoja se incrementa el daño", 70, 15, false);
        characterization[1] = new Personalidad("Orgullo", "Su orgullo lo hace mas fuerte", false, true, true);
        characterization[2] = new Debilidades("Fuego", "Pasado doloroso", 20, 30, 10);
        Armas a = new Armas("Pistola", "Encontrada", 20, 0, 0);
        a.setHistoria("Nueva historia");
        a.setUltraje(100);
        a.setSaludAdicional(10);
        a.setVelocidadAdicional(0);
        characterization[3] = a;
        Personajes h = new Humanos("Iván", 100, 50, 20, 10, "M", characterization, null, null);
        characterization[4] = new Habilidades("Salto doble", "Puede saltar muy alto", 0, 10, 2);
        h.add(characterization[4], h);
        assertEquals(h.getCharacterization(), characterization);
    }

    /**
     * Add enemy test.
     */
    @Test
    public void addEnemy() {
        Personajes[] enemigo = new Personajes[3];
        enemigo[0] = new Aliens("Yusra", 150, "F", 100, null, 45, 35, false, true, null, null);
        enemigo[1] = new Artificiales("Robot", 300, "No identificado", null, 300, 200, 100, 5, false, 50, null, null);
        Personajes h = new Humanos("Iván", 100, 50, 20, 10, "M", null, enemigo, null);
        enemigo[2] = new SuperHumanos("Superman", 200, "M", null, 200, 100, 40, true, false, 2, null, null);
        h.enemigo(enemigo[2], h);
        assertEquals(h.getEnemigos(), enemigo);
    }

    /**
     * Add ligue test.
     */
    @Test
    public void addLigue() {
        String[] ligas = new String[2];
        ligas[0] = "Teen Titans";
        Personajes h = new Humanos("Iván", 100, 50, 20, 10, "M", null, null, ligas);
        ligas[1] = "Liga de la justicia";
        h.liga(ligas[1], h);
        assertEquals(h.getLiga(), ligas);
    }

    @Test
    public void toStringHumanos() {
        Personajes h = new Humanos("Iván", 100, 50, 20, 10, "M", null, null, null);
        String returnMsj = "Humanos{}";
        assertEquals(h.toString(), returnMsj);
    }

    @Test
    public void toStringCharaterization() {
        Characterization characterization = new Poderes("Enojo", "Cuando se enoja se incrementa el daño", 70, 15, false);
        String msj = "Characterization{" +
                "nombre='" + characterization.getNombre() + '\'' +
                ", historia='" + characterization.getHistoria() + '\'' +
                '}';
        assertEquals(characterization.toString(), msj);
    }

    @Test
    public void toStringPersonajes() {
        Characterization[] characterization = new Characterization[1];
        characterization[0] = new Poderes("Enojo", "Cuando se enoja se incrementa el daño", 70, 15, false);
        Personajes[] enemigo = new Personajes[3];
        enemigo[0] = new Aliens("Yusra", 150, "F", 100, null, 45, 35, false, true, null, null);
        String[] ligas = new String[1];
        ligas[0] = "Teen Titans";
        Personajes h = new Humanos("Iván", 100, 50, 20, 10, "M", characterization, enemigo, null);
        String msj = "Personajes{" +
                "nombre='" + h.getNombre() + '\'' +
                ", sexo='" + h.getSexo() + '\'' +
                ", salud=" + h.getSalud() +
                ", ultraje=" + h.getUltraje() +
                ", velocidad=" + h.getVelocidad() +
                ", escudo=" + h.getEscudo() +
                ", characterization=" + Arrays.toString(characterization) +
                ", enemigos=" + Arrays.toString(enemigo) +
                ", liga=" + Arrays.toString(ligas) +
                '}';
        h.setNombre("Zapata");
        h.setEscudo(2);
        h.setUltraje(100);
        h.setSexo("F");
        assertEquals(h.toString(), "Humanos{}");
    }

    @Test
    public void toStringSuperHumanos() {
        Habilidades h = new Habilidades("Salto triple","Puede saltar 3 veces",0,30,2);
        SuperHumanos s = new SuperHumanos("Superman", 200, "M", null, 200, 100, 40, true, false, 2, null, null);
        s.setSuperIncremento(5);
        s.setSuperSalto(false);
        h.setBonus(2);
        h.setNombre("Salto normal");
        h.setHistoria("Prueba");
        h.setUltraje(1);
        h.setTiempoDeUso(2);
        s.setVolar(false);
        String msj = "SuperHumanos{" +
                "volar=" + s.isVolar() +
                ", superSalto=" + s.isSuperSalto() +
                ", superIncremento=" + s.getSuperIncremento() +
                '}';
        assertEquals(msj, s.toString());
    }
    @Test
    public void toStringAliens(){
        Poderes p = new Poderes("Enojo", "Cuando se enoja se incrementa el daño", 70, 15, false);
        Aliens a = new Aliens("Yusra", 150, "F", 100, null, 45, 35, false, true, null, null);
        p.setSaludAdicional(false);
        p.setHistoria("prueba");
        p.setUltraje(10);
        p.setNombre("Furia");
        p.setTiempoRecarga(2);
        a.setVolar(true);
        String mensaje = "Ultraje: " + p.getUltraje() + "Salud adicional: " + p.isSaludAdicional();
        int tiempo = p.getTiempoRecarga();
        a.setRayosLaser(true);
        String msj = "Aliens{" +
                "volar=" + a.isVolar() +
                ", rayosLaser=" + a.isRayosLaser() +
                '}';
        assertEquals(a.toString(),msj);
    }

    @Test
    public void toStringArtificiales(){
        Debilidades d  = new Debilidades("Fuego", "Pasado doloroso", 20, 30, 10);
        Artificiales a = new Artificiales("Robot", 300, "No identificado", null, 300, 200, 100, 5, false, 50, null, null);
        d.setSaludMenos(10);
        String mensaje2 = "Ultraje menos" + d.getUltrajeMenos() + "Salud menos: " + d.getSaludMenos() + "Velocidad menos: " + d.getVelocidadMenos();
        d.setHistoria("Prueba");
        d.setNombre("Aire");
        d.setUltrajeMenos(40);
        d.setVelocidadMenos(2);
        a.setExplosion(100);
        a.setVolar(false);
        a.setVidas(2);
        String msj = "Artificiales{" +
                "vidas=" + a.getVidas() +
                ", volar=" + a.isVolar() +
                ", explosion=" + a.getExplosion() +
                '}';
        assertEquals(a.toString(),msj);
    }
}
