package org.nohorbee;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by Nohorbee on 8/30/16.
 */
public class PassingCarsTest {

    @Test
    public void testBase() throws Exception {
        PassingCars pc = new PassingCars();
        int result = pc.solution(new int[]{0,1,0,1,1});
        assertThat(result, is(5));
    }

    @Test
    public void testEmpty() throws Exception {
        PassingCars pc = new PassingCars();
        int result = pc.solution(new int[]{});
        assertThat(result, is(0));
    }

    @Test
    public void testAllEast() throws Exception {
        PassingCars pc = new PassingCars();
        int result = pc.solution(new int[]{0,0,0,0,0,0,0});
        assertThat(result, is(0));
    }

    @Test
    public void testAllWest() throws Exception {
        PassingCars pc = new PassingCars();
        int result = pc.solution(new int[]{1,1,1,1,1,1,1,1,1});
        assertThat(result, is(0));
    }

    @Test
    public void testfirstWestThenEast() throws Exception {
        PassingCars pc = new PassingCars();
        int result = pc.solution(new int[]{1,1,1,1,1,0,0,0,0,0,0,0,0});
        assertThat(result, is(0));
    }

    @Test
    public void testfirst5East1West() throws Exception {
        PassingCars pc = new PassingCars();
        int result = pc.solution(new int[]{0,0,0,0,0,1});
        assertThat(result, is(5));
    }

    @Test
    public void testfirst1East4West() throws Exception {
        PassingCars pc = new PassingCars();
        int result = pc.solution(new int[]{0,1,1,1,1});
        assertThat(result, is(4));
    }


    @Test
    public void testReallyBig() throws Exception {
        PassingCars pc = new PassingCars();
        int[] passing = new int[100000];
        for(int i=0;i<50000;i++) {
            passing[i] = 0;
        }
        for(int i=50000;i<100000;i++) {
            passing[i] = 1;
        }

        int result = pc.solution(passing);
        assertThat(result, is(-1));
    }




}