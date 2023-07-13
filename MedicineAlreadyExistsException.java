public class MedicineAlreadyExistsException extends Exception{
    public MedicineAlreadyExistsException(String medicineName) {
        System.out.println((medicineName+" already exists"));
    }
}
