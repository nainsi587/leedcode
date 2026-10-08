class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==1){
            return s;
        }
        String a="";
        for(int i=0;i<s.length();i++){
            //odd case;
            int low=i;
            int high=i;
            while(low>=0 && high<s.length()){
                if(s.charAt(low)==s.charAt(high)){
                    low--;
                    high++;
                }else{
                    break;
                }
            }
            String palindrome=s.substring(low+1,high);
            if(palindrome.length()>a.length()){
                a=palindrome;
            
            }
            //enen case
            low=i;
             high=i+1;
            while(low>=0 && high<s.length()){
                if(s.charAt(low)==s.charAt(high)){
                    low--;
                    high++;
                }else{
                    break;
                }
                
                palindrome=s.substring(low+1,high);
                if(palindrome.length()>a.length()){
                    a=palindrome;
                }
            }
        }
        return a;
    }
}