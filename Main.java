public class Main  {
    public static void main(String[] args) throws InvalideEmailException, MedicineAlreadyExistsException {
        //Creating a new inventory
        Inventory inventory = new Inventory();
        //Defining the medicines before the try & catch so that we can use them outside the try & catch block
        Syrup syrup1 = null;
        Syrup syrup2 = null;
        Syrup syrup3=null;
        Pills pills1=null;
        Pills pills2=null;
        Pills pills3=null;
        Inhaler inhaler1=null;
        Inhaler inhaler2=null;
        Inhaler inhaler3=null;
        Syrup syrup4=null;
        Pills pills4=null;
        //Creating 3 medicines of each type:
        try {
            syrup1 = new Syrup("Acamol", "Teva", "ֲtevaMedicines@gmail.com",
                    25.5, 2025, 3, Medicine.Type.SYRUP, 50);

         syrup2 = new Syrup("Nurofen", "Teva", "tevaMedi.cines@gmail.com",
                50.0, 2028, 3, Medicine.Type.SYRUP, 50);

         syrup3 = new Syrup("Optalgin", "Rekah", "RekahPharm@gmail.com",
                65.0, 2030, 3, Medicine.Type.SYRUP, 50);

         pills1 = new Pills("Acamol", "Teva", "tevaMedicines@gmail.com",
                25.5, 2024, 3, Medicine.Type.PILLS, 50);
         pills2 = new Pills("Advil", "Teva", "tevaMedicines@gmail.com",
                125.5, 2025, 3, Medicine.Type.PILLS, 50);
         pills3 = new Pills("Optalgin", "Teva", "tevaMedicines@gmail.com",
                80, 2023, 3, Medicine.Type.PILLS, 50);
         inhaler1 = new Inhaler("Betnezol", "Teva", "tevaMedicines@gmail.com",
                20, 2060, 3, Medicine.Type.INHALER, 10);
         inhaler2 = new Inhaler("Budycort", "Teva", "tevaMedicines@gmail.com",
                30, 2020, 3, Medicine.Type.INHALER, 5);
         inhaler3 = new Inhaler("Zinat", "Teva", "tevaMedicines@gmail.com",
                10, 2025, 3, Medicine.Type.INHALER, 3);}
        catch (InvalideEmailException e) {

        }
        // Adding the medicines to the inventory:
        try {
            inventory.addMedicine(syrup1);
            inventory.addMedicine(syrup2);
            inventory.addMedicine(syrup3);
            inventory.addMedicine(pills1);
            inventory.addMedicine(pills3);
            inventory.addMedicine(pills2);
            inventory.addMedicine(inhaler1);
            inventory.addMedicine(inhaler2);
            inventory.addMedicine(inhaler3);}
        catch (MedicineAlreadyExistsException e) {
        }
        //Searching a medicine:
        try {
            inventory.searchMedicineByName("Acamol", Medicine.Type.SYRUP);}

        catch (MedicineDoesNotExistException e) {

       }
        // Searching for medicines from a type and printing their arreyList:
        System.out.println("Medicines that exist in syrup "+inventory.searchMedicineByTYpe(Medicine.Type.SYRUP));
        System.out.println("Medicines that exist in pills "+inventory.searchMedicineByTYpe(Medicine.Type.PILLS));
        System.out.println("Medicines that exist in inhaler "+inventory.searchMedicineByTYpe(Medicine.Type.INHALER));
        //prints an arreyList of all the medicines in stock:
        System.out.println(inventory.getMedicinesInStock());
        //Adding an existing medicine to the inventory: (same name and type)

        syrup4=new Syrup("Optalgin", "Teva", "tevaMedicines@gmail.com",
                80, 2023, 3, Medicine.Type.PILLS, 40);
        try {
            inventory.addMedicine(syrup4);
        }
        catch (MedicineAlreadyExistsException e) {
        }
        //Searching for a non-existing medicine (non-existing name for this type
        try {
            inventory.searchMedicineByName("Acamol", Medicine.Type.INHALER);
        }
        catch (MedicineDoesNotExistException e){
        }
        //Adding a medicine with incorrect email:
        try {
            pills4 = new Pills("Optalgin", "Teva", "evaMedic.ines@gmailcom",
                    80, 2023, 3, Medicine.Type.PILLS, 50);
        }
        catch (InvalideEmailException e){

        }
    }
}