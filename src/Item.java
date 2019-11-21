public class Item {
    private String itemName;
    private int itemAmount;
    private String itemDescription;
    private String itemPurpose;
    private int itemCount;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemAmount() {
        return itemAmount;
    }

    public void setItemAmount(int itemAmount) {
        this.itemAmount = itemAmount;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemPurpose() {
        return itemPurpose;
    }

    public void setItemPurpose(String itemPurpose) {
        this.itemPurpose = itemPurpose;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public void printItem(){
        System.out.println("Item Name: " + itemName);
        System.out.println("Amount: © " + itemAmount);
        System.out.println("Description: " + itemDescription + ". The purpose for this potion is " + itemPurpose);
        //System.out.println("Purpose: " + itemPurpose);
        System.out.println("Item Count: You have " + itemCount + " '" + itemName + "' in your bag.");
    }
}