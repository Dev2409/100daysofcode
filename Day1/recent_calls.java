class RecentCounter {
    Queue<Integer> reque;
    public RecentCounter() {
        this.reque=new LinkedList();
    }
    
    public int ping(int t) {
        reque.add(t);
        while(reque.peek()<t-3000){
            reque.poll();
        }
        return reque.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
