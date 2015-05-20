import java.util.LinkedList;

/**
 * Created by Jiazhang_Liu on 5/20/2015.
 */
public class Nodes {
    LinkedList<Nodes> neighbors;
    int val;
    int state;
    public Nodes(int val,  LinkedList<Nodes> neighbors) {
        this.val = val;
        this.neighbors = neighbors;
        state = -1;
    }

    public  LinkedList<Nodes> getNeighbors() {
        return neighbors;
    }
}
