public class Pills extends Medicine {
    //Number of pills per box
    private int numOfPillsInBox;
    // An empty constructor
    public Pills() {
        super();
        setNumOfPillsInBox(numOfPillsInBox);
    }
    //A full constructor
    public Pills(String name, String companyName, String email, double price, int date,
              int quantity, Type type, int numOfPillsInBox) throws InvalideEmailException {
        super(name, companyName, email, price, quantity, date, type);
        setNumOfPillsInBox(numOfPillsInBox);
    }
    //Getter & Setter for the new attribute

    public int getNumOfPillsInBox() {
        return numOfPillsInBox;
    }

    public void setNumOfPillsInBox(int numOfPillsInBox) {

        this.numOfPillsInBox = numOfPillsInBox;
    }
    //Overriding the totallventory method and prints the total amount of pills
    @Override
    public void totallventory() {
        System.out.println("there are  "+numOfPillsInBox*getQuantity()+" pills in total");

    }
    //Overriding the toString method and prints also the new attribute in addition to hte inherited ones
    @Override
    public String toString() {

        return super.toString()+" Pills in box: "+numOfPillsInBox;
    }

}
