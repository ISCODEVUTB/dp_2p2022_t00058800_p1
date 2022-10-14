public class AbilityBuilder extends CharacterizationBuilder{

    @Override
    public void buildName() {
        characterization.characterizationName("Double jump");
    }

    @Override
    public void buildHistory() {
        characterization.characterizationHistory("Gym fanatic, maybe that's why he has this ability");
    }

    @Override
    public void buildDescription() {
        characterization.characterizationDescription("Can do a double jump, you don't need a description");
    }

    @Override
    public void buildDamage() {
        characterization.characterizationDamage(0);
    }

    @Override
    public void buildShield() {
        characterization.characterizationShield(5);
    }
}
