package me.sj.algorithm.backjoon.hash;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 2019 HEPC - MAVEN League의 "비밀번호 만들기"와 같은 방식으로 비밀번호를 만든 경민이는 한 가지 문제점을 발견하였다.
 * 비밀번호가 랜덤으로 만들어져서 기억을 못 한다는 것이었다! 그래서 경민이는 메모장에 사이트의 주소와 비밀번호를 저장해두기로 했다.
 * 하지만 컴맹인 경민이는 메모장에서 찾기 기능을 활용하지 못하고 직접 눈으로 사이트의 주소와 비밀번호를 찾았다. 메모장에 저장된 사이트의 수가 늘어나면서 경민이는 비밀번호를 찾는 일에 시간을 너무 많이 쓰게 되었다.
 * 이를 딱하게 여긴 문석이는 경민이를 위해 메모장에서 비밀번호를 찾는 프로그램을 만들기로 결심하였다! 문석이를 도와 경민이의 메모장에서 비밀번호를 찾아주는 프로그램을 만들어보자.
 **/
public class P17219 {
    public static void main(String[] args) {
        P17219 p17219 = new P17219();
        Scanner in = new Scanner(System.in);

        // 저장된 사이트 주소의 수
        int n = in.nextInt();

        // 찾으려는 주소의 수
        int m = in.nextInt();
        in.nextLine();

        String[] strArr = new String[n];

        for (int i = 0; i < n; i++) {
            strArr[i] = in.nextLine();
        }

        String[] target = new String[m];

        for (int i = 0; i < m; i++) {
            target[i] = in.nextLine();
        }

        String[] passwords = p17219.solutionMine(strArr, target);

        for (String p : passwords) {
            System.out.println(p);
        }

    }

    public String[] solutionMine(String[] strArr, String[] target) {
        String[] answer = new String[target.length];
        HashMap<String, String> map = new HashMap<>();

        for (String s : strArr) {
            String[] split = s.split(" ");
            map.put(split[0], split[1]);
        }

        for (int i = 0; i < target.length; i++) {
            answer[i] = map.get(target[i]);
        }

        return answer;
    }
}
