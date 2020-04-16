package org.text.bookpub;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;


public class StartupRunner implements CommandLineRunner {
    protected  final Logger logger  = LoggerFactory.getLogger(StartupRunner.class);

    //@Override
    public void run(String... Strings) throws Exception{
        logger.info("hello");
    }
}
