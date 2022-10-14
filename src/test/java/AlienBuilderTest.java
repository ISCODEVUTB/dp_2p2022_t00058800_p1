import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlienBuilderTest {
    CharacterDirector characterDirector = new CharacterDirector();
    CharacterBuilder characterBuilder = null;
    AliensBuilder documentExpect = new AliensBuilder();
    HumanBuilder documentExpect2 = new HumanBuilder();

    @Test
    public void buildName() {
        characterDirector.setCharacterBuilder(characterBuilder = documentExpect);
        characterDirector.buildCharacter();
        assertEquals("Xolos",characterDirector.getCharacter().getName());
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
        assertEquals(200,characterDirector.getCharacter().getHealth());
    }

    @Test
    public void buildDamage() {
        characterDirector.setCharacterBuilder(characterBuilder = documentExpect);
        characterDirector.buildCharacter();
        assertEquals(120,characterDirector.getCharacter().getDamage());
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
        assertEquals(100,characterDirector.getCharacter().getSpeed());
    }

    @Test
    public void league(){
        characterDirector.setCharacterBuilder(characterBuilder = documentExpect2);
        characterDirector.buildCharacter();
        String league = "DC";
        characterDirector.getCharacter().addLeague(league);
        assertEquals(league,characterDirector.getCharacter().getLeague());
    }
}
