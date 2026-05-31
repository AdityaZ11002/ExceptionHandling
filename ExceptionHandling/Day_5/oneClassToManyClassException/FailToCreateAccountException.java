package oneClassToManyClassException;

public class FailToCreateAccountException extends RuntimeException {

    public FailToCreateAccountException(String msg) {
        super(msg);
    }

}