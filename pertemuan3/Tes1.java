package pertemuan3;

public class Tes1 {
    
    public static void main(String[] args) {
            StrukturList List1 = new StrukturList();
            List1.addTail(3);
            List1.addTail(2);
            List1.addTail(1);
            
            System.out.print("a : ");
            List1.displayElement();

            System.out.println();

            StrukturList List2 = new StrukturList();
            List2.addTail(1);
            List2.addTail(4);
            List2.addTail(5);
            List2.addTail(7);

            System.out.print("b : ");
            List2.displayElement();
        }
    }