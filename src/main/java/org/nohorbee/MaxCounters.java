package org.nohorbee;

/**
 * Created by nohorbee on 22/08/16.
 */
public class MaxCounters {

    public int[] solution (int N, int[] A) {

        int[] counters = new int[N];
        int maxCounter = 0;
        int lastMaxCounter = 0;

        for(int K : A) {
            if(K>=1 && K<=N) {
                counters[K-1] = Integer.max(counters[K-1],lastMaxCounter)+1;
                maxCounter = Integer.max(counters[K-1], maxCounter);
            } else {
                if(K==N+1) {
                    lastMaxCounter = maxCounter;
                }
            }
        }

        for (int i=0;i<counters.length;i++) {
            counters[i] = Integer.max(lastMaxCounter, counters[i]);
        }

        return counters;
    }

}
