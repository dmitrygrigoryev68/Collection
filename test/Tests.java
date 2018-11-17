import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Tests {

    @Test
    public void testcountGreaterThan() {
        Integer[] arrIn = {1, 2, 3, 4};
        String[] arrSt = {"aaa", "bbb", "ccc", "ddd", "eee"};
        Double[] arrDo = {1., 2., 3., 4.};
        Long[] arrLo = {1L, 2L, 3L, 4L, 5L};

        long actualIn = Collection.countGreaterThan(arrIn, 2);
        long actualSt = Collection.countGreaterThan(arrSt, "bbb");
        long actualDo = Collection.countGreaterThan(arrDo, 2.);
        long actualLo = Collection.countGreaterThan(arrLo, 2L);
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

        double actualIn = Collection.sumOfList(listIn);
        double actualDo = Collection.sumOfList(listDo);
        double actualLo = Collection.sumOfList(listLo);

        assertEquals(actualIn, 10.,0);
        assertEquals(actualDo, 12.,0);
        assertEquals(actualLo, 10.,0);

    }



}
