/*
 * NodeDriver.java
 * This program tests the node class methods
 * Date: 9/11/19
 * On my honor: JW
 */
public class NodeDriver {
    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(8);
        Node n = new Node(5,a, b);
        System.out.println("back of n Expected value: " + "Node: 8"+ " Actual value: " + n.getBack());
        System.out.println("front of n Expected value: " + "Node: 4"+ " Actual value: " + n.getFront());
        System.out.println("data from n Expected value: " +"5" + " Actual value: " + n.getData());
        n.setBack(a);
        n.setFront(b);
        n.setData(10);
        System.out.println("Expected toString: Node: 4" + " actual toString: " + a.toString());
        System.out.println("a is equal to b Expected value: false, Actual value: " + a.equals(b));
        System.out.println("new back of n Expected value: Node: 4, Actual value: "+ n.getBack());
        System.out.println("new front of n Expected value: Node: 8, Actual value: " + n.getFront());
        System.out.println("new data from n Expected value: 10, Actual value: " + n.getData());
        a.setData(8);
        System.out.println("a is equal to b: Expected value: true, Actual value: " + a.equals(b));

    }
}
