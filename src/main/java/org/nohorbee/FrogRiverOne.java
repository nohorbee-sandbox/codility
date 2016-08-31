package org.nohorbee;

/**
 * Created by nohorbee on 22/08/16.
 */
public class FrogRiverOne {

    public int solution (int X, int[] A) {

        boolean[] fill = new boolean[X];
        int sum=0;
        for(int i=0;i<A.length;i++) {
            int n=A[i];
            if (n<1 || n>X) continue;

            if (!fill[n-1]) {
                fill[n-1] = true;
                sum++;
            }

            if (sum==X) return i;


        }

        return -1;

    }

}
