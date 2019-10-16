package datastructures;

import com.github.prbpedro.datastructures.stack.QueueImpl;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import util.ArrayGeneratorUtil;

public class QueueImplNGTest {
    
    private ArrayGeneratorUtil arrayGenerator;
    
    @BeforeTest
    public void beforeTest(){
        arrayGenerator = new ArrayGeneratorUtil();
    }
    
    @Test
    public void queueTest() {
        
        for(int i=0; i<10; i++){
            
            Integer[] arr = arrayGenerator.getUnsortedIntArray(1000);
            
            QueueImpl<Integer> queue = new QueueImpl<>(Integer.class);
            
            for(Integer arr1 : arr) {
                queue.enqueue(arr1);
            }
            
            assertEquals(queue.getSize(), arr.length);
            
            for (Integer arr1 : arr) {
                assertEquals(queue.dequeue(), arr1);
            }
            
            assertEquals(queue.getSize(), 0);
        }
    }
}
