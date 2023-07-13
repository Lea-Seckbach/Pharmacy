public class Syrup extends Medicine {
    //Number of ML in bottle
    private int bottleContent;
    // An empty constructor
    public Syrup() {
        super();
        setBottleContent(bottleContent);
    }
    // A full constructor
    public Syrup(String name, String companyName, String email, double price, int date,
                 int quantity, Type type, int bottleContent) throws InvalideEmailException {
        super(name, companyName, email, price, quantity, date, type);
        setBottleContent(bottleContent);
    }
    //Getter & Setter for the new attribute
    public int getBottleContent() {
        return bottleContent;
    }

    public void setBottleContent(int bottleContent) {
        this.bottleContent = bottleContent;
    }
    //Overriding the totallventory method and prints the total amount of ML in all the bottles in the inventory
    @Override
    public void totallventory() {
        System.out.println("there is "+getQuantity()*getBottleContent()+" ML in total");
    }
    //Overriding the toString method and prints also the new attribute in addition to hte inherited ones
    @Override
    public String toString() {
          return (super.toString()+(" bottle content: "+bottleContent));
    }
}
