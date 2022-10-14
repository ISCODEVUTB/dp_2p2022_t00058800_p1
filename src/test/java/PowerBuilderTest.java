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
        assertEquals(characterizationDirector.getCharacterization().getCharacterizationName(),"Fly");
    }

    @Test
    public void buildHistory() {
        characterizationDirector.setCharacterizationBuilder(characterizationBuilder = documentExpect);
        characterizationDirector.buildCharacterization();
        assertEquals(characterizationDirector.getCharacterization().getCharacterizationHistory(),"At the age of 10 he discovered that he can fly, since then he has not stopped doing it");
    }

    @Test
    public void buildDescription() {
        characterizationDirector.setCharacterizationBuilder(characterizationBuilder = documentExpect);
        characterizationDirector.buildCharacterization();
        assertEquals(characterizationDirector.getCharacterization().getCharacterizationDescription(),"Can fly, you don't need a description");
    }

    @Test
    public void buildDamage() {
        characterizationDirector.setCharacterizationBuilder(characterizationBuilder = documentExpect);
        characterizationDirector.buildCharacterization();
        assertEquals(characterizationDirector.getCharacterization().getCharacterizationDamage(),0);
    }

    @Test
    public void buildShield() {
        characterizationDirector.setCharacterizationBuilder(characterizationBuilder = documentExpect);
        characterizationDirector.buildCharacterization();
        assertEquals(characterizationDirector.getCharacterization().getCharacterizationShield(),5);
    }
}
