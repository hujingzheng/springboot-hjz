package com.hjz.utils.mapstruct;

import lombok.Data;

import java.util.Date;

/**
 * Description： TODO
 * Author: hujingzheng
 * Date: 2020/8/14 11:03
 */

@Data
public class CarDto {

    private Integer id;
    private String name;
    private String color;
    private Date createTime;

}
