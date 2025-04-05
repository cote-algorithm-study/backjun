package com.algorithm.tags.mathematics.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * <p>문제번호 : 1000 </p>
 * <p>문제이름 : A + B</p>
 * <p>문제등곱 : 브론즈5</p>
 * @see <a href="https://www.acmicpc.net/problem/1000">백준 A+B</a>
 *
 */
public class Main1000 {

    /**
     * <h2>문제</h2>
     * <p>두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.</p>
     * <h2>입력</h2>
     * <p>첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)</p>
     * <h2>출력</h2>
     * <p>첫째 줄에 A+B를 출력한다.</p>
     * @param args
     */
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int answer = solution(reader);
            System.out.printf("%d", answer);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader reader) throws IOException {
        String line = reader.readLine();
        String[] lines = line.split(" ");
        int a = Integer.parseInt(lines[0]);
        int b = Integer.parseInt(lines[1]);
        return a + b;
    }

}
