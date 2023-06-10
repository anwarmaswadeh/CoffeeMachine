
package coffeemachine1;

public class Beans {
    private int beansQuantity;
    private int count ;

    public Beans(int beansquantity, int count) {
        this.beansQuantity = beansquantity;
        this.count = count;
    }

    public int getBeansQuantity() {
        return beansQuantity;
    }

    public void setBeansQuantity(int beansQuantity) throws OutOfBeans {
        if(beansQuantity < 70)
            throw new OutOfBeans("you should enter more amount of beans");
        else if(beansQuantity >= 1000)
            throw new OutOfBeans("you should enter less amount of beans");
        else
            this.beansQuantity = beansQuantity;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getInfo() {
        return "Beans{" + "beansquantity=" + beansQuantity + ", count=" + count + '}';
    }
    
    public void SingleEspresso() throws EspressoSingleBeans{
       if(beansQuantity >= 7)
            throw new EspressoSingleBeans("the amount of beans must be more than 7");
        else{
            beansQuantity -= 7;
            count++;
        }
    }
    
    public void DoubleEspresso() throws EspressoDoubleBeans{
        if(beansQuantity >= 14)
            throw new EspressoDoubleBeans("the amount of beans must be more than 14");
        else{
            beansQuantity -= 14;
            count++;
        }   
    }
    
    public void singleAmericano() throws AmricanoSingleBeans{
        if(beansQuantity >= 7)
            throw new AmricanoSingleBeans("the amount of beans must be more than 7");
        else{
            beansQuantity -= 7;
            count++;
        }   
    }
    public void doubleAmericano() throws AmricanoDoubleBeans{
        if(beansQuantity >= 14)
            throw new AmricanoDoubleBeans("the amount of beans must be more than 14");
        else{
            beansQuantity -= 14;
            count++;
        }   
    }
}
