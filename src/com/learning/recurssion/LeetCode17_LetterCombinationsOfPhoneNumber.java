package com.learning.recurssion;

import java.util.*;

public class LeetCode17_LetterCombinationsOfPhoneNumber {
   private Map<Character,String> phoneKeypad = Map.of('2',"abc",
            '3',"def",
            '4',"ghi",
            '5',"jkl",
            '6',"mno",
            '7',"pqrs",
            '8',"tuv",
            '9',"wxyz"
    );

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.isEmpty()) {
            return Collections.emptyList();
        }
        generate(digits, 0, "",result);
        return result;
    }

    public void generate(String digits, int index, String perm, List<String> result) {
        if (index == digits.length()) {
            result.add(perm);
            return;
        }
        String alphabets = phoneKeypad.get(digits.charAt(index));
        for (int i = 0; i < alphabets.length(); i++) {
            perm += alphabets.charAt(i);
            generate(digits,index+1,perm,result);
            perm = perm.substring(0, perm.length()- 1);
        }
    }
}
