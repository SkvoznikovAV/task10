public class Orange extends Fruit{
    private static int orangeCount=0;

    public Orange(float weight) {
        super(weight,++orangeCount,"Апельсин");
    }
}
