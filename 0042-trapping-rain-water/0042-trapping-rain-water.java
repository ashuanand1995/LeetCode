class Solution {
    
    int[] maxL,maxR;
    public int trap(int[] height) {
        int n = height.length;
        int sum = 0;
        getMaxL(height,n);
        getMaxR(height,n);
        for(int i=0;i<n;i++){
            sum+=Math.min(maxL[i],maxR[i])-height[i];
        }
        return sum;
    }
    
    public void getMaxL(int[] height,int n){
        maxL = new int[n];
        maxL[0]=height[0];
        for(int i=1;i<n;i++){            
            maxL[i] = Math.max(height[i],maxL[i-1]);
        }
        
    }
    public void getMaxR(int[] height,int n){
        maxR = new int[n];
        maxR[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){            
            maxR[i] = Math.max(height[i],maxR[i+1]);
        }
    }
}