package com.jg.writer;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.PrintWriter;

@Slf4j
@RestController
public class MyRestController {

    @SneakyThrows
    @GetMapping("/write/{textToWrite}")
    public void writeText(@PathVariable(name = "textToWrite") final String textToWrite) {
        log.info("Writing text: {}", textToWrite);
        final File file = new File("/tmp/data.txt");
        final PrintWriter writer = new PrintWriter(file);
        writer.print(textToWrite);
        writer.close();
        log.info("Text written successfully.");
    }

}
