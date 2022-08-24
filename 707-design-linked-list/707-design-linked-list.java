class MyLinkedList {
    static class Node
        {
            Node next;
            int val;
        public Node(int d)
        {
            val=d;
            next=null;
        }
        }
        private Node head;
        private Node tail;
        private int size;
    public MyLinkedList() {
        this.head=null;
        this.tail=null;
        this.size=0;
    }
    
    public int get(int index) {
        if(index<0||index>=this.size)
            return -1;
        Node curr=this.head;
        while(index-->0)
            curr=curr.next;
        return curr.val;
    }
    public Node getNodeAt(int index)
    {
        Node curr=this.head;
        while(index-->0)
            curr=curr.next;
        return curr;
    }
    public void addAtHead(int val) {
        Node curr=new Node(val);
        if(this.size==0)
        {
            this.head=curr;
            this.tail=curr;
        }
        else
        { curr.next=this.head;
            this.head=curr;}
        this.size++;
    }
    
    public void addAtTail(int val) {
        Node curr=new Node(val);
        if(this.size==0)
        {
            this.head=curr;
            this.tail=curr;
        }
        else
        {
            this.tail.next=curr;
            curr.next=null;
            this.tail=curr;
        }
        this.size++;
    }
    
    public void addAtIndex(int index, int val) {
         if(index < 0 || index > this.size) return;
        
        if(index == 0){
            addAtHead(val);
        }
        else if(index == this.size){
            addAtTail(val);   
        }
        else{
            Node prev = getNodeAt(index-1);
            Node forw = prev.next;
            Node curr = new Node(val);
            prev.next = curr;
            curr.next = forw;
            this.size++;
        }
    }
   public void deleteFirst(){
        if(this.size == 0) return;
        else if(this.size == 1){
            this.head = null;
            this.tail = null;
        }
        else{
            Node curr = this.head;
            Node forw = curr.next;
            curr.next = null;
            this.head = forw;
        }
        this.size--;
    }
    
    public void deleteLast(){
        if(this.size == 0) return;
        else if(this.size == 1){
            this.head = null;
            this.tail = null;
        }
        else{
            Node secondLast = getNodeAt(this.size-2);
            secondLast.next = null;
            this.tail = secondLast;
        }
        this.size--;
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= this.size) return;
        
        if(index == 0){
            deleteFirst();
        }
        else if(index == this.size-1){
            deleteLast();   
        }
        else{
            Node prev = getNodeAt(index-1);
            Node curr = prev.next;
            Node forw = prev.next.next;
            prev.next = forw;
            curr.next = null;
            this.size--;
        }
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