package com.leetcode.June;

public class DeleteNodeLinkedList {
	
	 public void deleteNode(ListNode node) {
	        node.val=node.next.val;
	        node.next=node.next.next;
	    }
	 
	 public static void main(String[] args) {
		 ListNode head;
		 head=new ListNode(4);
		 head.next=new ListNode(5);
		 head.next.next=new ListNode(1);
		 head.next.next.next=new ListNode(9);
		 
		 DeleteNodeLinkedList del=new DeleteNodeLinkedList();
		 
		 //Passing the pointer of the node to delete function
		 del.deleteNode(head.next.next);
		 
		 
		 //For testing if node is deleted
		 ListNode temp=head;
		 while(temp!=null) {
			 System.out.println(temp.val);
			 temp=temp.next;
		 }
		
	}

}
//LinkedList declaration
class ListNode{
	int val;
	ListNode next;
	ListNode(int val){
		this.val=val;
	}
}
