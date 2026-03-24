class Solution {
public boolean isPalindrome(int x) { 
    int revn=0; 
    int temp=x;
    if(x<0) return false; 
    while(x>0)
     { int ld=x%10; 
     revn=(revn*10)+ld;
      x=x/10; } 
      if(revn==temp) 
      return true; 
      else return false; 
      } 
      }