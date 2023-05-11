import java.util.List;

public class Main {
    public static void main(String[] args) {
        listOfElements<Integer> listOfElements = new listOfElements<>();
        listOfElements.addLast(7);
        listOfElements.addLast(8);
        listOfElements.addLast(9);
        listOfElements.addFirst(6);

        for (int i : listOfElements){
            System.out.println(i);
        }

        listOfElements<String> stringlistOfElements = new listOfElements<>();
        stringlistOfElements.addLast("end");
        stringlistOfElements.addFirst("start");

        for (String i : stringlistOfElements) {
            System.out.println(i);
        }

    }
}
