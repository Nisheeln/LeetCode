class Solution {
    public boolean isAnagrams(String s1, String s2){
        HashMap<Character, Integer> map = new HashMap<>();
        if(s1.length() != s2.length()){
            return false;
        }
        for(int i = 0; i < s1.length(); i++){
            if(!map.containsKey(s1.charAt(i))){
                map.put(s1.charAt(i),1);
            }
            else{
                map.put(s1.charAt(i),map.get(s1.charAt(i))+1);
            }
        }
        for(int i = 0; i < s2.length(); i++){
            if(!map.containsKey(s2.charAt(i)) || map.get(s2.charAt(i))==0){
                return false;
            }
            else{
                map.put(s2.charAt(i),map.get(s2.charAt(i))-1);
            }
        }
        return true;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> main = new ArrayList<>();
        boolean a[] = new boolean[strs.length];
        for(int i = 0; i < strs.length; i++){
            List<String> temp = new ArrayList<>();
            if(a[i]==false){
                temp.add(strs[i]);
            }
            else{continue;}
            for(int j = i+1; j<strs.length; j++){
                if(isAnagrams(strs[i],strs[j])&&a[j] == false){
                    temp.add(strs[j]);
                    a[j] = true;
                }
            }
            main.add(temp);
        }
        return main;
    }
}