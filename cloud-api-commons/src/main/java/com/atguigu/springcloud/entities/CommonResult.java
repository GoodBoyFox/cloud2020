package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Ywj
 * @version 1.0
 * @date 2020/6/19 11:08
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult <T>{

    //404 not_found
    private Integer code;
    private String message;
    private  T  data;

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}
