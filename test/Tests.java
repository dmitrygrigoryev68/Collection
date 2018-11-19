import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Tests {
    Collection coll = new Collection();

    @Test
    public void testcountGreaterThan() {
        Integer[] arrIn = {1, 2, 3, 4};
        String[] arrSt = {"aaa", "bbb", "ccc", "ddd", "eee"};
        Double[] arrDo = {1., 2., 3., 4.};
        Long[] arrLo = {1L, 2L, 3L, 4L, 5L};

        long actualIn = coll.countGreaterThan(arrIn, 2);
        long actualSt = coll.countGreaterThan(arrSt, "bbb");
        long actualDo = coll.countGreaterThan(arrDo, 2.);
        long actualLo = coll.countGreaterThan(arrLo, 2L);
        assertEquals(actualIn, 2);
        assertEquals(actualSt, 3);
        assertEquals(actualDo, 2);
        assertEquals(actualLo, 3);
    }

    @Test
    public void testsumOfList() {

        List<Integer> listIn = new ArrayList<>();
        List<Double> listDo = new ArrayList<>();
        List<Long> listLo = new ArrayList<>();

        Collections.addAll(listIn, 2, 3, 4, 1);
        Collections.addAll(listDo, 2.5, 3.5, 4.5, 1.5);
        Collections.addAll(listLo, 2L, 3L, 4L, 1L);

        double actualIn = coll.sumOfList(listIn);
        double actualDo = coll.sumOfList(listDo);
        double actualLo = coll.sumOfList(listLo);

        assertEquals(actualIn, 10., 0);
        assertEquals(actualDo, 12., 0);
        assertEquals(actualLo, 10., 0);

    }
    @Test
    public void testCheckListsCircle() {

        List<Integer> listIn1 = new ArrayList<>();
        List<String> listStr1 = new ArrayList<>();
        List<Integer> listIn2 = new ArrayList<>();
        List<String> listStr2 = new ArrayList<>();

        Collections.addAll(listIn1, 2, 3, 4, 1);
        Collections.addAll(listStr1, "aaa", "bbb", "ccc", "ddd");
        Collections.addAll(listIn2, 1, 2, 3, 4);
        Collections.addAll(listStr2, "ddd", "aaa", "bbb", "ccc");

        boolean actualIn = coll.checkListsCircle(listIn1,listIn2);
        boolean actualSt = coll.checkListsCircle(listStr1,listStr2);

        assertEquals(actualIn,true);
        assertEquals(actualSt,true);


    }
}
