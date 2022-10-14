import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlienBuilderTest {
    CharacterDirector characterDirector = new CharacterDirector();
    CharacterBuilder characterBuilder = null;
    AliensBuilder documentExpect = new AliensBuilder();
    HumanBuilder documentExpect2 = new HumanBuilder();

    @Test
    public void buildName() {
        characterDirector.setCharacterBuilder(characterBuilder = documentExpect);
        characterDirector.buildCharacter();
        assertEquals(characterDirector.getCharacter().getName(),"Xolos");
    }

    @Test
    public void buildGender() {
        characterDirector.setCharacterBuilder(characterBuilder = documentExpect);
        characterDirector.buildCharacter();
        assertEquals(characterDirector.getCharacter().getGender(),"Unknown");
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
        assertEquals(characterDirector.getCharacter().getDamage(),120);
    }

    @Test
    public void buildShield() {
        characterDirector.setCharacterBuilder(characterBuilder = documentExpect);
        characterDirector.buildCharacter();
        assertEquals(characterDirector.getCharacter().getShield(),40);
    }

    @Test
    public void buildSpeed() {
        characterDirector.setCharacterBuilder(characterBuilder = documentExpect);
        characterDirector.buildCharacter();
        assertEquals(characterDirector.getCharacter().getSpeed(),100);
    }

    @Test
    public void league(){
        characterDirector.setCharacterBuilder(characterBuilder = documentExpect2);
        characterDirector.buildCharacter();
        String league = "DC";
        characterDirector.getCharacter().addLeague(league);
        assertEquals(characterDirector.getCharacter().getLeague(),league);
    }
}
