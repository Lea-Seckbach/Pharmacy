import java.util.ArrayList;

public class Inventory {
     ArrayList<Medicine>medicineArrayList=new ArrayList<>();
     //Adds a new medicine to the inventory and makes sure that the medicine does not exist already,
    //if so, it throws an exception.
    //I chose to validate it with both medicine name and medicine type, since you can have the same medicine
    //in 2 types. E.G.: Acamol an exist both in pills and syrup.
    public void addMedicine(Medicine medicine) throws MedicineAlreadyExistsException {
        for (Medicine medicine1:medicineArrayList) {
            if(medicine1.getName().equalsIgnoreCase(medicine.getName())&&
                    medicine1.getMedicineType().equals(medicine.getMedicineType()))
                throw new MedicineAlreadyExistsException(medicine.getName());
        }
        medicineArrayList.add(medicine);
    }
    //search a medicine by its name and returns its totalventory
    //If the medicine does not exist, ti throws an exception. (also here I used both parameters of type and name
    //for the same reason as mentioned beforewards)
    public void searchMedicineByName(String medicineName, Medicine.Type type)throws MedicineDoesNotExistException{
        Medicine medicine2=null;
        for (Medicine medicine1:medicineArrayList) {
            if(medicine1.getName().equalsIgnoreCase(medicineName)&& medicine1.getMedicineType().equals(type))
                medicine2=medicine1;}
        if (medicine2==null)
            throw new MedicineDoesNotExistException(medicineName,type);
        medicine2.totallventory();

    }
    //search a medicine by type and returns an array list of all the medicines from this type

    public ArrayList<Medicine> searchMedicineByTYpe(Medicine.Type type){
        ArrayList<Medicine> typeList = new ArrayList();
        for(Medicine medicine2:medicineArrayList){
            if(medicine2.getMedicineType().equals(type))
                typeList.add(medicine2);
        }
        return typeList;
    }
    //returns an array list of medicines that are in stock
    public ArrayList<Medicine> getMedicinesInStock()
    {
        ArrayList<Medicine> stockList = new ArrayList();
        for(Medicine medicine2:medicineArrayList)
        {
            if(medicine2.inStock()==true);
            stockList.add(medicine2);
        }
       return stockList;
    }
}





