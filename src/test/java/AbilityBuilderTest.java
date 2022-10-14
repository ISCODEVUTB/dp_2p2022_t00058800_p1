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
        assertEquals(characterizationDirector.getCharacterization().getCharacterizationName(),"Double jump");
    }

    @Test
    public void buildHistory() {
        characterizationDirector.setCharacterizationBuilder(characterizationBuilder = documentExpect);
        characterizationDirector.buildCharacterization();
        assertEquals(characterizationDirector.getCharacterization().getCharacterizationHistory(),"Gym fanatic, maybe that's why he has this ability");
    }

    @Test
    public void buildDescription() {
        characterizationDirector.setCharacterizationBuilder(characterizationBuilder = documentExpect);
        characterizationDirector.buildCharacterization();
        assertEquals(characterizationDirector.getCharacterization().getCharacterizationDescription(),"Can do a double jump, you don't need a description");
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
