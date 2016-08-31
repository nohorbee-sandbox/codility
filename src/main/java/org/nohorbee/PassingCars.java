package org.nohorbee;

/**
 * Created by nohorbee on 22/08/16.
 */
public class PassingCars {

    public int solution (int[] A) {

        int passing = 0;
        int goEast = 0;

        for(int car : A) {
            if (car==0) {
                goEast++;
            } else {
                passing += goEast;
            }
            if (passing>1000000000) {
                passing=-1;
                break;
            }
        }

        return passing;

    }

}
