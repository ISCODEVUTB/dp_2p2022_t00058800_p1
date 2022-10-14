
public abstract class CharacterBuilder {
    protected Character character;

    public void CreateNewCharacter(){
        character = new Character();
    }
    public Character getCharacter(){
        return character;
    }

    public abstract void buildName();
    public abstract void buildGender();
    public abstract void buildHealth();
    public abstract void buildDamage();
    public abstract void buildSpeed();
    public abstract void buildShield();
}
