class unique_Leet {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map=new HashMap();
        int n=s.length();
        if(n==0){
            return -1;
        }
        for(char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(map.get(c)==1){
                return i;
            }
        }
        return -1;


        
    }
}
