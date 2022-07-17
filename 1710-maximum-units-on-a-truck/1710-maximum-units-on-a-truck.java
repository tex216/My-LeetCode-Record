class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> (b[1] - a[1]));
        int maxUnit = 0;
        for (int[] boxType : boxTypes) {
            int num = boxType[0], unit = boxType[1];
            maxUnit += unit * Math.min(num, truckSize);
            truckSize -= Math.min(num, truckSize);
            if (truckSize == 0) {break;}
        }
        return maxUnit;
    }
}