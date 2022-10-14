import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArtificialBuilderTest {
    CharacterDirector characterDirector = new CharacterDirector();
    CharacterBuilder characterBuilder = null;
    ArtificialBuilder documentExpect = new ArtificialBuilder();

    @Test
    public void buildName() {
        characterDirector.setCharacterBuilder(characterBuilder = documentExpect);
        characterDirector.buildCharacter();
        assertEquals("Cyborg",characterDirector.getCharacter().getName());
    }

    @Test
    public void buildGender() {
        characterDirector.setCharacterBuilder(characterBuilder = documentExpect);
        characterDirector.buildCharacter();
        assertEquals("Unknown",characterDirector.getCharacter().getGender());
    }

    @Test
    public void buildHealth() {
        characterDirector.setCharacterBuilder(characterBuilder = documentExpect);
        characterDirector.buildCharacter();
        assertEquals(150,characterDirector.getCharacter().getHealth());
    }

    @Test
    public void buildDamage() {
        characterDirector.setCharacterBuilder(characterBuilder = documentExpect);
        characterDirector.buildCharacter();
        assertEquals(100,characterDirector.getCharacter().getDamage());
    }

    @Test
    public void buildShield() {
        characterDirector.setCharacterBuilder(characterBuilder = documentExpect);
        characterDirector.buildCharacter();
        assertEquals(40,characterDirector.getCharacter().getShield());
    }

    @Test
    public void buildSpeed() {
        characterDirector.setCharacterBuilder(characterBuilder = documentExpect);
        characterDirector.buildCharacter();
        assertEquals(90,characterDirector.getCharacter().getSpeed());
    }

    @Test
    public void toString_(){
        characterDirector.setCharacterBuilder(characterBuilder = documentExpect);
        characterDirector.buildCharacter();
        String expect = "Character{" +
                "name='" + characterDirector.getCharacter().getName() + '\'' +
                ", gender='" + characterDirector.getCharacter().getGender() + '\'' +
                ", health=" + characterDirector.getCharacter().getHealth() +
                ", damage=" + characterDirector.getCharacter().getDamage() +
                ", speed=" + characterDirector.getCharacter().getSpeed() +
                ", shield=" + characterDirector.getCharacter().getShield() +
                ", characterization=" + characterDirector.getCharacter().getCharacterization() +
                ", enemies=" + characterDirector.getCharacter().getEnemies() +
                ", league='" + characterDirector.getCharacter().getLeague() + '\'' +
                '}';
        assertEquals(expect,characterDirector.getCharacter().toString());
    }
}
