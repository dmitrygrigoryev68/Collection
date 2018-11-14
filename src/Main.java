import java.util.*;

public class Main {

    public static void main(String[] args) {

        Collection coll = new Collection();
        SumOfList sumOfList = new SumOfList();
        Integer[] arrIn = {1, 2, 3, 4};
        String [] arrSt = {"aaa","bbb","ccc","ddd"};
        Double [] arrDo = {1.,2.,3.,4.};
        Long   [] arrLo = {1L,2L,3L,4L};


        List<Integer> list1 = new ArrayList();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        List<String> list4 = new LinkedList<>();
        List<Integer> list5 = new LinkedList<>();
        List<Integer> list6 = new LinkedList<>();
        List<Double> list7 = new LinkedList<>();
        Collections.addAll(list1, 1, 2, 3, 4);
        Collections.addAll(list2, 6, 2, 3, 0);
        Collections.addAll(list3, 60, 2, 13, 10, 64, 12, 8, 6, 25, 31, 68, 10, 14);
        Collections.addAll(list4, "Ivan", "Maria", "John", "Amalia");
        Collections.addAll(list5, 1, 2, 3, 4);
        Collections.addAll(list6, 2, 3, 4, 1);
        Collections.addAll(list7, 2., 3., 4., 1.);

        coll.addAllTest(0, list1);
        coll.addAllTest(0, list2);
        coll.addAllTest(0, list3);
        coll.addAllTest(0, list4);
        coll.addAllTest(0, list5);
        coll.addAllTest(0, list6);

        System.out.println(coll.compareLists(list1, list2));
        System.out.println(coll.checkListsCircle(list5, list6));
        System.out.println(coll.checkNames(list4));
        System.out.println(coll.reverceNum(list1));
        System.out.println(coll.addUpLists(list1, list2));
        System.out.println(coll.notBiggerThanNum(14, list3));
        System.out.println(coll.countGreaterThan(arrIn, 2));
        System.out.println(coll.countGreaterThan(arrSt, "bbb"));
        System.out.println(coll.countGreaterThan(arrDo, 2.));
        System.out.println(coll.countGreaterThan(arrLo, 2L));
        System.out.println(sumOfList.sumOfList(list7));
        System.out.println(sumOfList.sumOfList(list6 ));

    }
}