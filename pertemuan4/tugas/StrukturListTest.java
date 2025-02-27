package pertemuan4.tugas;

import java.util.List;

public class StrukturListTest {
    public static void main(String[] args) {

        StrukturList ListA = new StrukturList();
        ListA.addTail(4.5);
        ListA.addMid(3.4, 1);
        ListA.addHead(2.1);
        
        System.out.print("a. ");
        ListA.displayElement();
        
        System.out.println();
        StrukturList ListB = new StrukturList();
        ListB.addTail(2.1);
        ListB.addTail(5.5);
        ListB.addMid(4.5, 2);
        ListB.addMid(1.1, 2);
        ListB.addHead(3.4);

        System.out.print("b. ");
        ListB.displayElement();
    }
}
