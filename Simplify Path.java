class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<String>();
        String res = "";
        String[] pathArr = path.split("/");
        for(String pArr : pathArr){
           if(pArr.equals("..")){
               if(!stack.isEmpty()){
                   stack.pop();
               }
           } else if(!pArr.equals(".") && !pArr.equals("")){
               stack.push(pArr);
           }
        }
        while(!stack.isEmpty()){
            String str = stack.pop();
            res = "/"+str+res;
        }
        if(res.length() == 0){
            return "/";
        }
        return res;
    }
}
