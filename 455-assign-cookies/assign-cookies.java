class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int m=0; 
        int n=0;
        while(n<g.length && m<s.length ){
            if(g[n]<=s[m]){
                n++;
            }
            m++;
        }
        return n;
    }
}