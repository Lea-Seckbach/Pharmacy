public class Inhaler extends Medicine {
    //Number of clicks needed
   private int numOfClicks;
    // An empty constructor
    public Inhaler() {
        super();
        setNumOfClicks(numOfClicks);
    }
    //A full constructor
    public Inhaler(String name, String companyName, String email, double price, int date,
                 int quantity, Type type, int numOfClicks) throws InvalideEmailException {
        super(name, companyName, email, price, quantity, date, type);

    }
    //Getter & Setter for the new attribute
    public int getNumOfClicks() {
        return numOfClicks;
    }
    public void setNumOfClicks(int numOfClicks) {
        this.numOfClicks = numOfClicks;
    }
    //Overriding the totallventory method and prints the total amount of clicks all together
    @Override
    public void totallventory() {
        System.out.println(numOfClicks +" number of clicks in total");
    }
    //Overriding the toString method and prints also the new attribute in addition to hte inherited ones
    public void print(){
        super.toString();
        System.out.println(" Num Of Clicks: "+numOfClicks);
    }
}
