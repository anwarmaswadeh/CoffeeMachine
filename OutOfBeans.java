
package coffeemachine1;

public class OutOfBeans extends Exception {
    public OutOfBeans(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
