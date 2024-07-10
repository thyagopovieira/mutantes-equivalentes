Public class Triângulo{
    public static void main(String[] args) {
        
        int[][] testCases = {
            {3, 4, 5},           
            {1, 1, 1},           
            {2, 2, 3},           
            {0, 1, 1},           
            {-1, 2, 2},         
            {1, 2, 3},           
            {3, 3, 3},           
            {5, 5, 8},           
            {7, 10, 5}           
        };

        
        String[] expectedResults = {
            "SCALENE", "EQUILATERAL", "ISOSCELES", "INVALID",
            "INVALID", "INVALID", "EQUILATERAL", "ISOSCELES", "SCALENE"
        };

        
        for (int i = 0; i < testCases.length; i++) {
            int a = testCases[i][0];
            int b = testCases[i][1];
            int c = testCases[i][2];
            int result = classify(a, b, c);
            String resultName;

            switch (result) {
                case INVALID:
                    resultName = "INVALID";
                    break;
                case SCALENE:
                    resultName = "SCALENE";
                    break;
                case EQUILATERAL:
                    resultName = "EQUILATERAL";
                    break;
                case ISOSCELES:
                    resultName = "ISOSCELES";
                    break;
                default:
                    resultName = "UNKNOWN";
            }

            System.out.println("classify(" + a + ", " + b + ", " + c + ") = " + resultName +
                    " (Expected: " + expectedResults[i] + ")");
        }
    }
}