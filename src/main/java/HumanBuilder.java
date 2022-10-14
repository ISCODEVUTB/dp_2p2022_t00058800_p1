
public class HumanBuilder extends CharacterBuilder {
    @Override
    public void buildName() {
        character.name("Ivan");
    }

    @Override
    public void buildGender() {
        character.gender("Masculine");
    }

    @Override
    public void buildHealth() {
        character.health(100);
    }

    @Override
    public void buildDamage() {
        character.damage(10);
    }

    @Override
    public void buildSpeed() {
        character.speed(20);
    }

    @Override
    public void buildShield() {
        character.shield(5);
    }
}
