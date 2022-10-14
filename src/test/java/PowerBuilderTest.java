import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowerBuilderTest {
    CharacterizationDirector characterizationDirector = new CharacterizationDirector();
    CharacterizationBuilder characterizationBuilder = null;
    PowerBuilder documentExpect = new PowerBuilder();

    @Test
    public void buildName() {
        characterizationDirector.setCharacterizationBuilder(characterizationBuilder = documentExpect);
        characterizationDirector.buildCharacterization();
        assertEquals("Fly",characterizationDirector.getCharacterization().getCharacterizationName());
    }

    @Test
    public void buildHistory() {
        characterizationDirector.setCharacterizationBuilder(characterizationBuilder = documentExpect);
        characterizationDirector.buildCharacterization();
        assertEquals("At the age of 10 he discovered that he can fly, since then he has not stopped doing it",characterizationDirector.getCharacterization().getCharacterizationHistory());
    }

    @Test
    public void buildDescription() {
        characterizationDirector.setCharacterizationBuilder(characterizationBuilder = documentExpect);
        characterizationDirector.buildCharacterization();
        assertEquals("Can fly, you don't need a description",characterizationDirector.getCharacterization().getCharacterizationDescription());
    }

    @Test
    public void buildDamage() {
        characterizationDirector.setCharacterizationBuilder(characterizationBuilder = documentExpect);
        characterizationDirector.buildCharacterization();
        assertEquals(0,characterizationDirector.getCharacterization().getCharacterizationDamage());
    }

    @Test
    public void buildShield() {
        characterizationDirector.setCharacterizationBuilder(characterizationBuilder = documentExpect);
        characterizationDirector.buildCharacterization();
        assertEquals(5,characterizationDirector.getCharacterization().getCharacterizationShield());
    }
}
