import java.util.*;

public class Collection<T> {

    public List<String> compareLists(List<T> list1, List<T> list2) {
        List<String> resList = new LinkedList<>();
        for (int i = 0; i < list1.size(); i++)
            if (list1.get(i).equals(list2.get(i))) {
                resList.add("yes");
            } else resList.add("no");
        return resList;
    }

    public List<String> checkNames(List<String> listNames) {
        listNames.removeIf(s -> s.length() == 4);
        return listNames;
    }

    public boolean checkListsCircle(List<T> list1, List<T> list2) {
        for (T ignored : list1) {
            Collections.rotate(list1, 1);
            if (list2.equals(list1)) return true;
        }
        return false;
    }

    public List<T> reverceNum(List<T> list) {
        Collections.reverse(list);
        return list;
    }

    public List<T> addUpLists(List<T> list1, List<T> list2) {
        List<T> resList = new ArrayList<>();
        resList.addAll(list1);
        resList.addAll(list2);
        return resList;
    }

    public List<Integer> notBiggerThanNum(int num, List<Integer> list) {
        list.removeIf(s -> s.compareTo(num) > 0);
        return list;
    }

    public double sumOfList(List<? extends Number> list) {
        return list
                .stream()
                .mapToDouble(n -> n.doubleValue())
                .sum();
    }

    public <T extends Comparable> long countGreaterThan(T[] arr, T obj) {
        return Arrays
                .asList(arr)
                .stream()
                .filter(e -> e.compareTo(obj) > 0)
                .count();
    }
}