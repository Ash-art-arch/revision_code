class Solution {
    public static int minimizeSet(int divisor1, int divisor2, int uniqueCnt1, int uniqueCnt2) {
        int arr1[] = new int[uniqueCnt1];
        int arr2[] = new int[uniqueCnt2];
        int i = 0;
        int j = 0;
        int x = 1;
        int y = 1;

        while (i < uniqueCnt1 && j < uniqueCnt2) {
            if (x % divisor1 != 0) {
                arr1[i++] = x;
            }

            if (y % divisor2 != 0) {
                arr2[j++] = y;
            }

            x++;
            y++;
        }

        while (i < uniqueCnt1) {
            if (x % divisor1 != 0) {
                arr1[i++] = x;
            }
            x++;
        }

        while (j < uniqueCnt2) {
            if (y % divisor2 != 0) {
                arr2[j++] = y;
            }
            y++;
        }
    
        int big1 = arr1[arr1.length - 1];
        int big2 = arr2[arr2.length - 1];

        if (big1 > big2) {
            return big1;
        }
        return big2;
    }

    public static void main(String[] args) {
        int divisor1 = 3;
        int divisor2 = 5;
        int uniqueCnt1 = 2;
        int uniqueCnt2 = 3;
        System.out.println(minimizeSet(divisor1, divisor2, uniqueCnt1, uniqueCnt2));
    }
}

