public class LinkedList<E> extends TDAList<E>{
    private Node<E> node;
    private int size;

    //constructor
    public LinkedList() {
        this.node = null;
        this.size = 0;
    }
    public LinkedList(Node<E> node){
        this.node = node;
        this.size = 1;
    }

    
    

}