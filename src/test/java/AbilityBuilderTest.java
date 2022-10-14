import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbilityBuilderTest {
    CharacterizationDirector characterizationDirector = new CharacterizationDirector();
    CharacterizationBuilder characterizationBuilder = null;
    AbilityBuilder documentExpect = new AbilityBuilder();

    @Test
    public void buildName() {
        characterizationDirector.setCharacterizationBuilder(characterizationBuilder = documentExpect);
        characterizationDirector.buildCharacterization();
        assertEquals("Double jump",characterizationDirector.getCharacterization().getCharacterizationName());
    }

    @Test
    public void buildHistory() {
        characterizationDirector.setCharacterizationBuilder(characterizationBuilder = documentExpect);
        characterizationDirector.buildCharacterization();
        assertEquals("Gym fanatic, maybe that's why he has this ability",characterizationDirector.getCharacterization().getCharacterizationHistory());
    }

    @Test
    public void buildDescription() {
        characterizationDirector.setCharacterizationBuilder(characterizationBuilder = documentExpect);
        characterizationDirector.buildCharacterization();
        assertEquals("Can do a double jump, you don't need a description",characterizationDirector.getCharacterization().getCharacterizationDescription());
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
