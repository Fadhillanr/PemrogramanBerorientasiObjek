package latihan4;

public class nodeMain {
    public static void main(String[] args) {
        node node2 = new node(3);
        node node3 = new node(5);
        node node1 = new node(2);


//relasi antar node
        node1.setNext(node2);
        node2.setNext(node3);

//menampilkan hasil node dengan pointer p
        node p = node1;
        while (p != null) {
            System.out.printf("%d ", p.getNilai());
            p = p.getNext();
        }
    }
}