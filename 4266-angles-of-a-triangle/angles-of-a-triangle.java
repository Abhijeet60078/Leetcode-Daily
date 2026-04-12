class Solution {
    public double[] internalAngles(int[] sides) {
        int[] arr=sides;
        int a=arr[0];
        int b=arr[1];
        int c=arr[2];
        if (a + b <= c || a + c <= b || b + c <= a) {
            return new double[0];
        }
        double angleA = Math.toDegrees(Math.acos((b*b + c*c - a*a) / (2.0*b*c)));
        double angleB = Math.toDegrees(Math.acos((a*a + c*c - b*b) / (2.0*a*c)));
        double angleC = Math.toDegrees(Math.acos((a*a + b*b - c*c) / (2.0*a*b)));

        double[] ans = {angleA, angleB, angleC};
        Arrays.sort(ans);
        return ans;

        
    }
}