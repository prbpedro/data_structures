package datastructures;

import com.github.prbpedro.datastructures.stack.StackImpl;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import util.ArrayGeneratorUtil;

public class StackImplNGTest {
    
    private ArrayGeneratorUtil arrayGenerator;
    
    @BeforeTest
    public void beforeTest(){
        arrayGenerator = new ArrayGeneratorUtil();
    }
    
    @Test
    public void stackTest() {
        
        for(int i=0; i<10; i++){
            
            Integer[] arr = arrayGenerator.getUnsortedIntArray(1000);
            
            StackImpl<Integer> stack = new StackImpl<>(Integer.class, arr.length);
            
            for(Integer arr1 : arr) {
                stack.push(arr1);
            }
            
            assertEquals(stack.getSize(), arr.length);
            
            for(int j=arr.length-1; j>-1; j--){
                assertEquals(stack.pop(), arr[j]);
            }
            
            assertEquals(stack.getSize(), 0);
        }
    }
}
