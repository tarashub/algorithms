package arrays;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * To finding the smallest value that can't be constructed from array elements.
 */
public class SmallestNonconstructibleValue {

    public static int smallestNonconstructibleValue(List<Integer> values){
        Collections.sort(values);
        int maxValue = 0;
        for(int i : values) {
            if (i > maxValue + 1) {
                break;
            }
            maxValue += i;
        }
        return maxValue + 1;

    }

}
