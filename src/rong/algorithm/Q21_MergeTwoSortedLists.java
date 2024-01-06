/**
 * Cetian Techs Ltd., Co. 2021
 *
 * @ClassName Q12_IntegertoRoman
 * @Author Administrator
 */
package rong.algorithm;


/**
 * @ClassName Q12_IntegertoRoman
 * @Author Administrator
 * @Date 2023/12/21 11:26
 * @Description TODO
 */
public class Q21_MergeTwoSortedLists {

    public static void main(String[] args) {
        Q21_MergeTwoSortedLists instance = new Q21_MergeTwoSortedLists();
        ListNode ln2 = new ListNode(4);
        ListNode ln1 = new ListNode(2, ln2);
        ListNode ln0 = new ListNode(1, ln1);

        ListNode ln21 = new ListNode(4);
        ListNode ln11 = new ListNode(3, ln21);
        ListNode ln01 = new ListNode(1, ln11);

        System.out.println(instance.mergeTwoLists(ln0, ln01));
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;

        ListNode head = null;
        ListNode cursor = null;
        while (temp1 != null || temp2 != null){
            ListNode min = null;
            if (temp1 !=null && temp2 != null){
                if (temp1.val < temp2.val){
                    min = temp1;
                    temp1 = temp1.next;
                }else{
                    min = temp2;
                    temp2 = temp2.next;
                }
            }else if (temp1 !=null){
                min = temp1;
                temp1 = temp1.next;
            }else {
                min = temp2;
                temp2 = temp2.next;
            }
            if (head == null){
                head = min;
                cursor = min;
            }else{
                cursor.next = min;
                cursor = min;
            }
        }
        return head;
    }
}


