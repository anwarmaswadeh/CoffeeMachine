
package coffeemachine1;

public class OutOfGrinding extends Exception {
    public OutOfGrinding(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
