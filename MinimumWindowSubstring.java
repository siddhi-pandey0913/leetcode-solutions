class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        int l=0,r=0,cnt=0,sindex=-1,minlen=Integer.MAX_VALUE;
        String st="";
        HashMap<Character,Integer> mpp=new HashMap<>();
        for(int i=0;i<t.length();i++){
            mpp.put(t.charAt(i),mpp.getOrDefault(t.charAt(i),0)+1);
        }
        while(r<s.length()){
            char ch=s.charAt(r);
            if(mpp.containsKey(ch) && mpp.get(ch)>0){
                cnt++;
            }
            mpp.put(ch,mpp.getOrDefault(ch,0)-1);
            while(cnt==t.length()){
                if(r-l+1<minlen){
                    minlen=r-l+1;
                    sindex=l;
                }
                mpp.put(s.charAt(l),mpp.get(s.charAt(l))+1);
                if(mpp.get(s.charAt(l))>0) {cnt--;}
                l++;
            }
            r++;
        }
        return sindex==-1?"":s.substring(sindex,sindex+minlen);
    }
}
