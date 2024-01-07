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
        ListNode ln2 = new ListNode(4);
        ListNode ln1 = new ListNode(2, ln2);
        ListNode ln0 = new ListNode(1, ln1);

        ListNode ln21 = new ListNode(6);
        ListNode ln11 = new ListNode(3, ln21);
        ListNode ln01 = new ListNode(1, ln11);

        ListNode ln32 = new ListNode(8);
        ListNode ln22 = new ListNode(7, ln32);
        ListNode ln12 = new ListNode(6, ln22);
        ListNode ln02 = new ListNode(5, ln12);

        System.out.println(instance.swapPairs(ln02));
    }

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null){
            return head;
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

}


