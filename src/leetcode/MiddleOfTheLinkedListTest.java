package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiddleOfTheLinkedListTest {

    // Helper function to create a linked list from an array of integers
    private ListNode createLinkedList(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

    @Test
    public void testMiddleNodeOddLength() {
        int[] values = {1, 2, 3, 4, 5};
        ListNode head = createLinkedList(values);
        MiddleOfTheLinkedList finder = new MiddleOfTheLinkedList();
        ListNode middleNode = finder.middleNode(head);
        assertEquals(3, middleNode.val);
    }
    @Test
    public void testMiddleNodeEvenLength() {
        int[] values = {1,2,3,4,5,6};
        ListNode head = createLinkedList(values);
        MiddleOfTheLinkedList finder = new MiddleOfTheLinkedList();
        ListNode middleNode = finder.middleNode(head);
        assertEquals(4, middleNode.val);
    }
}