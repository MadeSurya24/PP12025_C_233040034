package pertemuan4.tugas;

public class Node {
    private double data;
    private Node next;

    public Node(double data){
        this.data = data;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public Node getNext(){
        return next;
    }

    public void setData(double data){
        this.data = data;
    }
    
    public double getData(){
        return data;
    }  
}
