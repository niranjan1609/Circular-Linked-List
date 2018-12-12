

public class CLList {
		 //Creating a class of type node
			static Node Head; 
			static Node Head1,Head2;
		    class Node
		    {
		        int data;
		        Node next;
		        Node(int d) {data = d; }
		        Node(){data=0;}
		    }
		    //inserting a node at Begining
		    public void insertBeg(int data) {
		    	Node new_node=new Node(data);
	    		Node last=Head;
		    	if(Head!=null) {
		    		while(last.next!=Head) {
		    			last=last.next;
		    		}
		    		last.next=new_node;
		    		new_node.next=Head;
		    	}
		    	else {
		    		insertToEmpty(data);	
		    	}
		    }
		    //inserting a node to an linked list
		   public void insertToEmpty(int data) {
		    	Node new_node=new Node(data);
		    	new_node.next=new_node;
		    	Head=new_node;
		    }
		    //Inserting an element at tail
		    public void InsertEnd(int data) {
		    	Node new_node=new Node(data);
		    	Node last=Head;
		    	if(Head!=null) {
		    		while(last.next!=Head)
		    			last=last.next;
		    		new_node.next=last.next;
			    	last.next=new_node;
			    	last=new_node;
		    	}
		    else
		    	insertToEmpty(data); 
		    }	
		    //inserting after some position
	    	public void insertAfter(int data,int item) {
	    		Node Last=Head;
	    		Node p;
	    		Node new_node=new Node(data);
	    	if(Last==null) 
	    		return;
	    	else {
	    		while(Last.next!=Head) {
	    			Last=Last.next;
	    		}
	    		p=Last.next;
	    			do {
	    	    		if(p.data==item) {
	    	    			new_node.next=p.next;
	    	    			p.next=new_node;
	    	    			if(p==Last)
	    	    				Last=new_node;
	    			}
	    	    		p=p.next;		
	    		}while(p!=Last.next);
	    	}
	    	}
	    	//Deleting a node with given data
	    	public void DeleteNode(int item) {
	    		Node Last=Head;
	    		if(Last==null) 
	    			return;
	    		else {
	    			while(Last.next!=Head) {
	    				Last=Last.next;
	    			}
	    			Node curr=Last.next;
	    			do {
	    				if(curr.data==item) {
	    					Last.next=curr.next;
	    					if(curr==Head)
	    						Head=curr.next;
	    				}
	    				curr=curr.next;
	    				Last=Last.next;
	    			}	while(curr!=Head );
	    		}
	    	}
	    	//Deleting a node at given position
	   public void DeletePos(int pos) {
	    		Node Last=Head;
	    		int size=0;
	    		int i;
	    		
	    		if(Last==null)
	    			return;
	    		while(Last.next!=Head) {
	    			Last=Last.next;
	    			size++;	
	    		}
	    		Node p=Last.next;
	    		for( i=1;i<pos && p.next!=Head ;i++) {
	    			Last=p;
	    			p=p.next;
	    		}
	    		if(p==Head)
	    		{
	    			Last.next=p.next;
	    			Head=p.next;	
	    		}
	    		Last.next=p.next;
	    	}
	   //Splitting a list into two halfs
	   public void SplitList() {
		   Node slow_ptr = Head; 
	        Node fast_ptr = Head; 
	  
	        if (Head == null) { 
	            return; 
	        } 
	        while (fast_ptr.next != Head 
	                && fast_ptr.next.next != Head) { 
	            fast_ptr = fast_ptr.next.next; 
	            slow_ptr = slow_ptr.next;
	        } 
	  
	        if (fast_ptr.next.next == Head) { 
	            fast_ptr = fast_ptr.next; 
	        } 
	        Head1 = Head; 
	  
	        if (Head.next != Head) { 
	            Head2 = slow_ptr.next; 
	        } 
	        fast_ptr.next = slow_ptr.next; 
	  
	        slow_ptr.next = Head; 
	    } 
		   //printing a list from the give particular Node
	   		public void PrintFrom(Node node) {
	   			Node Temp=node;
	   			do {
	   				System.out.print(Temp.data+" ");
	   				Temp=Temp.next;
	   			}while(Temp!=node);
	   			System.out.println("");
	   		}
	   		void sortedInsert(Node new_node) 
	   	    { 
	   	        Node current = Head; 
	   	  
	   	        // Case 1 of the above algo 
	   	        if (current == null) 
	   	        { 
	   	            new_node.next = new_node; 
	   	            Head = new_node; 
	   	  
	   	        } 
	   	  
	   	        // Case 2 of the above algo 
	   	        else if (current.data >= new_node.data) 
	   	        { 
	   	  
	   	            /* If value is smaller than head's value then 
	   	             we need to change next of last node */
	   	            while (current.next != Head) 
	   	                current = current.next; 
	   	  
	   	            current.next = new_node; 
	   	            new_node.next = Head; 
	   	            Head = new_node; 
	   	        } 
	   	  
	   	        // Case 3 of the above algo 
	   	        else
	   	        { 
	   	  
	   	            /* Locate the node before the point of insertion */
	   	            while (current.next != Head && 
	   	                   current.next.data < new_node.data) 
	   	                current = current.next; 
	   	  
	   	            new_node.next = current.next; 
	   	            current.next = new_node; 
	   	        } 
	   	    } 
		    //function for printing Nodes in the given linked list
		    	public void print() {
		    		Node temp=Head;
		    		if(Head!=null) {
		    			do {
		    				System.out.print(temp.data +" ");
			    			temp=temp.next;

		    			}while(temp!=Head);
		    		System.out.println("");
		    	}
		    	}
}

