package com.hjz.starter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Description： TODO
 * Author: hujingzheng
 * Date: 2021/6/18 11:46
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HelloService {
    private String msg;
    private String name;

    public void say() {
        System.out.println(name + ":" + msg);
    }

}
