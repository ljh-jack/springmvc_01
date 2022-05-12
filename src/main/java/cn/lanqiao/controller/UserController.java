package cn.lanqiao.controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping
    public String save(){
        System.out.println("user save....");
        return "{hello springMvc}";
    }
    @DeleteMapping("{id}")
    public String delete(@PathVariable Integer id){
        System.out.println("user delete...."+id);
        return "{hello springMvcDelete}";
    }

    /**
     * 普通参数的传递
     * @param name
     * @param age
     * @return
     */
    @PostMapping
    public String commonParam(String name,int age){
        System.out.println("普通的参name "+name);
        System.out.println("普通的参数age"+age);
        return "{'module':common param}";
    }
    @PostMapping("/listParamJson")
    public String listParamJson(@RequestBody List<String> likes){
        System.out.println("list:"+likes);
        return "{'module':common param}";
    }

}
