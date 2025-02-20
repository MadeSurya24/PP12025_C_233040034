package pertemuan3;

public class ListMain {

    public static void main(String[] args) {

        StrukturList List = new StrukturList();
        List.addTail(3);
        List.addTail(4);
        List.addTail(5);

        System.out.println("Elemen : ");
        List.displayElement();
    }
}