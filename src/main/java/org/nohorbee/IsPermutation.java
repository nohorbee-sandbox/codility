package org.nohorbee;

/**
 * Created by nohorbee on 22/08/16.
 */
public class IsPermutation {

    public int solution (int[] A) {
        int sumPerm = 0;
        int sumArr= 0;
        for(int i=0;i<A.length;i++) {
            sumPerm ^= (i+1);
            sumArr ^= A[i];
        }

        return (sumPerm==sumArr ? 1 : 0);

    }

}
