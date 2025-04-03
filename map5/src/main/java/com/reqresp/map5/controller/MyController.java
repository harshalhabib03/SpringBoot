package com.reqresp.map5.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/crm")
public class MyController {

    //
    @GetMapping("/{id}/{name}/{loc}")
    public String readPathVarData(@PathVariable Integer id,
                                  @PathVariable String name,
                                  @PathVariable String loc){
        return "Request Path Varaiable Data is: "+id+name+loc;
    }

    //
    @GetMapping("/data")
    public String readReqParamData(@RequestParam Integer uid,
                                   @RequestParam String uname,
                                   @RequestParam String uloc){
        return "Request Param Data is: "+uid+uname+uloc;
    }

    //localhost:8081/crm/getUser
    @GetMapping("/getUser")
    public String readReqHeaderData(@RequestHeader("token") String token){
        return "Request Header Token: "+token;
    }

    @GetMapping("/getname")
    public String readReqBodyData(@RequestBody String name){
        return "helo"+name;
    }


}
