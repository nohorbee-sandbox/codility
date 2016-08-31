package org.nohorbee;


import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.*;
import static org.hamcrest.CoreMatchers.*;


/**
 * Created by Nohorbee on 8/30/16.
 */
public class IsPermutationTest {

    @Test
    public void isPermutationSimpleTest() {
        int[] A = {1,2,3,4};
        int result = new IsPermutation().solution(A);
        assertThat(result, is(1));

    }

    @Test
    public void isPermutationBadTest() {
        int[] A = {1,2,3,3};
        int result = new IsPermutation().solution(A);
        assertThat(result, is(0));

    }

    @Test
    public void isPermutationEmptyTest() {
        int[] A = {};
        int result = new IsPermutation().solution(A);
        assertThat(result, is(1));

    }

    @Test
    public void isPermutationBigTest() {
        int N = 1000000;
        int[] A = new int[N];
        for (int i=0;i<N;i++) {
            A[i] = i+1;
        }
        int result = new IsPermutation().solution(A);
        assertThat(result, is(1));

    }

    @Test
    public void isPermutationBigFailTest() {
        int N = 1000000;
        int[] A = new int[N];
        for (int i=0;i<N;i++) {
            A[i] = i+1;
        }
        A[4] = 25;
        int result = new IsPermutation().solution(A);
        assertThat(result, is(0));

    }

    @Test
    public void isPermutationLogicalFailTest() {
        int[] A = {6,0,0,4};
        int result = new IsPermutation().solution(A);
        assertThat(result, is(0));

    }

    @Test
    public void isPermutationBigFailOverflowTest() {
        int N = 1000000;
        int[] A = new int[N];
        for (int i=0;i<N;i++) {
            A[i] = 1000000000;
        }

        int result = new IsPermutation().solution(A);
        assertThat(result, is(0));

    }

}