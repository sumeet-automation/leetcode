package com.learning.strings;

/*2 digits: A single block of length 2.
3 digits: A single block of length 3.
4 digits: Two blocks of length 2 each.
 */
public class LeetCode1694_ReformatPhoneNumber {

    public static void main(String[] args) {
        LeetCode1694_ReformatPhoneNumber solution = new LeetCode1694_ReformatPhoneNumber();
        System.out.println(solution.reformatNumber("1-23 4 "));
    }

    public String reformatNumber(String number) {
        number = number.replaceAll(" ", "");
        number = number.replaceAll("-", "");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < number.length(); i = i + 3) {
            int currLenth = number.length() - i;
            if (currLenth > 4){
                sb.append(number, i, i + 3).append("-");
            }
            if (currLenth == 4){
                sb.append(number, i, i + 2).append("-");
                sb.append(number.substring(i+2));
                break;
            }
            if (currLenth < 4 && currLenth>1){
                sb.append(number.substring(i));
                break;
            }
        }

        return sb.toString();
    }
}
