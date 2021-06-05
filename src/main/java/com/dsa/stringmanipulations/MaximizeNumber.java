package stringmanipulations;

/**
 * Maximize a number by converting max one swap
 * only one 6 can be converted to 9
 */
public class MaximizeNumber {

    public String maximum69Number(int num) {
        int i = 0;
        StringBuffer sb = new StringBuffer();
        String numStr = String.valueOf(num);
        while (true) {
            char a = numStr.charAt(i++);
            if (a == '6') {
                sb.append('9');
                break;
            } else {
                sb.append(a);
            }
        }

        if (i <= numStr.length() - 1) {
            sb.append(numStr.substring(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int n = 996966666;
        MaximizeNumber obj = new MaximizeNumber();
        String output = obj.maximum69Number(n);
        System.out.println(output);
    }
}
