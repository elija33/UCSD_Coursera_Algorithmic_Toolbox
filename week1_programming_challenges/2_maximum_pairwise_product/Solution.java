class Solution {
    public int solution(int[] blocks) {
        // write your code in Java SE 8
        int block = 0;
        for(int i = 0; i<blocks.length - 1; i++){
            int fistnumber = i;
            int secondnumber = i;
            while(fistnumber -1 >= 0 && blocks[fistnumber] <= blocks[secondnumber+1]){
                fistnumber++;
            }
            while(secondnumber -1 >= 0 && blocks[secondnumber] <= blocks[secondnumber+1]){
                secondnumber++;
        }
    }
    return block;
    }
}