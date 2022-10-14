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
        assertEquals("Pride",characterizationDirector.getCharacterization().getCharacterizationName());
    }

    @Test
    public void buildHistory() {
        characterizationDirector.setCharacterizationBuilder(characterizationBuilder = documentExpect);
        characterizationDirector.buildCharacterization();
        assertEquals("Since he was very proud and arrogant, they told him that this would not bring him anything good",characterizationDirector.getCharacterization().getCharacterizationHistory());
    }

    @Test
    public void buildDescription() {
        characterizationDirector.setCharacterizationBuilder(characterizationBuilder = documentExpect);
        characterizationDirector.buildCharacterization();
        assertEquals("In this case, his pride makes him stronger, it increases his shield by 20 units.",characterizationDirector.getCharacterization().getCharacterizationDescription());
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
        assertEquals(20,characterizationDirector.getCharacterization().getCharacterizationShield());
    }
}
