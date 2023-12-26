/**
 * Cetian Techs Ltd., Co. 2021
 *
 * @ClassName Q12_IntegertoRoman
 * @Author Administrator
 */
package rong.algorithm;

import java.util.*;

/**
 * @ClassName Q12_IntegertoRoman
 * @Author Administrator
 * @Date 2023/12/21 11:26
 * @Description TODO
 */
public class Q19_RemoveNthNodeFromEndofList {

    public static void main(String[] args) {
        Q19_RemoveNthNodeFromEndofList instance = new Q19_RemoveNthNodeFromEndofList();
        ListNode ln4 = new ListNode(5);
        ListNode ln3 = new ListNode(4, ln4);
        ListNode ln2 = new ListNode(3, ln3);
        ListNode ln1 = new ListNode(2, ln2);
        ListNode ln0 = new ListNode(1, ln1);
        System.out.println(instance.removeNthFromEnd(ln0, 2));
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        // find end node
        Map<Integer, ListNode> map = new HashMap<>();
        ListNode temp = head;
        int idx = 0;
        do {
            map.put(idx++, temp);
            temp = temp.next;
        } while (temp != null);
        if (idx == n){
            if (n == 1){
                return null;
            }
            // return second node
            return map.get(1);
        }
        ListNode prev = map.get(idx - n - 1);
        ListNode del = map.get(idx - n);
        prev.next = del.next;
        del.next = null;
        ListNode result = map.get(0);
        return result;
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


