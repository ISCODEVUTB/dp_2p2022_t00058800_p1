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
        assertEquals(characterDirector.getCharacter().getName(),"Cyborg");
    }

    @Test
    public void buildGender() {
        characterDirector.setCharacterBuilder(characterBuilder = documentExpect);
        characterDirector.buildCharacter();
        assertEquals(characterDirector.getCharacter().getGender(),"Unknown");
    }

    @Test
    public void buildHealth() {
        characterDirector.setCharacterBuilder(characterBuilder = documentExpect);
        characterDirector.buildCharacter();
        assertEquals(characterDirector.getCharacter().getHealth(),150);
    }

    @Test
    public void buildDamage() {
        characterDirector.setCharacterBuilder(characterBuilder = documentExpect);
        characterDirector.buildCharacter();
        assertEquals(characterDirector.getCharacter().getDamage(),100);
    }

    @Test
    public void buildShield() {
        characterDirector.setCharacterBuilder(characterBuilder = documentExpect);
        characterDirector.buildCharacter();
        assertEquals(characterDirector.getCharacter().getShield(),40);
    }

    @Test
    public void buildSpeed() {
        characterDirector.setCharacterBuilder(characterBuilder = documentExpect);
        characterDirector.buildCharacter();
        assertEquals(characterDirector.getCharacter().getSpeed(),90);
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
        assertEquals(characterDirector.getCharacter().toString(),expect);
    }
}
