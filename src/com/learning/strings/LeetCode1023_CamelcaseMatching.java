package com.learning.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class LeetCode1023_CamelcaseMatching {

    public static void main(String[] args) {
        LeetCode1023_CamelcaseMatching solution = new LeetCode1023_CamelcaseMatching();
        System.out.println(solution.camelMatch(new String[]{"aksvbjLiknuTzqon", "ksvjLimflkpnTzqn", "mmkasvjLiknTxzqn", "ksvjLiurknTzzqbn", "ksvsjLctikgnTzqn", "knzsvzjLiknTszqn"}, "ksvjLiknTzqn"));
    }

    public List<Boolean> camelMatch(String[] queries, String pattern) {
        StringJoiner sb = new StringJoiner("[a-z]*", "[a-z]*", "[a-z]*$");
        for (String leter : pattern.split("")) {
            sb.add(leter);
        }
        pattern = sb.toString();
        System.out.println(pattern);
        List<Boolean> list = new ArrayList<>();
        for (String query : queries) {
            list.add(query.matches(pattern));
        }
        return list;
    }
}
