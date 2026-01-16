class Solution {
    public String addStrings(String num1, String num2) {
        int m=num1.length()-1;
        int n=num2.length()-1;
        int c=0;
        StringBuilder sb= new StringBuilder();
        while(m>=0 || n>=0 || c!=0){
            int sum=c;
            if(m>=0){
                sum+=num1.charAt(m)-'0';
                m--;
            }
            if(n>=0){
                sum+=num2.charAt(n)-'0';
                n--;
            }
            sb.append(sum%10);
            c=sum/10;
        }
        return sb.reverse().toString();
    }
}