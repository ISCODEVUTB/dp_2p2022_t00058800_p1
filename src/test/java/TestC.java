import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestC {
    /**
     * Add test
     */
    @Test
    public void addCharacterization() {
        Characterization[] characterization = new Characterization[5];
        characterization[0] = new Poderes("Enojo","Cuando se enoja se incrementa el daño",70,15,false);
        characterization[1] = new Personalidad("Orgullo","Su orgullo lo hace mas fuerte",false,true,true);
        characterization[2] = new Debilidades("Fuego","Pasado doloroso",20,30,10);
        characterization[3] = new Armas("Pistola","Encontrada",20,0,0);
        Personajes h = new Humanos("Iván", 100, 50, 20, 10,"M",characterization,null,null);
        characterization[4] = new Habilidades("Salto doble","Puede saltar muy alto",0,10,2);
        h.add(characterization[4],h);
        assertEquals(h.getCharacterization(),characterization);
    }

    /**
     * Add enemy test.
     */
    @Test
    public void addEnemy() {
        Personajes[] enemigo = new Personajes[3];
        enemigo[0] = new Aliens("Yusra",150,"F",100,null,45,35,false,true,null,null);
        enemigo[1] = new Artificiales("Robot",300,"No identificado",null,300,200,100,5,false,50,null,null);
        Personajes h = new Humanos("Iván", 100, 50, 20, 10,"M",null,enemigo,null);
        enemigo[2] = new SuperHumanos("Superman",200,"M",null,200,100,40,true,false,2,null,null);
        h.enemigo(enemigo[2],h);
        assertEquals(h.getEnemigos(),enemigo);
    }

    /**
     * Add ligue test.
     */
    @Test
    public void addLigue() {
        String[] ligas = new String[2];
        ligas[0] = "Teen Titans";
        Personajes h = new Humanos("Iván", 100, 50, 20, 10,"M",null,null,ligas);
        ligas[1] = "Liga de la justicia";
        h.liga(ligas[1],h);
        assertEquals(h.getLiga(),ligas);
    }
}
