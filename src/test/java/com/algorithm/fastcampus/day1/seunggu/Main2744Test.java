package com.algorithm.fastcampus.day1.seunggu;

import com.algorithm.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;

import static com.algorithm.fastcampus.day1.seunggu.Main2744.solution;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("대소문자 바꾸기")
class Main2744Test {

    @Test
    @DisplayName("테스트 케이스 1")
    void test1 () throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader("testcase/fastcampus/day1/test_case1.txt");
        // when
        String result = solution(reader);
        String answer = TestFileUtil.getAnswer("testcase/fastcampus/day1/answer1.txt");

        // then
        assertThat(result).isEqualTo(answer);

    }
}