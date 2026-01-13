class Solution {
    public String discountPrices(String sentence, int discount) {
        String[] str = sentence.split(" ");
        for (int i = 0; i < str.length; i++) {
            if (isValidPrice(str[i])) {
                str[i] = discountedPrice(str[i], discount);
            }
        }
        return String.join(" ", str);
    }

    private boolean isValidPrice(String s) {
        if(s.charAt(0) != '$') return false;

        return s.substring(1).matches("\\d+");
    }

    private String discountedPrice(String s, int discount) {
        double amount = Double.parseDouble(s.substring(1));
        amount = amount - ((amount * discount) / 100.0);
        return String.format('$' + "%.2f", amount);
    }       

}