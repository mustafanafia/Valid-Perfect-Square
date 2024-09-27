class Solution {
    public boolean isPerfectSquare(int num) {

        if(num == 0 || num == 1) return true;

        int left = 2;
        int right = num / 2;

        while(left <= right){

            int mid = (left + right) / 2;

            if(num / mid == mid && num % mid == 0){
                return true;
            }
            else if(num / mid < mid){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return false;
    }

}