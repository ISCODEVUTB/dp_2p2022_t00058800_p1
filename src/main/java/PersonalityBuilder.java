public class PersonalityBuilder extends CharacterizationBuilder{

    @Override
    public void buildName() {
        characterization.characterizationName("Pride");
    }

    @Override
    public void buildHistory() {
        characterization.characterizationHistory("Since he was very proud and arrogant, they told him that this would not bring him anything good");
    }

    @Override
    public void buildDescription() {
        characterization.characterizationDescription("In this case, his pride makes him stronger, it increases his shield by 20 units.");
    }

    @Override
    public void buildDamage() {
        characterization.characterizationDamage(0);
    }

    @Override
    public void buildShield() {
        characterization.characterizationShield(20);
    }
}
