package app;

import java.util.Arrays;

class Solution {
    String solution(int[] T) {

        int temp1 = T.length / 4;
        int lowest1 = T[0];
        int max1 = T[0];
        for (int i = 0; i < temp1; i++) {
            if (lowest1 > T[i]) {
                lowest1 = T[i];
            }
            if (max1 < T[i]) {
                max1 = T[i];
            }
        }

        int temp2 = temp1 + temp1;
        int lowest2 = T[temp1];
        int max2 = T[temp1];
        for (int i = temp1; i < temp2; i++) {
            if (lowest2 > T[i]) {
                lowest2 = T[i];
            }
            if (max2 < T[i]) {
                max2 = T[i];
            }
        }

        int temp3 = temp2 + temp1;
        int lowest3 = T[temp2];
        int max3 = T[temp2];
        for (int i = temp2; i < temp3; i++) {
            if (lowest3 > T[i]) {
                lowest3 = T[i];
            }
            if (max3 < T[i]) {
                max3 = T[i];
            }
        }

        int temp4 = temp3 + temp1;
        int lowest4 = T[temp3];
        int max4 = T[temp3];
        for (int i = temp3; i < temp4; i++) {
            if (lowest4 > T[i]) {
                lowest4 = T[i];
            }
            if (max4 < T[i]) {
                max4 = T[i];
            }
        }

        int winterTemp = amplitude(lowest1, max1);
        int springTemp = amplitude(lowest2, max2);
        int summerTemp = amplitude(lowest3, max3);
        int autumnTemp = amplitude(lowest4, max4);
        Integer[] amplitudeTemp = {winterTemp, springTemp, summerTemp, autumnTemp};
        Arrays.sort(amplitudeTemp);

        if (amplitudeTemp[3] == winterTemp) {
            return "Winter";
        } else if (amplitudeTemp[3] == springTemp) {
            return "Spring";
        } else if (amplitudeTemp[3] == summerTemp) {
            return "Summer";
        }
        return "Autumn";
    }


    private int amplitude(int lowest, int max) {
        return max - lowest;
    }
}
