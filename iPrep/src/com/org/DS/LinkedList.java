package com.org.DS;

public class LinkedList {
private Node head;
int size=0;
public void reverseList(){
	    Node reversedPart = null;
	    Node current = head;
	    while(current != null){
	    Node next = current.getNextNode(); 
	      current.setNextNode(reversedPart);
	      reversedPart = current;
	      current = next;
	      
	    }
	
	head=reversedPart;
}


 public void addNodeAtFirst(int data){
	Node newNode = new Node(data);
	size++;
	newNode.setNextNode(this.head); 
	this.head=newNode;	 
}
 
 public void deleteMiddle(int data){
	 Node current = null;
	 Node previous = null;
	if(head == null){
		System.out.println("List is empty");
	}
	else{
		 current = head;
		 while(current!=null && current.getData()!=data){
		 previous=current;
		 current=current.getNextNode();
		 }
		 if(current==head && current.getData()==data){
			 head=head.getNextNode();
			 
		 }else if(current!=null){
			 previous.setNextNode(current.getNextNode());
		 }
		 else{
			 System.out.println("Item not in the List");
		 }
	}
	
	
	}
 
 public int getSize(){ 
	 return size;
 }
 
 public void deleteHead(){
	this.head=head.getNextNode();
     size--;	 
 }
 
 @Override
 public String toString(){
		String result = "{";
		Node current = this.head;
		while(current!=null){
			result += current.toString()+",";
			current= current.getNextNode();
		}
		result +="}";
		return result;
	}

}
