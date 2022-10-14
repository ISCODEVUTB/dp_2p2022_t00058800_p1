public abstract class CharacterizationBuilder {
    protected Characterization characterization;

    public void CreateNewCharacterization(){
        characterization = new Characterization();
    }
    public Characterization getCharacterization(){
        return characterization;
    }

    public abstract void buildName();
    public abstract void buildHistory();
    public abstract void buildDescription();
    public abstract void buildDamage();
    public abstract void buildShield();
}
