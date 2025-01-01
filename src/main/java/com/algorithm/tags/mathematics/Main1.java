package com.algorithm.tags.mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * A + B
 * @see <a href="https://www.acmicpc.net/problem/1000">백준 A+B</a>
 *
 */
public class Main1 {

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
            String line = reader.readLine();
            String[] lines = line.split(" ");
            int a = Integer.parseInt(lines[0]);
            int b = Integer.parseInt(lines[1]);
            System.out.println(a + b);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

}
