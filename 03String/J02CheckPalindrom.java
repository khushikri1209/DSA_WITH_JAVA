public class J02CheckPalindrom {

    public static void main(String[] args) {

        String str = "madam";

        int left = 0;
        int right = str.length() - 1;

        boolean flag = true;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                flag = false;
                break;
            }
            left++;
            right--;
        }

        if (flag) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}