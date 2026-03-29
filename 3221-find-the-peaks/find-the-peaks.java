class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        ArrayList<Integer> al =new ArrayList<>();
        if(mountain.length==1){
            return al;
        }
        for(int i=0;i<mountain.length;i++){
            if(i==0 || i==mountain.length-1){
                continue;
            }
            else{
                if(mountain[i]>mountain[i-1] && mountain[i]>mountain[i+1]){
                    al.add(i);
                }
            }
        }
        return al;
    }
}