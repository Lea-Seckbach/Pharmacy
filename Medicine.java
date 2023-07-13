public abstract class Medicine {
    //Attributes for all medicines
    //Medicine name
    private String name;
    //Medicine company
    private String companyName;
    //Medicine company email
    private String email;
    //Medicine price
    private double price;
    //Medicine quantity
    private int quantity;
    //Medicine expiration quantity
    private int date;
    //Medicine type:
    private Type medicineType;
    enum Type{
        PILLS,
        SYRUP,
        INHALER
    }

    //Empty constructor
    public Medicine() {
    }
    //Full constructor
    public Medicine(String name, String companyName, String email, double price, int quantity,
                    int date, Type type) throws InvalideEmailException {
        setName(name);
        setCompanyName(companyName);
        setEmail(email) ;
        setPrice(price);
        setMedicineType(type);
        setQuantity(quantity);
        setDate(date);

    }
//Getters & Setters
    public String getName() {
        return name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getEmail() {
        return email;
    }

    public double getPrice() {
        return price;
    }
    public Type getMedicineType() {
        return medicineType;
    }
    public int getQuantity() {
        return quantity;
    }
    public int getDate() {
        return date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public void setEmail(String email) throws InvalideEmailException{
        //Email validations
        // Makes sure email contains a @
            if(!email.contains("@"))
                throw new InvalideEmailException(email,"Email must include @");
        // Makes sure email does not start with a @ sign
            if(email.charAt(0)=='@')
                throw new  InvalideEmailException(email,"Email shouldn't start with @ ");
        // Makes sure email does not end with a @ sign
            if(email.endsWith("@"))
                throw new  InvalideEmailException(email,"Email shouldn't end with @ ");
        // Makes sure there is at least one dot after @ sign
        //(I didn't use the index of parameter since once there was a dot both
        //before and after the @ it still gave the exception although the email was correct
            if(!email.substring(email.indexOf('@')).contains("."))
                throw new InvalideEmailException(email,"you must have a dot after @");
        this.email = email.toUpperCase();
        }

    public void setPrice(double price) {
        this.price = price;
    }
    public void setMedicineType(Type medicineType) {
        this.medicineType = medicineType;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setDate(int date) {
        this.date = date;
    }
    public String toString(){
        //prints a attributes
        return "Name: "+name +" Company: "+ companyName+" Email: "+
                email+" Price: "+price+ " Expiration date: "+date+ " Type: "+medicineType;

    }
    //mends to calculate the total inventory of each medicine
    public abstract void totallventory();
    //checks weather the medicine exists in stock
    public  boolean inStock(){
        if (getQuantity()>0)
            return true;
        else return false;
    };
}
