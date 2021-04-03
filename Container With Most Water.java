import java.util.Arrays; 
class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0, l=0,r=height.length - 1;
        while(l<r){
          int minNum = min(height[l],height[r]);
                if(maxArea<minNum*(r-l)){
                    maxArea = minNum*(r-l);
                }
            if(height[l]<height[r])
                l++;
            else
                r--;
        }       
        return maxArea;
    } 
    
    
    public int min(int a, int b){
        if(a>b){
            return b;
        }else if(a<b){
            return a;
        }else{
            return a;
        }
    }   
    
}
