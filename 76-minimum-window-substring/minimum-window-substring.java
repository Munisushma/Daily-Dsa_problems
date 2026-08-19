class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> tmap = new HashMap<>();
        for(char c:t.toCharArray()){
            tmap.put(c,tmap.getOrDefault(c,0)+1);
        }     
        int required = tmap.size();
        int formed =0;
        int left=0;
        String str ="";
        int minLen = Integer.MAX_VALUE;
        HashMap<Character,Integer> smap = new HashMap<>();
        for(int right =0;right<s.length();right++){
           char ch = s.charAt(right);
           smap.put(ch,smap.getOrDefault(ch,0)+1);
           if(tmap.containsKey(ch) && smap.get(ch).equals(tmap.get(ch))){
            formed++;
           }
           while(formed==required){
            if(right-left+1<minLen){
                minLen = right-left+1;
                str = s.substring(left,right+1);
            
           }
           char charLeft = s.charAt(left);
           smap.put(charLeft,smap.getOrDefault(charLeft,0)-1);
            if(tmap.containsKey(charLeft) && smap.get(charLeft)<(tmap.get(charLeft))){
            formed--;
           }
           left++;
        }
        }
        return str;
    }
}