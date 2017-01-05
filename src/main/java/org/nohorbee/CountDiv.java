package org.nohorbee;

/**
 * Created by nohorbee on 22/08/16.
 */
public class CountDiv {

    public int solution (int A, int B, int K) {

        int count = 0;
        if (A==0) {
            count = 1;
            A=1;
        }

        count += (int)Math.ceil(((double)B-A)/K);

        return count;

    }

}
