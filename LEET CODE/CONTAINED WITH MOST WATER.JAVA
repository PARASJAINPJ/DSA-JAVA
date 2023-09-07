class Solution {
    public int maxArea(int[] height) {
        // int right = height.length - 1;
        // int left = 0;
        // int result;
        // int max = 0;
        // while(left < right){
        //     if (height[left] > height[right]) {
        //         result = height[right];
        //     }
        //     else {
        //         result = height[left];
        //     }
        //     result = (right - left) * result;
        //     if(result > max){
        //         max = result;
        //     }
        //     if(height[left] < height[right]){
        //         left++;
        //     }
        //     else{
        //         right--;
        //     }
        // }
        // return max;
        
        //second approach understandable by me  
        int l=0;
        int r=height.length-1;
        int max=0;
        while(l<r){
            int lh=height[l];
            int rh=height[r];
            int min_h=Math.min(lh,rh);
            max=Math.max(max,min_h*(r-l));//this is R-L USED FOR  WIDTH OF AREA CONTAINING WATER
            if(lh<rh)l++;
            else r--;
        }
        return max;
    }
}
