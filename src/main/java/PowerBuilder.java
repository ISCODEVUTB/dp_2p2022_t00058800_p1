public class PowerBuilder extends CharacterizationBuilder {
    @Override
    public void buildName() {
        characterization.characterizationName("Fly");
    }

    @Override
    public void buildHistory() {
        characterization.characterizationHistory("At the age of 10 he discovered that he can fly, since then he has not stopped doing it");
    }

    @Override
    public void buildDescription() {
        characterization.characterizationDescription("Can fly, you don't need a description");
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
