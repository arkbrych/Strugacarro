package app;

/**
 * @Author: Arkadiusz Brych
 * Class finds max amplitude in year
 */
class Logic {
    public static void main(String[] args) {
        int[] temperature = {0, 1, -2, 3, 6, 9, 0, 10, -5, 2, -6, 8};
        Solution temp = new Solution();
        System.out.println(temp.solution(temperature));
    }
}