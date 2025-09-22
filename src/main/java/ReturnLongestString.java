
public class ReturnLongestString {
    public String longest(String[] arr){
        if (arr == null || arr.length == 0) return null;
        String longest = arr[0];
        for (String str : arr) {
            if (str.length() > longest.length()) {
                longest = str;
            }
        }
        return longest;
    }
}
