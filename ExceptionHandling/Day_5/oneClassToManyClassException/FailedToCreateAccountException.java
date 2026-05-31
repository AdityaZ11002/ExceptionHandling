package oneClassToManyClassException;

public class FailedToCreateAccountException extends RuntimeException {

    public FailedToCreateAccountException(String msg) {
        super(msg);
    }

}