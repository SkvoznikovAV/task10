import java.util.ArrayList;

public class Box<F extends Fruit> {
    private ArrayList<F> data;
    private String name;

    public Box(String name) {
        data = new ArrayList<>();
        this.name=name;
    }

    public void add(F value) {
        data.add(value);
    }

    public int getSize() {
        return data.size();
    }

    public void remove(int i){
        this.data.remove(i);
    }

    public F get(int i){
        return this.data.get(i);
    }

    public String getInfo() {
        String info=name+": ";
        for (F fruit : data) {
            info=info+fruit + ";  ";
        }
        return info;
    }

    public float getWeight(){
        float res=0f;

        for (F fruit: data) {
            res=res+fruit.getWeight();
        }

        return res;
    }

    public boolean compare(Box box){
        return Math.abs(this.getWeight()-box.getWeight())<0.001f;
    }

    public void pourTo(Box<? super F> boxIn){
        for (int i = 0; i < this.data.size(); i++) {
            boxIn.add(this.data.get(i));
            this.data.remove(i);
            i--;
        }
    }

    public void pourFrom(Box<? super F> boxOut){
        for (int i = 0; i < boxOut.getSize(); i++) {
            this.add((F) boxOut.get(i));
            boxOut.remove(i);
            i--;
        }
    }
}
