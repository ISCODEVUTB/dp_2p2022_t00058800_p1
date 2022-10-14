public class CharacterDirector {
    private CharacterBuilder characterBuilder;

    public void setCharacterBuilder(CharacterBuilder cc) {
        this.characterBuilder = cc;
    }

    public Character getCharacter() {
        return characterBuilder.getCharacter();
    }

    public void buildCharacter() {
        characterBuilder.CreateNewCharacter();
        characterBuilder.buildName();
        characterBuilder.buildGender();
        characterBuilder.buildHealth();
        characterBuilder.buildDamage();
        characterBuilder.buildSpeed();
        characterBuilder.buildShield();
    }
}
