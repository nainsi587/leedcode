class MyLinkedList {
    class Node{
        int val;
        Node next;
        public Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    Node head;
    Node tail;
    public MyLinkedList() {
       head=null;
       tail=null;
    }
    
    public int get(int index) {
        if(head==null){
            return -1;
        }
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(i==index){
                return temp.val;
            }
            temp=temp.next;
            i++;

        }
        return -1;
    }
    
    public void addAtHead(int val) {
        Node newnode=new Node(val);
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    
    public void addAtTail(int val) {
        Node newnode=new Node(val);
        if(head==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
        
    }
    
    public void addAtIndex(int index, int val) {
        
    if (index == 0) {
        addAtHead(val);
        return;
    }

    Node prev = head;
    int i = 0;

    while (i < index - 1 && prev != null) {
        prev = prev.next;
        i++;
    }

    // index list ki length se bada hai
    if (prev == null) {
        return;
    }

    Node newnode = new Node(val);

    newnode.next = prev.next;
    prev.next = newnode;

    // agar last mein add kiya hai
    if (newnode.next == null) {
        tail = newnode;
    }
}
    
    
    public void deleteAtIndex(int index) {
        
        if (head == null) {
            return;
        }

        if (index == 0) {
            head = head.next;

            if (head == null) {
                tail = null;
            }

            return;
        }

        int i = 0;
        Node prev = head;

        while (i < index - 1 && prev != null) {
            prev = prev.next;
            i++;
        }

        if (prev == null || prev.next == null) {
            return;
        }

        if (prev.next == tail) {
            tail = prev;
        }

        prev.next = prev.next.next;
    }
}
    


/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */