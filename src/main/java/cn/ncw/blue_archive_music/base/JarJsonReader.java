package cn.ncw.blue_archive_music.base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class JarJsonReader {
    public static String readJsonFromJar(String filePath) throws IOException {
        // 获取ClassLoader加载资源流
        try (InputStream inputStream = JarJsonReader.class.getClassLoader().getResourceAsStream(filePath)) {
            if (inputStream == null) {
                throw new IOException("文件未找到: " + filePath);
            }
            // 按UTF-8编码读取内容
            StringBuilder content = new StringBuilder();
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(inputStream, StandardCharsets.UTF_8)
            );
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
            return content.toString();
        }
    }
}
