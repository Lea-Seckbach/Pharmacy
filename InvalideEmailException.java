public class InvalideEmailException extends Exception{
    public InvalideEmailException (String email, String message){
        System.out.println(email+" is invalid " +message);

    }
}
