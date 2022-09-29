import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/count-items-matching-a-rule/
public class CountItemsMatchingARule {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        List<String> item= new ArrayList<>();
        item.add("phone");
        item.add("blue");
        item.add("pixel");
        items.add(item);
        List<String> item1= new ArrayList<>();
        item1.add("computer");
        item1.add("silver");
        item1.add("lenovo");
        items.add(item1);
        List<String> item2= new ArrayList<>();
        item2.add("phone");
        item2.add("gold");
        item2.add("iphone");
        items.add(item2);
        System.out.println(countMatches( items,  "color", "silver"));
        System.out.println(countMatches( items,  "type", "phone"));

    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int count=0;

        for (List<String> item:items) {
            if(ruleKey.equalsIgnoreCase("type") && ruleValue.equalsIgnoreCase(item.get(0)) ){
                count++;
            }
            if(ruleKey.equalsIgnoreCase("color") && ruleValue.equalsIgnoreCase(item.get(1)))
            {
                count++;
            }
            if(ruleKey.equalsIgnoreCase("name") && ruleValue.equalsIgnoreCase(item.get(2))){
                count++;
            }
        }
        return count;
    }
}
