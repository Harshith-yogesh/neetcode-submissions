class Solution {
      public int maxArea(int[] heights) {
          int i=0;
          int area=0;
         int j=heights.length-1;
          int max=0;
          while (i<j){
              int currentarea=Math.min(heights[i],heights[j])*(j-i);
              max=Math.max(max,currentarea);
              if(heights[i]<heights[j]){
                  i++;
              }
              else {
                  j--;
              }
         }
        return max;
    }
}
