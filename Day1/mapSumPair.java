class MapSum {
    HashMap <String,Integer> map;
    public MapSum() {
        map=new HashMap();
    }
    
    public void insert(String key, int val) {
        map.put(key,val);
    }
    
    public int sum(String prefix) {
        int max=0;
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            String key=entry.getKey();
            int value=entry.getValue();
            if(key.startsWith(prefix)){
                max+=value;
            }
        }
        return max;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */
