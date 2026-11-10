class Solution {
    public boolean isHappy(int n) {
    HashSet<Integer>set=new HashSet<>();
     while(n!=1){
        if(set.contains(n)){
            return false;
        }
        set.add(n);
       String s=String.valueOf(n);
       int sum=0;
       for(int i=0;i<s.length();i++){
        int digit=s.charAt(i)-'0';
        sum+=digit*digit;
       }
       n=sum;
     }
     return true;
    }
}
        
       