public class DebilityBuilder extends CharacterizationBuilder{

    @Override
    public void buildName() {
        characterization.characterizationName("Fire");
    }

    @Override
    public void buildHistory() {
        characterization.characterizationHistory("His parents died in a fire, since that day he has not been the same...");
    }

    @Override
    public void buildDescription() {
        characterization.characterizationDescription("When in contact with weapons or fire, his speed and shield decrease by 5 points");
    }

    @Override
    public void buildDamage() {
        characterization.characterizationDamage(-5);
    }

    @Override
    public void buildShield() {
        characterization.characterizationShield(-5);
    }
}
