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

    @Override
    public String toString() {
        String format = "Trainer " + characterName + ", an aspiring " + gender + " trainer. Your character level is " + characterLevel +
                " under Team " + team + "'s overwhelming power. Trainer " + characterName +
                " always brings buddy " + buddyPokemon + " whenever they travel.";

        return String.format(format, characterName, characterLevel, team, gender, buddyPokemon);
    }


    /*

     public Character(String characterName, String gender, int characterLevel, String team, String buddyPokemon){
        this.characterName = characterName;
        this.gender = gender;
        this.characterLevel = characterLevel;
        this.team = team;
        this.buddyPokemon = buddyPokemon;
    }

    @Override
    public String toString() {
        String format = "Trainer name: Trainer %s\n" +
                "Character Level: %s\n" +
                "Team: %s\n" +
                "Gender: %s\n" +
                "Buddy Pokemon: %s";

        return String.format(format, characterName, characterLevel, team, gender, buddyPokemon);
    }

   */
}

