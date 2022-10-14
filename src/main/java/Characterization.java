import java.util.ArrayList;
import java.util.List;

public class Characterization {
    private String characterizationName;
    private String characterizationHistory;
    private String characterizationDescription;
    private float characterizationDamage;
    private int characterizationShield;

    private List<Characterization> characterization = new ArrayList<>();

    @Override
    public String toString() {
        return "Characterization{" +
                "characterizationName='" + characterizationName + '\'' +
                ", characterizationHistory='" + characterizationHistory + '\'' +
                ", characterizationDescription='" + characterizationDescription + '\'' +
                ", characterizationDamage=" + characterizationDamage +
                ", characterizationShield=" + characterizationShield +
                '}';
    }

    public String getCharacterizationName() {
        return characterizationName;
    }

    public String getCharacterizationHistory() {
        return characterizationHistory;
    }

    public String getCharacterizationDescription() {
        return characterizationDescription;
    }

    public float getCharacterizationDamage() {
        return characterizationDamage;
    }

    public int getCharacterizationShield() {
        return characterizationShield;
    }

    public Characterization characterizationName(String name){
        this.characterizationName = name;
        return this;
    }

    public Characterization characterizationHistory(String history){
        this.characterizationHistory = history;
        return this;
    }

    public Characterization characterizationDescription(String description){
        this.characterizationDescription = description;
        return this;
    }

    public Characterization characterizationDamage(float damage){
        this.characterizationDamage = damage;
        return this;
    }

    public Characterization characterizationShield(int shield){
        this.characterizationShield = shield;
        return this;
    }

    public void add(Characterization characterization){
        this.characterization.add(characterization);
    }

    public List<Characterization> getCharacterization() {
        return characterization;
    }
}
