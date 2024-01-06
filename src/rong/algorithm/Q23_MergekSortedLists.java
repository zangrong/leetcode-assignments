/**
 * Cetian Techs Ltd., Co. 2021
 *
 * @ClassName Q12_IntegertoRoman
 * @Author Administrator
 */
package rong.algorithm;


import java.beans.Customizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName Q12_IntegertoRoman
 * @Author Administrator
 * @Date 2023/12/21 11:26
 * @Description TODO
 */
public class Q23_MergekSortedLists {

    public static void main(String[] args) {
        Q23_MergekSortedLists instance = new Q23_MergekSortedLists();
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

        System.out.println(instance.mergeKLists(new ListNode[]{ln0, ln01, ln02}));
    }

    public ListNode mergeKLists(ListNode[] lists) {
        List<ListNode> allList = new ArrayList<>();
        for (ListNode list : lists) {
            while (list != null){
                allList.add(list);
                list = list.next;
            }
        }
        if (allList.isEmpty()){
            return null;
        }
        if (allList.size() == 1){
            return allList.get(0);
        }

        Collections.sort(allList, (v1, v2) -> {
            if (v1.val < v2.val){
                return -1;
            }else if (v1.val > v2.val){
                return 1;
            }else{
                return 0;
            }
        });
        ListNode head = null;
        ListNode cursor = null;
        for (ListNode listNode : allList) {
            if (head == null){
                head = listNode;
                cursor = listNode;
            }else{
                cursor.next = listNode;
                cursor = listNode;
            }
        }
        return head;
    }

}


