package questão01;

public class FilaVaziaException extends RuntimeException {
   
    public FilaVaziaException() {}

    public FilaVaziaException(String message){
        super(message);
    }
}
