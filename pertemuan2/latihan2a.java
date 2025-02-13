public class latihan2a {
    public static void main(String[] args) {
        
        latihan1 n1 = new latihan1(5);
        latihan1 n2 = new latihan1(7);
        latihan1 n3 = new latihan1(9);
        latihan1 n4 = new latihan1(8);

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);

        latihan1 p = n1;
        while(p != null)
        {
            System.out.printf("%d ", p.getNilai());
            p = p.getNext();
        }
    }
}
