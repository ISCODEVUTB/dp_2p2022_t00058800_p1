import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HumanBuilderTest {
    CharacterDirector characterDirector = new CharacterDirector();
    CharacterBuilder characterBuilder = null;
    HumanBuilder documentExpect = new HumanBuilder();

    @Test
    public void buildName() {
        characterDirector.setCharacterBuilder(characterBuilder = documentExpect);
        characterDirector.buildCharacter();
        assertEquals("Ivan",characterDirector.getCharacter().getName());
    }

    @Test
    public void buildGender() {
        characterDirector.setCharacterBuilder(characterBuilder = documentExpect);
        characterDirector.buildCharacter();
        assertEquals("Masculine",characterDirector.getCharacter().getGender());
    }

    @Test
    public void buildHealth() {
        characterDirector.setCharacterBuilder(characterBuilder = documentExpect);
        characterDirector.buildCharacter();
        assertEquals(100,characterDirector.getCharacter().getHealth());
    }

    @Test
    public void buildDamage() {
        characterDirector.setCharacterBuilder(characterBuilder = documentExpect);
        characterDirector.buildCharacter();
        assertEquals(10,characterDirector.getCharacter().getDamage());
    }

    @Test
    public void buildShield() {
        characterDirector.setCharacterBuilder(characterBuilder = documentExpect);
        characterDirector.buildCharacter();
        assertEquals(5,characterDirector.getCharacter().getShield());
    }

    @Test
    public void buildSpeed() {
        characterDirector.setCharacterBuilder(characterBuilder = documentExpect);
        characterDirector.buildCharacter();
        assertEquals(20,characterDirector.getCharacter().getSpeed());
    }
}
