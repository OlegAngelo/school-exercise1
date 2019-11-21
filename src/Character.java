public class Character {
    private String characterName;
    private int characterLevel;
    private String team;
    private String gender;
    private String buddyPokemon;

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public int getCharacterLevel() {
        return characterLevel;
    }

    public void setCharacterLevel(int characterLevel) {
        this.characterLevel = characterLevel;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBuddyPokemon() {
        return buddyPokemon;
    }

    public void setBuddyPokemon(String buddyPokemon) {
        this.buddyPokemon = buddyPokemon;
    }

    public void printCharacter(){
        System.out.println("Trainer Name: Trainer " + characterName);
        System.out.println("Character Level: " + characterLevel);
        System.out.println("Team: " + team);
        System.out.println("Gender: " + gender);
        System.out.println("Buddy Pokemon: " + buddyPokemon);
    }
}

//team
//gender
//buddyPokemon
//characterLevel
//characterOutfit