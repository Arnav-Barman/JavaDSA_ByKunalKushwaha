package com.arnav;

import java.util.Locale;

public class palindrome {
    public static void main(String[] args) {
        String str = "naman";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str){
        if(str == null || str.length() == 0)
            return true;
        str = str.toLowerCase();
        int s=0, e=str.length()-1;
        boolean ans = true;
        while(s<e){
            if(str.charAt(s)!=str.charAt(e)){
                ans = false;
                break;
            }
            s++;e--;
        }
        return ans;
    }
}
