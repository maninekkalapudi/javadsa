package Arrays_5;

//https://leetcode.com/problems/count-items-matching-a-rule/

import java.util.ArrayList;
import java.util.List;

public class ItemsMatchingWithRules {
    public static void main(String[] args) {

        List<List<String>> items = new ArrayList<>();
        items.add(List.of(new String[]{"phone", "blue", "pixel"}));
        items.add(List.of(new String[]{"computer","silver","lenovo"}));
        items.add(List.of(new String[]{"phone","gold","iphone"}));

        String ruleKey = "color", ruleValue = "silver";

        System.out.println(countMatches(items, ruleKey, ruleValue));
    }

    private static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;

        for (List<String> item : items) {
            if ((ruleKey.equals("type")) && (item.get(0).equals(ruleValue))) {
                count += 1;
            } else if ((ruleKey.equals("color")) && (item.get(1).equals(ruleValue))) {
                count += 1;
            } else if ((ruleKey.equals("name")) && (item.get(2).equals(ruleValue))) {
                count += 1;
            }
        }

        return count;
    }
}
