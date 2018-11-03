/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connect_dev.Connect.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author karen
 */
@RestController
public class helloController {
    
    @RequestMapping("/hello")
    public String sayHi(){
        return "HI COSTE";
    }
    
}
