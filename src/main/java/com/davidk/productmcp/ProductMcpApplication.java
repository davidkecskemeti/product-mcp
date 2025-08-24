package com.davidk.productmcp;

import com.davidk.productmcp.tools.MyTools;
import org.springframework.ai.support.ToolCallbacks;
import org.springframework.ai.tool.ToolCallback;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ProductMcpApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductMcpApplication.class, args);
    }

    @Bean
    public List<ToolCallback> toolCallbackList(MyTools myTools) {
        return List.of(ToolCallbacks.from(myTools));
    }
}
