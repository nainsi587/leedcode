class Solution {
    public String simplifyPath(String path) {
        Stack<String>st=new Stack<>();
        String parts[]=path.split("/");
        for(int i=0;i<parts.length;i++){
            String str=parts[i];
            //ignore case bna lete hai
            if(str.equals("")|| str.equals(".")){
                continue;
            }else if(str.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }else{
                st.push(str);
            }
                
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<st.size();i++){
            sb.append("/");
            sb.append(st.get(i));
        }
        if (sb.length()==0){
            return "/";
        }
        return sb.toString();
    }
}