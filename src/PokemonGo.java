public class PokemonGo {
    public static void main(String args[]) {

        /* Character -- overriding toString format for long concatenations and using object to print out results */
        Character myCharacter = new Character();

        myCharacter.setCharacterName("Kat");
        myCharacter.setCharacterLevel(40);
        myCharacter.setTeam("Mystic");
        myCharacter.setGender("female");
        myCharacter.setBuddyPokemon("Pikachu");

        System.out.println(myCharacter);

        System.out.println("----------------------------------------------------");

        /* Pokemon -- setter and getter but has separate way of printing result (get method not used) */
        Pokemon myPokemon = new Pokemon();

        myPokemon.setPokeName("Mewtwo");
        myPokemon.setHitPoints(415);
        myPokemon.setCombatPower(3200);
        myPokemon.setPokeTypeOne("Psychic");
        myPokemon.setPokeTypeTwo("Fighting");

        myPokemon.printPokemon();

        System.out.println("--------------------------------------------");

        /* Item -- uses mainly setters and getters for printing results(more reusable -- separation of concerns) */
        Item myItem = new Item();

        myItem.setItemName("Basic Potion");
        myItem.setItemAmount(600);
        myItem.setItemDescription("This is a potion");
        myItem.setItemPurpose("to heal 10% of your pokemon's hit points.");
        myItem.setItemCount(20);

        myItem.getItemName();
        myItem.getItemAmount();
        myItem.getItemDescription();
        myItem.getItemPurpose();
        myItem.getItemCount();

        System.out.println("Item Name: " + myItem.itemName);
        System.out.println("Amount: © " + myItem.itemAmount);
        System.out.println("Description: " + myItem.itemDescription + ". The purpose for this potion is " + myItem.itemPurpose);
        System.out.println("Item Count: You have x" + myItem.itemCount + " '" + myItem.itemName + "' in your bag.");
    }
}