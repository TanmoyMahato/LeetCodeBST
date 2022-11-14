class Solution {
    public int countOdds(int low, int high) {
        
        int totalDigits = (high-low)+1;
        
      //(Odd to Odd) series has odd no. of odd digits
        if(low%2!=0 && high%2!=0) 
            return totalDigits/2 + 1;
        
      //(Even-Odd | Odd-Even | Even-Even) series has even no. of odd digits
        else 
            return totalDigits/2;
        
    }
}