import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeaponBuilderTest {
    CharacterizationDirector characterizationDirector = new CharacterizationDirector();
    CharacterizationBuilder characterizationBuilder = null;
    WeaponBuilder documentExpect = new WeaponBuilder();

    @Test
    public void buildName() {
        characterizationDirector.setCharacterizationBuilder(characterizationBuilder = documentExpect);
        characterizationDirector.buildCharacterization();
        assertEquals("Blade",characterizationDirector.getCharacterization().getCharacterizationName());
    }

    @Test
    public void buildHistory() {
        characterizationDirector.setCharacterizationBuilder(characterizationBuilder = documentExpect);
        characterizationDirector.buildCharacterization();
        assertEquals("Created by evil goblins in the foundations of volcanoes",characterizationDirector.getCharacterization().getCharacterizationHistory());
    }

    @Test
    public void buildDescription() {
        characterizationDirector.setCharacterizationBuilder(characterizationBuilder = documentExpect);
        characterizationDirector.buildCharacterization();
        assertEquals("This blade brings glory to the wielder, increasing their speed and jump.",characterizationDirector.getCharacterization().getCharacterizationDescription());
    }

    @Test
    public void buildDamage() {
        characterizationDirector.setCharacterizationBuilder(characterizationBuilder = documentExpect);
        characterizationDirector.buildCharacterization();
        assertEquals(50,characterizationDirector.getCharacterization().getCharacterizationDamage());
    }

    @Test
    public void buildShield() {
        characterizationDirector.setCharacterizationBuilder(characterizationBuilder = documentExpect);
        characterizationDirector.buildCharacterization();
        assertEquals(10,characterizationDirector.getCharacterization().getCharacterizationShield());
    }

    @Test
    public void toString_(){
        characterizationDirector.setCharacterizationBuilder(characterizationBuilder = documentExpect);
        characterizationDirector.buildCharacterization();
        String expect = "Characterization{" +
                "characterizationName='" + characterizationDirector.getCharacterization().getCharacterizationName() + '\'' +
                ", characterizationHistory='" + characterizationDirector.getCharacterization().getCharacterizationHistory() + '\'' +
                ", characterizationDescription='" + characterizationDirector.getCharacterization().getCharacterizationDescription() + '\'' +
                ", characterizationDamage=" + characterizationDirector.getCharacterization().getCharacterizationDamage() +
                ", characterizationShield=" + characterizationDirector.getCharacterization().getCharacterizationShield() +
                '}';
        assertEquals(expect,characterizationDirector.getCharacterization().toString());
    }

}
