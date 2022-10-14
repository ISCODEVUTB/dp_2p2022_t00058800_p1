import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SuperHumanBuilderTest {
    CharacterDirector characterDirector = new CharacterDirector();
    CharacterBuilder characterBuilder = null;
    SuperHumanBuilder documentExpect = new SuperHumanBuilder();
    CharacterizationDirector characterizationDirector = new CharacterizationDirector();
    CharacterizationBuilder characterizationBuilder = null;
    AbilityBuilder documentExpect2 = new AbilityBuilder();

    @Test
    public void buildName() {
        characterDirector.setCharacterBuilder(characterBuilder = documentExpect);
        characterDirector.buildCharacter();
        assertEquals(characterDirector.getCharacter().getName(),"WonderWoman");
    }

    @Test
    public void buildGender() {
        characterDirector.setCharacterBuilder(characterBuilder = documentExpect);
        characterDirector.buildCharacter();
        assertEquals(characterDirector.getCharacter().getGender(),"Feminine");
    }

    @Test
    public void buildHealth() {
        characterDirector.setCharacterBuilder(characterBuilder = documentExpect);
        characterDirector.buildCharacter();
        assertEquals(characterDirector.getCharacter().getHealth(),200);
    }

    @Test
    public void buildDamage() {
        characterDirector.setCharacterBuilder(characterBuilder = documentExpect);
        characterDirector.buildCharacter();
        assertEquals(characterDirector.getCharacter().getDamage(),50);
    }

    @Test
    public void buildShield() {
        characterDirector.setCharacterBuilder(characterBuilder = documentExpect);
        characterDirector.buildCharacter();
        assertEquals(characterDirector.getCharacter().getShield(),15);
    }

    @Test
    public void buildSpeed() {
        characterDirector.setCharacterBuilder(characterBuilder = documentExpect);
        characterDirector.buildCharacter();
        assertEquals(characterDirector.getCharacter().getSpeed(),60);
    }

    @Test
    public void add(){
        Characterization characterization = new Characterization();
        Character character = new Character();
        characterDirector.setCharacterBuilder(characterBuilder = documentExpect);
        characterDirector.buildCharacter();
        characterizationDirector.setCharacterizationBuilder(characterizationBuilder = documentExpect2);
        characterizationDirector.buildCharacterization();
        characterization.add(characterizationDirector.getCharacterization());
        character.add(characterizationDirector.getCharacterization());
        assertEquals(characterization.getCharacterization(),character.getCharacterization());
    }
}
