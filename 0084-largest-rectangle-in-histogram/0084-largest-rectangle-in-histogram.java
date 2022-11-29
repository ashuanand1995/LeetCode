class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] rightIdx = new int[n];
        int[] leftIdx = new int[n];
        
        Stack<int[]> st = new Stack<>();
        for(int i=0;i<n;i++){
            if(st.isEmpty()) leftIdx[i]=-1;
            else if(!st.isEmpty() && st.peek()[0] < heights[i]){
                leftIdx[i]=st.peek()[1];
            }
            else if(!st.isEmpty() && st.peek()[0] >= heights[i]){
                while(!st.isEmpty() && st.peek()[0] >= heights[i]){
                    st.pop();
                } 
                if(st.isEmpty()) leftIdx[i]=-1;
                else leftIdx[i]=st.peek()[1];
            }
            
            st.push(new int[]{heights[i],i});
        }
        st.clear();
        for(int i=n-1;i>=0;i--){
            int ans = n;
            if(st.isEmpty()) rightIdx[i]=n;
            else if(!st.isEmpty() && st.peek()[0] < heights[i]){
                rightIdx[i]=st.peek()[1];
            }
            else if(!st.isEmpty() && st.peek()[0] >= heights[i]){
                while(!st.isEmpty() && st.peek()[0] >= heights[i]){
                    st.pop();
                } 
                if(st.isEmpty()) rightIdx[i]=n;
                else rightIdx[i]=st.peek()[1];
            }
            
            st.push(new int[]{heights[i],i});
        }
        int maxArea = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int area = heights[i]*(rightIdx[i]-leftIdx[i]-1);
            maxArea = Math.max(area,maxArea);
        }
        return maxArea;
    }
}