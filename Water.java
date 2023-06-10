
package coffeemachine1;

public class Water {
    private int waterQuantity;
    private static int count ;

    public Water() {
        waterQuantity = 0;
        count++;
    }
    
    public Water(int waterquantity, int count) {
        this.waterQuantity = waterquantity;
        this.count = count;
    }

    public int getWaterQuantity() {
        return waterQuantity;
    }

    public void setWaterQuantity(int waterQuantity) throws OutOfWater {
        if(waterQuantity < 60)
            throw new OutOfWater("you should enter more amount of water");
        else if(waterQuantity >= 1000)
            throw new OutOfWater("you should enter less amount of water");
        else
            this.waterQuantity = waterQuantity;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getInfo() {
        return "waterquantity =" + waterQuantity + ", count =" + count;
    }
    
    public void SingleEspresso() throws EspressoSingleWater {
        if(waterQuantity >= 30)
            throw new EspressoSingleWater("the amount of water must be more than 30");
        else{
            waterQuantity -= 30;
            count++;
        }     
    }
    
    public void DoubleEspresso() throws EspressoDoubleWater{
        if(waterQuantity >= 60)
            throw new EspressoDoubleWater("the amount of water must be more than 60");
        else{
            waterQuantity -= 60;
            count++;
        }    
    }
    
    public void singleAmericano() throws AmricanoSingleWater{
        if(waterQuantity >= 170)
            throw new AmricanoSingleWater("the amount of water must be more than 170");
        else{
            waterQuantity -= 170;
            count++;
        }
    }
    public void doubleAmericano() throws AmricanoDoubleWater{
         if(waterQuantity >= 220)
            throw new AmricanoDoubleWater("the amount of water must be more than 220");
        else{
            waterQuantity -= 220;
            count++;
        }
    }
    
}
