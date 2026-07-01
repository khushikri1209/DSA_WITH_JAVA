public class J01ReverseString {

    public static void main(String[] args) {

        String str = "Hello";

        char[] ch = str.toCharArray();

        int left = 0;
        int right = ch.length - 1;

        while (left < right) {

            // Swap characters
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            left++;
            right--;
        }

        System.out.println("Original String : " + str);
        System.out.println("Reversed String : " + new String(ch));
    }
}