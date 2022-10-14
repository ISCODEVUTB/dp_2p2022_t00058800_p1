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
        assertEquals(characterizationDirector.getCharacterization().getCharacterizationName(),"Blade");
    }

    @Test
    public void buildHistory() {
        characterizationDirector.setCharacterizationBuilder(characterizationBuilder = documentExpect);
        characterizationDirector.buildCharacterization();
        assertEquals(characterizationDirector.getCharacterization().getCharacterizationHistory(),"Created by evil goblins in the foundations of volcanoes");
    }

    @Test
    public void buildDescription() {
        characterizationDirector.setCharacterizationBuilder(characterizationBuilder = documentExpect);
        characterizationDirector.buildCharacterization();
        assertEquals(characterizationDirector.getCharacterization().getCharacterizationDescription(),"This blade brings glory to the wielder, increasing their speed and jump.");
    }

    @Test
    public void buildDamage() {
        characterizationDirector.setCharacterizationBuilder(characterizationBuilder = documentExpect);
        characterizationDirector.buildCharacterization();
        assertEquals(characterizationDirector.getCharacterization().getCharacterizationDamage(),50);
    }

    @Test
    public void buildShield() {
        characterizationDirector.setCharacterizationBuilder(characterizationBuilder = documentExpect);
        characterizationDirector.buildCharacterization();
        assertEquals(characterizationDirector.getCharacterization().getCharacterizationShield(),10);
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
        assertEquals(characterizationDirector.getCharacterization().toString(),expect);
    }

}
