package io.pivotal.shinyay.test;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class DemoService {

    public String greeting(String greet) {
        if (StringUtils.isEmpty(greet)) {
            return "Say something...";
        }

        return "hello";
    }
}
