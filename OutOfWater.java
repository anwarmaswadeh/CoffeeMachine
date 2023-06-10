
package coffeemachine1;

public class OutOfWater extends Exception{
    public OutOfWater(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
