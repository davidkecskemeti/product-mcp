package com.davidk.productmcp.tools;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyTools {

    @Tool(name = "greeting", description = "welcome message")
    public String getWelcomeMessage(){
        return "Welcome to David K";
    }

    @Tool(name = "get-products", description = "fetch list of products")
    public List<String> getAllProductName() {
        var list = new ArrayList<String>();
        list.add("Smartphone");
        list.add("Fridge");
        list.add("Smart tw");
        list.add("Ceiling fan");
        return list;
    }
}
