package gr.aueb.cf.cp7;

/**
 * Encrypt and decrypt a string input
 */
public class CryptoApp {
    public static void main(String[] args) {
        String inputString = "Coding Factory";
        String encrypted = Encrypt(inputString);
        Decrypt(encrypted);
    }

    /**
     * Encrypt input string with ASCII Hex code and print the decrypted string
     * @param s input string
     * @return decrypted string
     */
    public static String Encrypt (String s) {
        StringBuilder sb = new StringBuilder();
        String [][] arr = {{"a", "61"}, {"b", "62"}, {"c", "63"}, {"d", "64"}, {"e", "65"}, {"f", "66"},
                {"g", "67"}, {"h", "68"}, {"i", "69"}, {"j", "6a"}, {"k", "6b"}, {"l", "6c"}, {"m", "6d"},
                {"n", "6e"}, {"o", "6f"}, {"p", "70"}, {"q", "71"}, {"r", "72"}, {"s", "73"}, {"t", "74"},
                {"u", "75"}, {"v", "76"}, {"w", "77"}, {"x", "78"}, {"y", "79"}, {"z", "7a"}, {" ", "20"}};

        for (char ch : s.toCharArray()) {
            for (int i = 0; i < arr.length; i++) {
                    if (arr[i][0].equalsIgnoreCase(String.valueOf(ch))) {
                        sb.append(arr[i][1]);
                        break;
                }
            }
        }
        System.out.println(sb);
        return sb.toString();
    }

    /**
     * Decrypt input string with ASCII Hex code and print the decrypted string.
     * @param s encrypted string with ASCII Hex code
     */
    public static void Decrypt(String s) {
        String [][] arr = {{"a", "61"}, {"b", "62"}, {"c", "63"}, {"d", "64"}, {"e", "65"}, {"f", "66"},
                {"g", "67"}, {"h", "68"}, {"i", "69"}, {"j", "6a"}, {"k", "6b"}, {"l", "6c"}, {"m", "6d"},
                {"n", "6e"}, {"o", "6f"}, {"p", "70"}, {"q", "71"}, {"r", "72"}, {"s", "73"}, {"t", "74"},
                {"u", "75"}, {"v", "76"}, {"w", "77"}, {"x", "78"}, {"y", "79"}, {"z", "7a"}, {" ", "20"}};
        int lengthChars = s.length()/2; //two chars one letter
        StringBuilder sb = new StringBuilder();
        int startIndex = 0;
        int endIndex = 2;

        for (int i = 0; i < lengthChars ; i++) {
            String temp = s.substring(startIndex,endIndex);
            for (int j = 0; j < arr.length; j++) {
                if ((arr[j][1]).equalsIgnoreCase(temp)) {
                    sb.append(arr[j][0]);
                    break;
                }
            }
            startIndex += 2;
            endIndex += 2;
        }
        System.out.println(sb);
    }
}
