abstract public class Fruit {
    private float weight;
    private int number;
    private String name;

    public Fruit(float weight, int number,String name) {
        this.weight=weight;
        this.number=number;
        this.name=name;
    }

    @Override
    public String toString() {
        return name+" "+number+" (вес: "+weight+")";
    }

    public float getWeight(){
        return this.weight;
    }
}
