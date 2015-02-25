package dcll.amer;

/**
 * Created by Yui on 25/02/2015.
 */
public class Resquest2 {
    private int nombre;

    public Resquest2(int i) {
        this.nombre = i;
    }

    public int requestation(int j) {
        return this.nombre += j;
    }
}
