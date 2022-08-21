class Solution {
    public int numTeams(int[] rating) {
        //count tripplets that either {arr[i] < arr[j] < arr[k]} 
        //or {arr[i] > arr[j] > arr[k]} where i<j<k.
        int count = 0;
        for (int j = 0; j < rating.length; j++) {
            int leftSmall = 0, rightLarge = 0;
            int leftLarge = 0, rightSmall = 0;
            //left: arr[i] < arr[j] < arr[k]
            for (int i = 0; i < j; i++) {
                if (rating[i] < rating[j]) leftSmall++;
                else if (rating[i] > rating[j]) leftLarge++;
            }
            //right: arr[i] > arr[j] > arr[k]
            for (int k = j+1; k < rating.length; k++) {
                if (rating[k] > rating[j]) rightLarge++;
                else if (rating[k] < rating[j]) rightSmall++;
            }
            count += leftSmall * rightLarge + leftLarge * rightSmall; 
        }
        return count;
    }
}