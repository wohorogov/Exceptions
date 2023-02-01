package numbers;

public class ComplexOpException extends Exception {
    private String err;

    public ComplexOpException(String err) {
        this.err = err;
    }

    public String getErr() {
        return err;
    }
}
