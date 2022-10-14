import java.util.ArrayList;
import java.util.List;

public class Character implements IFicha{
    private String name;
    private String gender;
    private float health;
    private float damage;
    private float speed;
    private int shield;
    private List<Characterization> characterization = new ArrayList<Characterization>();
    private List<Character> enemies = new ArrayList<Character>();
    private String league = "";

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", health=" + health +
                ", damage=" + damage +
                ", speed=" + speed +
                ", shield=" + shield +
                ", characterization=" + characterization +
                ", enemies=" + enemies +
                ", league='" + league + '\'' +
                '}';
    }

    public List<Characterization> getCharacterization() {
        return characterization;
    }

    public List<Character> getEnemies() {
        return enemies;
    }

    public String getLeague() {
        return league;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public float getHealth() {
        return health;
    }

    public float getDamage() {
        return damage;
    }

    public float getSpeed() {
        return speed;
    }

    public int getShield() {
        return shield;
    }

    public Character name(String name){
        this.name = name;
        return this;
    }

    public Character gender(String gender){
        this.gender = gender;
        return this;
    }

    public Character health(float health){
        this.health = health;
        return this;
    }

    public Character damage(float damage){
        this.damage = damage;
        return this;
    }

    public Character speed(float speed){
        this.speed = speed;
        return this;
    }

    public Character shield(int shield){
        this.shield = shield;
        return this;
    }
    public void add(Characterization characterization) {
        this.characterization.add(characterization);
    }
    @Override
    public void addLeague(String league) {
        this.league = league;
    }

    @Override
    public void addEnemy(Character enemy) {
        this.enemies.add(enemy);
    }

}
