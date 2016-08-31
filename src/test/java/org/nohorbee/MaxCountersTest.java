package org.nohorbee;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by Nohorbee on 8/30/16.
 */
public class MaxCountersTest {

    @Test
    public void testBase() {
        MaxCounters mc = new MaxCounters();
        int[] results = mc.solution(5, new int[]{3,4,4,6,1,4,4});
        assertThat(results, is(new int[]{3,2,2,4,2}));
    }


}