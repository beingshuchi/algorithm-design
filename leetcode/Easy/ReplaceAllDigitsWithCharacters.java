class ReplaceAllDigitsWithCharacters {
    public String replaceDigits(String s) {
        /**
        NOTE: even - aphabet
              odd - nums
        1. intutive approach 
          iterate only pos 
           get the shifted char
           and replace num by this char
           
           abbccd
                ^
            i = 1
            num = 49 - '0' = 49 - 48 = 1
            alphabet = 'a' = 97
            replacement = 97 + 1 = 98 = 'b'
            
            i = 3            
            num = 49 - '0' = 49 - 48 = 1
            alphabet = 'b' = 98
            replacement = 98 + 1 = 99 = 'c'
            
             i = 5          
            num = 49 - '0' = 49 - 48 = 1
            alphabet = 'c' = 99
            replacement = 99 + 1 = 100 = 'd'
			
			time : n/2 -- because we iterate alternatively for odd nums
			space: n -- beacause we have created string builder object
           
        */
      StringBuilder sb = new StringBuilder(s);
      for(int i = 1; i < s.length(); i+=2){
          int alphabet = s.charAt(i - 1);
          int num = s.charAt(i) - '0';
          char replacement = (char)(alphabet + num);
          sb.setCharAt(i, replacement);
      }
        return sb.toString();
    }
}