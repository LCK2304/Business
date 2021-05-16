package za.ac.cput.lance;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class setBusinessTest {
Set<business> bSet = new HashSet<>();

public void bSetInfo(){
    for (int i = 0; i < 5; i++){
        String employeeID = "Associate" + i;
        business b = new business(employeeID);
        bSet.add(b);
    }

}
@Test
public void testAdd(){
    bSetInfo();
    business b = new business("Associate5");
    bSet.add(b);

    assertEquals(6, bSet.size());
}

@Test
    public void testRemove(){
    bSetInfo();
    Boolean removed = bSet.removeAll(bSet);

    assertSame(true, removed);
}
}