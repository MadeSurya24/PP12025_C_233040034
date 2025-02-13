public class latihan2 {
    public static void main(String[] args) {
        
        latihan1 n1 = new latihan1(5);
        latihan1 n2 = new latihan1(7);

        n1.setNext(n2);

        latihan1 p = n1;
        while(p != null)
        {
            System.out.printf("%d", p.getNilai());
            p = p.getNext();
        }
    }
}
