
public class ArtificialBuilder extends CharacterBuilder {
    @Override
    public void buildName() {
        character.name("Cyborg");
    }

    @Override
    public void buildGender() {
        character.gender("Unknown");
    }

    @Override
    public void buildHealth() {
        character.health(150);
    }

    @Override
    public void buildDamage() {
        character.damage(100);
    }

    @Override
    public void buildSpeed() {
        character.speed(90);
    }

    @Override
    public void buildShield() {
        character.shield(40);
    }
}
