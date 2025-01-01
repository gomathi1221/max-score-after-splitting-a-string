class Solution {
    public int maxScore(String s) {
      int left=0;
      int right=0;
      int max=0;
      for(int i=0;i<s.length()-1;i++){
         if(s.charAt(i)=='0'){
                left++;
            }
            right=0;

        for(int j=i+1;j<s.length();j++){
           
            if(s.charAt(j)=='1'){
                right++;
            }
           

        }
         int p=left+right;
         max=Math.max(p,max);
        
      } 
      return max;
    }

}