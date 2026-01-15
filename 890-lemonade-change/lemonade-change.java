class Solution {
    public boolean lemonadeChange(int[] bills) {
        int s5=0;
        int s10=0;
        // Arrays.sort(bills);
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                s5++;
            }
            else if(bills[i]==10){
                if(s5>0){
                    s5--;
                    s10++;
                }
                else{
                    return false;
                }
            }
            else{
                if(s5>0){
                    if(s10>0){
                        s10--;
                        s5--;
                    }
                    else if(s5>=3){
                        s5=s5-3;
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}