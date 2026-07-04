class Solution {
       public boolean isPalindrome(String s) {
        s=s.toLowerCase().trim();
        s=s.replaceAll("[^a-z0-9]","");
        int i=0;
         int j=s.length()-1;
         boolean ok=true;
         while (i<=j){
             if(s.charAt(i)!=s.charAt(j)){
                return false;
             }
             i++;
             j--;
         }
         return  true;
    }
}
