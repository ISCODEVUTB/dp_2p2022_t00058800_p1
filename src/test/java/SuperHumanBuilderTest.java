import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SuperHumanBuilderTest {
    CharacterDirector characterDirector = new CharacterDirector();
    CharacterBuilder characterBuilder = null;
    SuperHumanBuilder documentExpect = new SuperHumanBuilder();
    CharacterizationDirector characterizationDirector = new CharacterizationDirector();
    CharacterizationBuilder characterizationBuilder = null;
    AbilityBuilder documentExpect2 = new AbilityBuilder();

    @Test
    public void buildName() {
        characterDirector.setCharacterBuilder(characterBuilder = documentExpect);
        characterDirector.buildCharacter();
        assertEquals("WonderWoman",characterDirector.getCharacter().getName());
    }

    @Test
    public void buildGender() {
        characterDirector.setCharacterBuilder(characterBuilder = documentExpect);
        characterDirector.buildCharacter();
        assertEquals("Feminine",characterDirector.getCharacter().getGender());
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
        assertEquals(50,characterDirector.getCharacter().getDamage());
    }

    @Test
    public void buildShield() {
        characterDirector.setCharacterBuilder(characterBuilder = documentExpect);
        characterDirector.buildCharacter();
        assertEquals(15,characterDirector.getCharacter().getShield());
    }

    @Test
    public void buildSpeed() {
        characterDirector.setCharacterBuilder(characterBuilder = documentExpect);
        characterDirector.buildCharacter();
        assertEquals(60,characterDirector.getCharacter().getSpeed());
    }

    @Test
    public void add(){
        Characterization characterization = new Characterization();
        Character character = new Character();
        characterDirector.setCharacterBuilder(characterBuilder = documentExpect);
        characterDirector.buildCharacter();
        characterizationDirector.setCharacterizationBuilder(characterizationBuilder = documentExpect2);
        characterizationDirector.buildCharacterization();
        characterization.add(characterizationDirector.getCharacterization());
        character.add(characterizationDirector.getCharacterization());
        assertEquals(character.getCharacterization(),characterization.getCharacterization());
    }
}
