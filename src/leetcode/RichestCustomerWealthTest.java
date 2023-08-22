package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RichestCustomerWealthTest {
    private RichestCustomerWealth richestCustomerWealth;

    @BeforeEach
    void createData(){
        richestCustomerWealth=new RichestCustomerWealth();
    }

    @Test
    void maximumWealthTest1() {
        assertEquals(17,richestCustomerWealth.maximumWealth(new int[][]{{2,8,7},{7,1,3},{1,9,5}}));
    }    @Test
    void maximumWealthTest2() {
        assertEquals(6,richestCustomerWealth.maximumWealth(new int[][]{{1,2,3},{3,2,1}}));
    }    @Test
    void maximumWealthTest3() {
        assertEquals(10,richestCustomerWealth.maximumWealth(new int[][]{{1,5},{7,3},{3,5}}));
    }
}