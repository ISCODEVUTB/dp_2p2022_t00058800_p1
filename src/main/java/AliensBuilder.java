
public class AliensBuilder extends CharacterBuilder {
    @Override
    public void buildName() {
        character.name("Xolos");
    }

    @Override
    public void buildGender() {
        character.gender("Unknown");
    }

    @Override
    public void buildHealth() {
        character.health(200);
    }

    @Override
    public void buildDamage() {
        character.damage(120);
    }

    @Override
    public void buildSpeed() {
        character.speed(100);
    }

    @Override
    public void buildShield() {
        character.shield(40);
    }
}
