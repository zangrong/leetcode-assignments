/**
 * Cetian Techs Ltd., Co. 2021
 *
 * @ClassName AddTwoNumbers
 * @Author zangrong
 */
package rong.algorithm;

/**
 *@ClassName AddTwoNumbers
 *@Author zangrong
 *@Date 2022/4/15 08:44
 *@Description TODO
 */
public class Q2_AddTwoNumbers {

    public static void main(String[] args) {
        ListNode l1 = parseListNode(9999999);
        ListNode l2 = parseListNode(9999);

        ListNode listNode = addTwoNumbers(l1, l2);

        System.out.println(listNode);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultHead = null;
        ListNode last = null;
        ListNode l1Temp = l1;
        ListNode l2Temp = l2;
        int highVal = 0;
        while (l1Temp != null || l2Temp != null || highVal > 0){
            int tempVal = highVal;
            if (l1Temp != null){
                tempVal += l1Temp.val;
                l1Temp = l1Temp.next;
            }
            if (l2Temp != null){
                tempVal += l2Temp.val;
                l2Temp = l2Temp.next;
            }
            highVal = tempVal / 10;
            int lowVal = tempVal % 10;
            ListNode lnTemp = new ListNode(lowVal);
            if (resultHead == null){
                resultHead = lnTemp;
                last = lnTemp;
                continue;
            }
            last.next = lnTemp;
            last = lnTemp;
        }
        return resultHead;
    }

    public static ListNode parseListNode(long num){
        ListNode head = null;
        ListNode last = null;
        String str = num + "";
        char[] chars = str.toCharArray();
        for(int i = chars.length - 1; i >= 0; i --){
            if(i == chars.length - 1){
                head = new ListNode(Integer.parseInt(chars[i] + ""));
                last = head;
            }else{
                ListNode node = new ListNode(Integer.parseInt(chars[i] + ""));
                last.next = node;
                last = node;
            }
        }
        return head;
    }

}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
