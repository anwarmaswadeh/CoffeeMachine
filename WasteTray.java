
package coffeemachine1;

public class WasteTray {
    private int capacity;
    private boolean clean;

    public WasteTray() {
        capacity = 0;  
    }

    public WasteTray(int capacity, boolean clean) {
        this.capacity = capacity;
        this.clean = clean;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }
    
    public void Capacity(){
        capacity++;
    }
}
