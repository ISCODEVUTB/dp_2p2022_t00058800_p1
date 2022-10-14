public class CharacterizationDirector {
    private CharacterizationBuilder characterizationBuilder;

    public void setCharacterizationBuilder(CharacterizationBuilder cc) {
        this.characterizationBuilder = cc;
    }

    public Characterization getCharacterization() {
        return characterizationBuilder.getCharacterization();
    }

    public void buildCharacterization() {
        characterizationBuilder.CreateNewCharacterization();
        characterizationBuilder.buildName();
        characterizationBuilder.buildHistory();
        characterizationBuilder.buildDescription();
        characterizationBuilder.buildDamage();
        characterizationBuilder.buildShield();
    }
}
