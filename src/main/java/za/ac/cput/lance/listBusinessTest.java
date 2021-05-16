package za.ac.cput.lance;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class listBusinessTest {
List<business> bList = new ArrayList<>();

public void bListInfo(){
    for(int i = 0; i < 5;i++){
        String employeeID = "Associate" + i;
        business b = new business(employeeID);
        bList.add(b);

    }
}
@Test
    public void testAdd(){
    bListInfo();
    bList.add(5, new business("Associate5"));
    assertSame(6, bList.size());
}

@Test
    public void testRemove(){
    bListInfo();
    bList.remove(3);
    System.out.println(bList);
    assertSame(5, bList.size());
}

@Test
    public void testFind(){
    business b0 = new business("Associate1");
    business b1 = new business("Associate2");
    business b2 = new business("Associate3");
    business b3 = new business("Associate4");
    business b4 = new business("Associate5");

    bList.add(0,  b0);
    bList.add(1,  b1);
    bList.add(2,  b2);
    bList.add(3,  b3);
    bList.add(4,  b4);

    business found = bList.get(1);
    System.out.println(bList);

    assertEquals(b1, found);

}
}