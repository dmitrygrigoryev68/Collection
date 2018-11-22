import java.util.*;

public class Main {

    public static void main(String[] args) {

        Collection coll = new Collection();

        List<Integer> list1 = new ArrayList();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        List<String> list4 = new LinkedList<>();

        Collections.addAll(list1, 1, 2, 3, 4);
        Collections.addAll(list2, 6, 2, 3, 0);
        Collections.addAll(list3, 60, 2, 13, 10, 64, 12, 8, 6, 25, 31, 68, 10, 14);
        Collections.addAll(list4, "Ivan", "Maria", "John", "Amalia");

        System.out.println(coll.compareLists(list1, list2));
        System.out.println(coll.checkNames(list4));
        System.out.println(coll.reverceNum(list1));
        System.out.println(coll.addUpLists(list1, list2));
        System.out.println(coll.notBiggerThanNum(14, list3));


    }
}