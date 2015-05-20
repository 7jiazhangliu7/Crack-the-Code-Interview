import java.util.LinkedList;

/**
 * Created by Jiazhang_Liu on 5/20/2015.
 */

//Given a directed graph, design an algorithm to find out whether there is a route
//between two nodes
public class RouteBetweenTwoNodes {
    public boolean hasRoute(Nodes start, Nodes end) {
        if(start == null || end == null) return false;

        LinkedList<Nodes> list = new LinkedList<Nodes>();

        start.state = 0;
        list.add(start);

        while(!list.isEmpty()) {
            Nodes n = list.removeFirst();
            if(n != null) {
                for(Nodes node : n.getNeighbors()) {
                    if(node.state == -1) {
                        if(node == end) {
                            return true;
                        } else {
                            node.state = 0;
                            list.add(node);
                        }
                    }
                }
                n.state = 1;
            }
        }
        return false;
    }

    public static void main(String args[]){
        RouteBetweenTwoNodes i = new RouteBetweenTwoNodes();

        Nodes n1 = new Nodes(1, new LinkedList<Nodes>());
        Nodes n2 = new Nodes(1, new LinkedList<Nodes>());
        Nodes n3 = new Nodes(1, new LinkedList<Nodes>());
        Nodes n4 = new Nodes(1, new LinkedList<Nodes>());
        Nodes n5 = new Nodes(1, new LinkedList<Nodes>());
        Nodes n6 = new Nodes(1, new LinkedList<Nodes>());
        Nodes n7 = new Nodes(1, new LinkedList<Nodes>());
        Nodes n8 = new Nodes(1, new LinkedList<Nodes>());
        Nodes n9 = new Nodes(1, new LinkedList<Nodes>());
        Nodes n10 = new Nodes(1, new LinkedList<Nodes>());

        n1.neighbors.add(n2);n1.neighbors.add(n3);
        n2.neighbors.add(n5);
        n3.neighbors.add(n4);
        n4.neighbors.add(n6);n4.neighbors.add(n7);
        n5.neighbors.add(n9);
        n6.neighbors.add(n9);
        n7.neighbors.add(n8);
        n8.neighbors.add(n6);
        n10.neighbors.add(n9);

        System.err.println(i.hasRoute(n1, n8));
        System.err.println(i.hasRoute(n1, n10));
    }
}
