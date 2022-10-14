import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonalityBuilderTest {
    CharacterizationDirector characterizationDirector = new CharacterizationDirector();
    CharacterizationBuilder characterizationBuilder = null;
    PersonalityBuilder documentExpect = new PersonalityBuilder();

    @Test
    public void buildName() {
        characterizationDirector.setCharacterizationBuilder(characterizationBuilder = documentExpect);
        characterizationDirector.buildCharacterization();
        assertEquals(characterizationDirector.getCharacterization().getCharacterizationName(),"Pride");
    }

    @Test
    public void buildHistory() {
        characterizationDirector.setCharacterizationBuilder(characterizationBuilder = documentExpect);
        characterizationDirector.buildCharacterization();
        assertEquals(characterizationDirector.getCharacterization().getCharacterizationHistory(),"Since he was very proud and arrogant, they told him that this would not bring him anything good");
    }

    @Test
    public void buildDescription() {
        characterizationDirector.setCharacterizationBuilder(characterizationBuilder = documentExpect);
        characterizationDirector.buildCharacterization();
        assertEquals(characterizationDirector.getCharacterization().getCharacterizationDescription(),"In this case, his pride makes him stronger, it increases his shield by 20 units.");
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
        assertEquals(characterizationDirector.getCharacterization().getCharacterizationShield(),20);
    }
}
