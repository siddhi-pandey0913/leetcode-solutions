class Solution {
    public boolean canJump(int[] arr) {
        int sum=0,maximum=0;
        for(int i=0;i<arr.length;i++){
            if(i>maximum)return false;
            sum=i+arr[i];
            maximum=Math.max(sum,maximum);
        }
        return true;
    }
}
