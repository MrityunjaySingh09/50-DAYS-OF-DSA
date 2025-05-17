class MyQueue {

    Queue<Integer>q= new LinkedList<>();
    public void push(int x) {
        
        int s=q.size();
        q.add(x);
        for(int i=0;i<s;i++){
            q.add(q.poll());
        }
    }
    
    public int pop() {
        
  int n=q.peek();
q.poll();
return n;
    }
    
    public int peek() {
        
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();

    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */