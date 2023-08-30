class Math {
  
    static double pow(int num, int n) {
        if (n == 0) {
            return 1; // Any number raised to the power of 0 is 1
        } else if (n > 0) {
            double result = 1.0;
            for (int i = 1; i <= n; i++) {
                result *= num;
            }
            return result;
        } else {
            // For negative powers, calculate the reciprocal of positive power result
            double positivePower = pow(num, -n);
            return 1.0 / positivePower;
        }
    }
    
    
   /* static double pow(int num, int n) {
        double result = Math.pow(num, n);
        return result;
    }
    */
}
