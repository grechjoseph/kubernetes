package com.jg.reader;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.nio.file.Files;

@Slf4j
@RestController
public class MyRestController {

    @SneakyThrows
    @GetMapping("/read")
    public String readText() {
        log.info("Reading text from file.");
        final File file = new File("/tmp/data.txt");
        return new String(Files.readAllBytes(file.toPath()));
    }

}
