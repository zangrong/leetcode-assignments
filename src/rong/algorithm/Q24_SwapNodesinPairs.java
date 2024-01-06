/**
 * Cetian Techs Ltd., Co. 2021
 *
 * @ClassName Q12_IntegertoRoman
 * @Author Administrator
 */
package rong.algorithm;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName Q12_IntegertoRoman
 * @Author Administrator
 * @Date 2023/12/21 11:26
 * @Description TODO
 */
public class Q24_SwapNodesinPairs {

    public static void main(String[] args) {
        Q24_SwapNodesinPairs instance = new Q24_SwapNodesinPairs();
        Q24_SwapNodesinPairs.ListNode ln2 = new Q24_SwapNodesinPairs.ListNode(4);
        Q24_SwapNodesinPairs.ListNode ln1 = new Q24_SwapNodesinPairs.ListNode(2, ln2);
        Q24_SwapNodesinPairs.ListNode ln0 = new Q24_SwapNodesinPairs.ListNode(1, ln1);

        Q24_SwapNodesinPairs.ListNode ln21 = new Q24_SwapNodesinPairs.ListNode(6);
        Q24_SwapNodesinPairs.ListNode ln11 = new Q24_SwapNodesinPairs.ListNode(3, ln21);
        Q24_SwapNodesinPairs.ListNode ln01 = new Q24_SwapNodesinPairs.ListNode(1, ln11);

        Q24_SwapNodesinPairs.ListNode ln32 = new Q24_SwapNodesinPairs.ListNode(8);
        Q24_SwapNodesinPairs.ListNode ln22 = new Q24_SwapNodesinPairs.ListNode(7, ln32);
        Q24_SwapNodesinPairs.ListNode ln12 = new Q24_SwapNodesinPairs.ListNode(6, ln22);
        Q24_SwapNodesinPairs.ListNode ln02 = new Q24_SwapNodesinPairs.ListNode(5, ln12);

        System.out.println(instance.swapPairs(ln02));
    }

    public ListNode swapPairs(ListNode head) {
        if (head == null){
            return null;
        }
        List<ListNode> list = new ArrayList<>();
        ListNode cursor = head;
        while (cursor != null){
            list.add(cursor);
            cursor = cursor.next;
        }
        for (int i = 0; i < list.size()-1; i++) {
            if (i % 2 == 0){
                ListNode first = list.get(i);
                ListNode second = list.get(i+1);
                list.set(i, second);
                list.set(i+1, first);
            }
        }
        cursor = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            cursor.next = list.get(i);
            cursor = cursor.next;
        }
        cursor.next = null;
        head = list.get(0);
        return head;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {
        }
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}


