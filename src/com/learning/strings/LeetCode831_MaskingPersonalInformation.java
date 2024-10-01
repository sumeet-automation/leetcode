package com.learning.strings;

public class LeetCode831_MaskingPersonalInformation {

    public String maskPII(String s) {
        if(s.contains("@")) return maskedEmail(s);
        else return maskedPhone(s);
    }
    /*
    To mask an email:
The uppercase letters in the name and domain must be converted to lowercase letters.
The middle letters of the name (i.e., all but the first and last letters) must be replaced by 5 asterisks "*****".
     */

    private String maskedEmail(String email) {
        int index = email.indexOf('@');
        return (email.charAt(0) + "*****" + email.charAt(index - 1) + email.substring(index)).toLowerCase();
    }

    /*
    To mask a phone number:

Remove all separation characters.
The masked phone number should have the form:
"***-***-XXXX" if the country code has 0 digits.
"+*-***-***-XXXX" if the country code has 1 digit.
"+**-***-***-XXXX" if the country code has 2 digits.
"+***-***-***-XXXX" if the country code has 3 digits.
"XXXX" is the last 4 digits of the local number.

consists of digits, spaces, and the symbols '(', ')', '-', and '+'.
     */
    private String maskedPhone(String phoneNumber) {
        phoneNumber=phoneNumber.replaceAll("[^0-9]", "");
        return switch (phoneNumber.length()){
          case 10-> "***-***-" + phoneNumber.substring(6);
          case 11 -> "+*-***-***-"+ phoneNumber.substring(7);
          case 12 -> "+**-***-***-"+ phoneNumber.substring(8);
          case 13 -> "+***-***-***-"+ phoneNumber.substring(9);
            default -> "";
        };
        
    }

}
