public class WeaponBuilder extends CharacterizationBuilder{

    @Override
    public void buildName() {
        characterization.characterizationName("Blade");
    }

    @Override
    public void buildHistory() {
        characterization.characterizationHistory("Created by evil goblins in the foundations of volcanoes");
    }

    @Override
    public void buildDescription() {
        characterization.characterizationDescription("This blade brings glory to the wielder, increasing their speed and jump.");
    }

    @Override
    public void buildDamage() {
        characterization.characterizationDamage(50);
    }

    @Override
    public void buildShield() {
        characterization.characterizationShield(10);
    }
}
