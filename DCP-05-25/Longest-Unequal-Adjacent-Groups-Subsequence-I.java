class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        ArrayList<String> li = new ArrayList<>();
        li.add(words[0]);
        for(int i = 1; i < words.length; i++){
            if(groups[i] != groups[i-1]){
                li.add(words[i]);
            }
            else{
                continue;
            }
        }
        return li;
    }
}