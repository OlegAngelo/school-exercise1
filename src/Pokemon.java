public class Pokemon {

    private String pokeName;
    private int hitPoints;
    private int combatPower;
    private String pokeTypeOne;
    private String pokeTypeTwo;

    public String getPokeName() {
        return pokeName;
    }

    public void setPokeName(String pokeName) {
        this.pokeName = pokeName;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getCombatPower() {
        return combatPower;
    }

    public void setCombatPower(int combatPower) {
        this.combatPower = combatPower;
    }

    public String getPokeTypeOne() {
        return pokeTypeOne;
    }

    public void setPokeTypeOne(String pokeTypeOne) {
        this.pokeTypeOne = pokeTypeOne;
    }

    public String getPokeTypeTwo() {
        return pokeTypeTwo;
    }

    public void setPokeTypeTwo(String pokeTypeTwo) {
        this.pokeTypeTwo = pokeTypeTwo;
    }

    public void printPokemon(){
        System.out.println("Pokemon Name: " + pokeName);
        System.out.println("Hit Points: " + hitPoints);
        System.out.println("Combat Power: " + combatPower);
        System.out.println("Pokemon Type 1: " + pokeTypeOne);
        System.out.println("Pokemon Type 2: " + pokeTypeTwo);
    }
}