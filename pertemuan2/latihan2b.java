public class latihan2b {
    public static void main(String[] args) {
        
        latihan1 n1 = new latihan1(2);
        latihan1 n2 = new latihan1(3);
        latihan1 n3 = new latihan1(5);
        latihan1 n4 = new latihan1(7);
        latihan1 n5 = new latihan1(9);

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);

        latihan1 p = n1;
        while(p != null)
        {
            System.out.printf("%d, ", p.getNilai());
            p = p.getNext();
        }
    }
}
