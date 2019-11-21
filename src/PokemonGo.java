
public class PokemonGo {

    public static void main(String args[]) {
        /* Character */
        Character myCharacter = new Character();

        myCharacter.setCharacterName("Kat");
        myCharacter.setCharacterLevel(40);
        myCharacter.setTeam("Mystic");
        myCharacter.setGender("Male");
        myCharacter.setBuddyPokemon("Pikachu");

        myCharacter.printCharacter();

        System.out.println("--------------------------------------------");
        /* Pokemon */
        Pokemon myPokemon = new Pokemon();

        myPokemon.setPokeName("Mewtwo");
        myPokemon.setHitPoints(415);
        myPokemon.setCombatPower(3200);
        myPokemon.setPokeTypeOne("Psychic");
        myPokemon.setPokeTypeTwo("Fighting");

        myPokemon.printPokemon();

        System.out.println("--------------------------------------------");
        /* Item */
        Item myItem = new Item();

        myItem.setItemName("Basic Potion");
        myItem.setItemAmount(600);
        myItem.setItemDescription("This is a potion");
        myItem.setItemPurpose("to heal 10% of your pokemon's hit points.");
        myItem.setItemCount(20);

        myItem.printItem();
    }

}