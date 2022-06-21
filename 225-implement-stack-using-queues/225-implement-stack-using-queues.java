class MyStack {
Queue<Integer>arr1;
    public MyStack() {
        arr1=new LinkedList<>();
    }
    
    public void push(int x) {
        arr1.add(x);
        int size=arr1.size();
        for(int i=0;i<size-1;i++)
            arr1.add(arr1.poll());
    }
    
    public int pop() {
        return arr1.poll();
    }
    
    public int top() {
        return arr1.peek();
    }
    
    public boolean empty() {
        return arr1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */