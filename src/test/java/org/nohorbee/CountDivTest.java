package org.nohorbee;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by Nohorbee on 8/30/16.
 */
public class CountDivTest {

    @Test
    public void baseCase() throws Exception {
        CountDiv cd = new CountDiv();
        int result = cd.solution(6,11,2);
        assertThat(result, is(3));

    }

    @Test
    public void test1to10by3() throws Exception {
        CountDiv cd = new CountDiv();
        int result = cd.solution(1,10,3);
        assertThat(result, is(3));

    }

    @Test
    public void test0to10by3() throws Exception {
        CountDiv cd = new CountDiv();
        int result = cd.solution(0,10,3);
        assertThat(result, is(4));

    }
}