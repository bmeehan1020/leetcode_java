class AtoI {

    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE);
        // System.out.println(myAtoi("9223372036854775808"));
    }

    public static int myAtoi(String str) {
        char[] chars = str.toCharArray();
        // eliminate leading whitespace, return if finds non-numeric char
        int i = 0;
        while (i < chars.length && chars[i] != '+' && chars[i] != '-' && !Character.isDigit(chars[i])) {
            if (chars[i] != ' ') {
                return 0;
            }
            i++;
        }
        // check for - and make sign negative
        long sign = 1L;
        if (i < chars.length && chars[i] == '-') {
            sign *= -1L;
            i++;
        } else if (i < chars.length && chars[i] == '+') {
            i++;
        }
        // convert remaining contiguous digits into an int
        long number = 0L;
        for (; i < chars.length; i++) {
            if (!Character.isDigit(chars[i])) {
                break;
            }
            number = number * 10L + (long) Character.digit(chars[i], 10);
        }
        number *= sign;
        // check if overflows int
        if (number > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (number < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else {
            return (int) number;
        }
    }
}