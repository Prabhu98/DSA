package leetcode;

public class addTwoNumber {
	
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode dummy_node = new ListNode(0);
        ListNode l3 = dummy_node;
        
        int carry =0;
        while(l1 != null || l2 != null){
            int l1_val = (l1 != null) ? l1.val : 0;
            int l2_val = (l2 != null) ? l2.val : 0;
            
            int current_sum = l1_val + l2_val + carry;
            carry = current_sum/10;
            int last_digit = current_sum%10;
            
            
            ListNode newnode = new ListNode(last_digit);
            l3.next = newnode;
            
            if(l1 != null)l1 = l1.next;
            if(l2 !=null)l2 = l2.next;
            l3 = l3.next;
            
        }
        
        if(carry>0){
            ListNode new_node = new ListNode(carry);
            l3.next = new_node;
            l3 = l3.next;
        }
        
        return dummy_node.next;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		addTwoNumber ls = new addTwoNumber();
		
		

	}

}
