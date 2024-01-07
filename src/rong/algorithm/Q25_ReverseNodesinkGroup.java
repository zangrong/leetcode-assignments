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
public class Q25_ReverseNodesinkGroup {

    public static void main(String[] args) {
        Q25_ReverseNodesinkGroup instance = new Q25_ReverseNodesinkGroup();

        ListNode ln42 = new ListNode(5);
        ListNode ln32 = new ListNode(4, ln42);
        ListNode ln22 = new ListNode(3, ln32);
        ListNode ln12 = new ListNode(2, ln22);
        ListNode ln02 = new ListNode(1, ln12);

        System.out.println(instance.reverseKGroup(ln02, 3));
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null){
            return head;
        }
        List<ListNode> list = new ArrayList<>();
        ListNode cursor = head;
        while (cursor != null){
            list.add(cursor);
            cursor = cursor.next;
        }
        int mode = list.size() % k;
        for (int i = 0; i < list.size()-mode; i++) {
            if (i % k == 0){
                List<ListNode> subList = list.subList(i, i+k);
                Collections.reverse(subList);
                for (int m = 0; m < k; m++) {
                    list.set(m+i, subList.get(m));
                }
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


