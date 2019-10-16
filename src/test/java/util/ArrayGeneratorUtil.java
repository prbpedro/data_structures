package util;

import java.util.Random;

public class ArrayGeneratorUtil {
    
    public Integer[] getUnsortedIntArray(int bound) {
        Random r = new Random();
        var arraySize = r.nextInt(bound);
        Integer[] unsortedArr = new Integer[arraySize];
        for(int i=0; i<arraySize; i++){
            unsortedArr[i] = r.nextInt();
        }
        
        return unsortedArr;
    }
}
