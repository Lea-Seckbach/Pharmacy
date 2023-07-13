public class MedicineDoesNotExistException extends Exception{
    public MedicineDoesNotExistException(String medicineName, Medicine.Type type) {
        System.out.println((medicineName+" "+ type+" Does not exist"));
    }
}
