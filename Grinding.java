
package coffeemachine1;

public class Grinding {
    private int grindingRatio;

    public Grinding(int gredanderatio, int count) {
        this.grindingRatio = gredanderatio;
    }

    public int getGrindingRatio() {
        return grindingRatio;
    }

    public void setGrindingRatio(int grindingRatio) {
        this.grindingRatio = grindingRatio;
    }
    
    public void GrindingRatio(int grindingRatio) throws OutOfGrinding{
        if(grindingRatio > 1 || grindingRatio < 10)
            throw new OutOfGrinding("gredanderatio = "+ grindingRatio );
    }

    public String getInfo() {
        return  "gredanderatio = " + grindingRatio;
    }
     
}
