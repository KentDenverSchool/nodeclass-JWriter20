//FIXME: add header with project name, purpose, name, and date

public class Node<T>{
        private T data;
        private Node front;
        private Node back;
        //FIXME: Add comments with what the constructor/method takes it, and a proper name

        public Node(){

        }
        public Node(T datain) {
            data = datain;

        }
        public Node(T datain, Node front, Node back){
            data = datain;
            this.front = front;
            this.back = back;
        }
        public Node getFront(){
            return front;
        }
        public Node getBack(){
            return back;
        }
        public T getData(){
            return data;
        }
        //FIXME: fix indentation and whitespace
        public void setData(T newData){ data = newData;}
     public void setFront(Node newFront){ front = newFront;}
     public void setBack(Node newBack){ back = newBack;}
        @Override
        public String toString() {
            return "Node: " + data.toString();
        }

        @Override
        public boolean equals(Object o) {
            if(o instanceof Node){
                return this.getData().equals(((Node)o).getData());
            }else{
                return false;
            }
        }
    }

