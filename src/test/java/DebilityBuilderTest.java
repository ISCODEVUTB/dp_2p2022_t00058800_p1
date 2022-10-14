import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DebilityBuilderTest {
    CharacterizationDirector characterizationDirector = new CharacterizationDirector();
    CharacterizationBuilder characterizationBuilder = null;
    DebilityBuilder documentExpect = new DebilityBuilder();

    @Test
    public void buildName() {
        characterizationDirector.setCharacterizationBuilder(characterizationBuilder = documentExpect);
        characterizationDirector.buildCharacterization();
        assertEquals("Fire",characterizationDirector.getCharacterization().getCharacterizationName());
    }

    @Test
    public void buildHistory() {
        characterizationDirector.setCharacterizationBuilder(characterizationBuilder = documentExpect);
        characterizationDirector.buildCharacterization();
        assertEquals("His parents died in a fire, since that day he has not been the same...",characterizationDirector.getCharacterization().getCharacterizationHistory());
    }

    @Test
    public void buildDescription() {
        characterizationDirector.setCharacterizationBuilder(characterizationBuilder = documentExpect);
        characterizationDirector.buildCharacterization();
        assertEquals("When in contact with weapons or fire, his speed and shield decrease by 5 points",characterizationDirector.getCharacterization().getCharacterizationDescription());
    }

    @Test
    public void buildDamage() {
        characterizationDirector.setCharacterizationBuilder(characterizationBuilder = documentExpect);
        characterizationDirector.buildCharacterization();
        assertEquals(-5,characterizationDirector.getCharacterization().getCharacterizationDamage());
    }

    @Test
    public void buildShield() {
        characterizationDirector.setCharacterizationBuilder(characterizationBuilder = documentExpect);
        characterizationDirector.buildCharacterization();
        assertEquals(-5,characterizationDirector.getCharacterization().getCharacterizationShield());
    }
}
