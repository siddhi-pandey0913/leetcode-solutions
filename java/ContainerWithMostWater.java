class Solution {
    public int maxArea(int[] height) {
        int pointer1=0,pointer2=height.length-1,mul,area,maxi=0;
        while(pointer2>pointer1){
          mul=Math.min(height[pointer1],height[pointer2]);
              area=mul*(pointer2-pointer1);
            maxi=Math.max(maxi,area);
            if(height[pointer1]==height[pointer2])
                pointer1++;
            else if(height[pointer1]>height[pointer2])
                pointer2--;
            else
                pointer1++;
        }
        return maxi;
    }
}
