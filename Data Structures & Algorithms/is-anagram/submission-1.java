class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int[] car = new int[27];
        for(int i=0;i<car.length;i++){
            car[i] =0;
        }
        for(int i=0;i<s.length();i++){
            car[s.charAt(i) - 'a']++;
             car[t.charAt(i) - 'a']--;
        }
        for(int i=0;i<26;i++){
           if(car[i]!=0){
            return false;
           }
        }
        return true;
    }
}
