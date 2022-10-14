import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CharacterDirector characterDirector = new CharacterDirector();
        Character character = new Character();
        CharacterBuilder characterBuilder = null;
        CharacterizationBuilder characterization = null;
        CharacterizationDirector characterizationDirector = new CharacterizationDirector();

        System.out.println("----------Welcome---------");
        System.out.println("Choose a hero");
        System.out.println("1.Aliens");
        System.out.println("2.Humans");
        System.out.println("3.SuperHumans");
        System.out.println("4.Artificial");
        int hero = sc.nextInt();

        switch (hero){
            case 1: characterBuilder = new AliensBuilder();
                break;
            case 2: characterBuilder = new HumanBuilder();
                break;
            case 3: characterBuilder = new SuperHumanBuilder();
                break;
            case 4: characterBuilder = new ArtificialBuilder();
                break;
            default:break;
        }
        characterDirector.setCharacterBuilder(characterBuilder);
        characterDirector.buildCharacter();
        System.out.println("Ok, now you will add a characterization to your hero");
        System.out.println("1.Power");
        System.out.println("2.Ability");
        System.out.println("3.Debility");
        System.out.println("4.Weapon");
        System.out.println("5.Personality");
        int characterizationOp = sc.nextInt();

        switch (characterizationOp){
            case 1: characterization = new PowerBuilder();
                break;
            case 2: characterization = new AbilityBuilder();
                break;
            case 3: characterization = new DebilityBuilder();
                break;
            case 4: characterization = new WeaponBuilder();
                break;
            case 5: characterization = new PersonalityBuilder();
                break;
            default:break;
        }
        characterizationDirector.setCharacterizationBuilder(characterization);
        characterizationDirector.buildCharacterization();

        System.out.println("Now you will write a league for your hero");
        String league = sc.nextLine();

        character.add(characterizationDirector.getCharacterization());
        character.addLeague(league);

        character.toString();
    }
}
