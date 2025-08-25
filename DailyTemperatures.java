class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s=new Stack<>();
        int n=temperatures.length;
        int[] result=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && temperatures[i]>=temperatures[s.peek()]){
                s.pop();
            }
            if(!s.isEmpty()){
                result[i]=s.peek()-i;
            }
            s.push(i);
        }
        return result;
    }
}
