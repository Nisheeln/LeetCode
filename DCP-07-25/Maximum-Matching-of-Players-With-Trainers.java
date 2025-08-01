class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int count=0;
        for(int i = 0, j=0; i < players.length && j<trainers.length;){
            
            if(players[i]<=trainers[j]){
                i++;
                j++;
                count++;
            }
            else{
                j++;
            }
        }
        return count;
    }
}