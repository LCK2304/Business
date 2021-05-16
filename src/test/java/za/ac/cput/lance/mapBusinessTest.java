package za.ac.cput.lance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class mapBusinessTest {

    Map<Integer , business> bMap = new HashMap<>();
    public void bMapInfo(){

        for(int i = 0; i < 5; i++){
            String employeeID = ("Associate5" + i);
            business b = new business(employeeID);
            bMap.put(i, b);
        }
    }
    @Test
    public void testAdd(){
        bMapInfo();
        business associate5 = new business("Associate5");
        bMap.put(10, associate5);

        assertEquals(6, bMap.size());
    }
    @Test
    public void testRemove(){
        bMapInfo();
        bMap.remove(3);

        assertEquals(4, bMap.size());
    }

    @Test
    public void testFind(){
        business b0 = new business("Associate1");
        business b1 = new business("Associate2");
        business b2 = new business("Associate3");
        business b3 = new business("Associate4");
        business b4 = new business("Associate5");

        bMap.put(0,  b0);
        bMap.put(1,  b1);
        bMap.put(2,  b2);
        bMap.put(3,  b3);
        bMap.put(4,  b4);

        business found = bMap.get(1);
        System.out.println(bMap);

        assertEquals(b1, found);
    }
}