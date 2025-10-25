class Solution {
    public int totalMoney(int n) {
        int tot = 0;
        for (int i = 1; i <= n; i++) {
            if (i <= 7) {
                tot += i; 
            } else {
                int week = (i - 1) / 7;      
                int day = (i - 1) % 7 + 1;   
                tot += week + day;          
            }
        }
        return tot;
    }
}
