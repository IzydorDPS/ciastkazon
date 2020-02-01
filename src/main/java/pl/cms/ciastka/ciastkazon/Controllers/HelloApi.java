package pl.cms.ciastka.ciastkazon.Controllers;


import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApi {

    @GetMapping("/api/hello")
    @PreAuthorize("permitAll()") 
    @PostAuthorize("permitAll()") 
    public String sayHello() {
        return "Hello!";
    }
}
