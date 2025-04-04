package com.algorithm.common;

import java.io.*;
import java.util.Objects;

public class TestFileUtil {

    private TestFileUtil() {
        throw new AssertionError();
    }

    private static File getFile(String fileName) {
        ClassLoader classLoader = TestFileUtil.class.getClassLoader();
        return new File(Objects.requireNonNull(classLoader.getResource(fileName)).getFile());
    }

    public static BufferedReader getReader(String fileName) throws FileNotFoundException {
        return new BufferedReader(new FileReader(getFile( fileName)));
    }

    public static String getAnswer(String fileName) throws IOException {
        BufferedReader reader = getReader( fileName);
        StringBuilder stringBuilder = new StringBuilder();
        String readLine = "";
        while (readLine != null) {
            readLine = reader.readLine();
            if (readLine != null)
                stringBuilder.append(readLine).append("\n");
        }
        return stringBuilder.toString().trim();
    }

}
