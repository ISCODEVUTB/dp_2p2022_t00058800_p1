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
        assertEquals(characterizationDirector.getCharacterization().getCharacterizationName(),"Fire");
    }

    @Test
    public void buildHistory() {
        characterizationDirector.setCharacterizationBuilder(characterizationBuilder = documentExpect);
        characterizationDirector.buildCharacterization();
        assertEquals(characterizationDirector.getCharacterization().getCharacterizationHistory(),"His parents died in a fire, since that day he has not been the same...");
    }

    @Test
    public void buildDescription() {
        characterizationDirector.setCharacterizationBuilder(characterizationBuilder = documentExpect);
        characterizationDirector.buildCharacterization();
        assertEquals(characterizationDirector.getCharacterization().getCharacterizationDescription(),"When in contact with weapons or fire, his speed and shield decrease by 5 points");
    }

    @Test
    public void buildDamage() {
        characterizationDirector.setCharacterizationBuilder(characterizationBuilder = documentExpect);
        characterizationDirector.buildCharacterization();
        assertEquals(characterizationDirector.getCharacterization().getCharacterizationDamage(),-5);
    }

    @Test
    public void buildShield() {
        characterizationDirector.setCharacterizationBuilder(characterizationBuilder = documentExpect);
        characterizationDirector.buildCharacterization();
        assertEquals(characterizationDirector.getCharacterization().getCharacterizationShield(),-5);
    }
}
