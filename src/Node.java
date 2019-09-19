/*
 * Node.java
 * This program creates a node class using the instance data "data" "front" and "back" and creates
 * accessors and mutators.
 * Date: 9/11/19
 * On my honor: JW
 */
public class Node<T>{
        private T data;
        private Node front;
        private Node back;
        //FIXME: Add comments with what the constructor/method takes it, and a proper name

        //empty constructor all values are null
        public Node(){

        }
        //constructor that sets data to the inputted value, rest of values are null
        public Node(T datain){
            data = datain;

        }
        //constructor takes in and sets the data and the front & back Nodes
        public Node(T datain, Node front, Node back){
            data = datain;
            this.front = front;
            this.back = back;
        }
        //returns front value
        public Node getFront(){
            return front;
        }
        //returns back value
        public Node getBack(){
            return back;
        }
        //returns data
        public T getData(){
            return data;
        }
        //sets data
        public void setData(T newData){
            data = newData;
        }
        //sets new front
     public void setFront(Node newFront){
            front = newFront;
        }
        //sets new back
     public void setBack(Node newBack){
            back = newBack;
        }
        //toString override for better formatting
        @Override
        public String toString(){
            return "Node: " + data.toString();
        }
        //.equals method that can take in any Object but will return false if not a Node of the same value
        @Override
        public boolean equals(Object o){
            if(o instanceof Node){
                return this.getData().equals(((Node)o).getData());
            }else{
                return false;
            }
        }
    }

