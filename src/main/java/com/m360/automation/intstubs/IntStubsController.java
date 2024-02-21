package com.m360.automation.intstubs;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api/intstubs")
public class IntStubsController {

    @GetMapping("/userdata")        
    public Map<String,Object> getResponse(){
        Map<String, Object> response  = Map.of("string", "srinivas!", "number", 23, "boolean", true);
        return response;
    }

    @PostMapping("/requestdata")        
    public Map<String,Object> getResponse(Map<String,Object> requestdata){
        return requestdata;
    }
}
