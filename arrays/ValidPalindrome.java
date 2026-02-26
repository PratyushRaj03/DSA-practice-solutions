class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s == null) {
            return true; 
        }
        if (s.length() <= 1) {
            return true;  
        }
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(rightChar)) {
                right--;
                continue;
            }
            if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                System.out.println("Mismatch found: '" + leftChar + "' vs '" + rightChar + "'");
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] testCases = {
            "A man, a plan, a canal: Panama",
            "race a car",
            " ",
            ".,",
            "0P",
            "a",
            "ab_a",
            "12321",
            "No 'x' in Nixon"
        };
        for (String test : testCases) {
            boolean result = solution.isPalindrome(test);
            System.out.println("\"" + test + "\" -> " + result);
        }
    }
}