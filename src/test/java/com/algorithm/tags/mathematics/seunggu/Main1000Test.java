package com.algorithm.tags.mathematics.seunggu;

import com.algorithm.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;

import static com.algorithm.tags.mathematics.seunggu.Main1000.solution;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("백준 1000번 A + B")
class Main1000Test {

    @Test
    @DisplayName("테스트 케이스 1")
    void test1 () throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader("testcase/tags/mathematics/test1/test_case1.txt");
        // when
        int result = solution(reader);
        String answer = TestFileUtil.getAnswer("testcase/tags/mathematics/test1/answer1.txt");

        // then
        assertThat(result).isEqualTo(Integer.parseInt(answer));
    }

}