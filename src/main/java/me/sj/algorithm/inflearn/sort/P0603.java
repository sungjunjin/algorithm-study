package me.sj.algorithm.inflearn.sort;

import java.util.Scanner;

/**
 * 삽입 정렬
 * N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
 * <p>
 * 정렬하는 방법은 삽입정렬입니다.
 */
public class P0603 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        P0603 p0603 = new P0603();
        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for (int a : p0603.solutionMine(arr)) {
            System.out.print(a + " ");
        }
    }

    public int[] solutionMine(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // 삽입대상
            int tmp = arr[i];
            int j = 0;

            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > tmp) {
                    // 뒤로 밀림
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }

            arr[j + 1] = tmp;

        }

        return arr;
    }

    public int[] solutionLecture(int[] arr) {

        return arr;
    }
}
