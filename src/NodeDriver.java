public class NodeDriver {
    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(8);
        Node n = new Node(5,a, b);
        System.out.println("back of n: "+ n.getBack());
        System.out.println("front of n: " + n.getFront());
        System.out.println("data from n: " + n.getData());
        a.setBack(b);
        b.setFront(a);
        n.setData(10);
        System.out.println(a.toString());
        System.out.println(a.equals(b));
        System.out.println("new back of n: "+ n.getBack());
        System.out.println("new front of n: " + n.getFront());
        System.out.println("new data from n: " + n.getData());


    }
}
