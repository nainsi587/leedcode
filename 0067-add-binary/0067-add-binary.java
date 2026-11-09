class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb=new StringBuilder();
        int carry=0;
        int sum=0;
        int n=a.length()-1;
        int m=b.length()-1;
        while(n>=0 || m>=0){
            sum=carry;
            if(n>=0){
                sum+=a.charAt(n)-'0';
                n--;
            }
            if(m>=0){
                sum+=b.charAt(m)-'0';
                m--;
            }
            sb.append(sum%2==0 ? '0':'1');
            carry=sum/2;
        }
        if(carry==1){
            sb.append('1');
        }
        return sb.reverse().toString();
        
    }
}
      