
public class SuperHumanBuilder extends CharacterBuilder {

    @Override
    public void buildName() {
        character.name("WonderWoman");
    }

    @Override
    public void buildGender() {
        character.gender("Feminine");
    }

    @Override
    public void buildHealth() {
        character.health(200);
    }

    @Override
    public void buildDamage() {
        character.damage(50);
    }

    @Override
    public void buildSpeed() {
        character.speed(60);
    }

    @Override
    public void buildShield() {
        character.shield(15);
    }
}
