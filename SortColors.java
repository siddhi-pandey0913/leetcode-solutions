class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer,Integer> m= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!m.containsKey(nums[i]))
                m.put(nums[i],1);
            else {
                int a=m.get(nums[i]);
                m.put(nums[i],a+1);
                }
        }
        int n=0,p=0,q=0;
            if(m.containsKey(0)) n=m.get(0);
        if(m.containsKey(1)) p=m.get(1);
        if(m.containsKey(2)) q=m.get(2);
        int i=0;
        while(i< nums.length){
            while(n!=0){
                nums[i]=0;
                n--;
                i++;
            }
            while(p!=0){
                nums[i]=1;
                p--;
                i++;
            }
            while(q!=0){
                nums[i]=2;
                q--;
                i++;
            }
        }
    }
}
