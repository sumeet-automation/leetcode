package com.learning.array;

import javax.xml.crypto.dsig.XMLObject;
import java.util.HashMap;
import java.util.Map;

public class LeetCode953_AlienDictionary {

    public int countOdds(int low, int high) {
        int r = high - low;
        if (r % 2 == 0 && high % 2 == 1) {
            return r / 2 + 1;
        } else if (r % 2 == 1) {
            return r / 2 + 1;
        } else {
            return r / 2;
        }
    }
}
