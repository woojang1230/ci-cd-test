package kr.co.kumsung.cicdtest.ui;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cicd")
public class DeploymentRestController {
    @GetMapping
    public ResponseEntity<String> connectServer(){
        return ResponseEntity.ok("CONNECT!!");
    }
}
