public class Apple extends Fruit{
    private static int appleCount=0;

    public Apple(float weight) {
        super(weight,++appleCount,"Яблоко");
    }

    public Apple(float weight,String name) {
        super(weight,++appleCount,name);
    }
}
