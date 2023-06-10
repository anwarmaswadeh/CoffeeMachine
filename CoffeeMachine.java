
package coffeemachine1;

public class CoffeeMachine {
    private Beans beans;
    private Water water;
    private Grinding gredandes;
    private WasteTray wasteTray;
    private int count;

    public CoffeeMachine() {
        wasteTray = new WasteTray();
    }
 
    public CoffeeMachine(Beans beans, Water water, Grinding gredandes, WasteTray wasteTray, int count) {
        this.beans = beans;
        this.water = water;
        this.gredandes = gredandes;
        this.wasteTray = wasteTray;
        this.count = count;
    }

    public Beans getBeans() {
        return beans;
    }

    public void setBeans(Beans beans) {
        this.beans = beans;
    }

    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }

    public Grinding getGredandes() {
        return gredandes;
    }

    public void setGredandes(Grinding gredandes) {
        this.gredandes = gredandes;
    }

    public WasteTray getWasteTray() {
        return wasteTray;
    }

    public void setWasteTray(WasteTray wasteTray) {
        this.wasteTray = wasteTray;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void makeCoffee(int coffeeChoice , int shotChoice) throws EspressoSingleBeans,EspressoSingleWater
            , EspressoDoubleBeans, EspressoDoubleWater
            , AmricanoSingleBeans, AmricanoSingleWater
            , AmricanoDoubleBeans, AmricanoDoubleWater{
        if(coffeeChoice == 1 && shotChoice == 1){
            beans.SingleEspresso();
            water.SingleEspresso();
            wasteTray.Capacity();
        } 
        else if (coffeeChoice == 1 && shotChoice == 2) {
            beans.DoubleEspresso();
            water.DoubleEspresso();
            wasteTray.Capacity();
        }
        else if (coffeeChoice == 2 && shotChoice == 1) {
            beans.singleAmericano();
            water.singleAmericano();
            wasteTray.Capacity();
        }
        else{
            beans.doubleAmericano();
            water.doubleAmericano();
            wasteTray.Capacity();
        }         
    }
    
    public void clean(){
        wasteTray.setCapacity(0);
        wasteTray.setClean(true);
    }

    public String getInfo() {
        return  "beans = " + beans + ", water = " + water + ", gredandes = " + gredandes 
                +", wasteTray = " + wasteTray + ", count = " + count;
    }
    
}
