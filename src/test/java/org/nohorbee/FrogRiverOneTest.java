package org.nohorbee;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by Nohorbee on 8/30/16.
 */
public class FrogRiverOneTest {


    @Test
    public void testBase() {
        FrogRiverOne fro = new FrogRiverOne();
        int time = fro.solution(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4});
        assertThat(time, is(6));
    }

    @Test
    public void testFail() {
        FrogRiverOne fro = new FrogRiverOne();
        int time = fro.solution(5, new int[]{1, 3, 1, 4, 2, 3, 4, 4});
        assertThat(time, is(-1));
    }

    @Test
    public void testEmpty() {
        FrogRiverOne fro = new FrogRiverOne();
        int time = fro.solution(5, new int[]{});
        assertThat(time, is(-1));
    }

    @Test
    public void testUpperBound() {
        FrogRiverOne fro = new FrogRiverOne();
        int time = fro.solution(5, new int[]{1, 3, 9, 12, 0, 3, 2, 5, 4});
        assertThat(time, is(8));
    }

}