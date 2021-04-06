package com.mikechen.star.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
* @author chenweijian
*
* user : 用户表
*/
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
    * 主键 : id, 
    */
    private Integer id;

    /**
    * create_time, 创建时间
    */
    private Date createTime;

    /**
    * update_time, 更新时间
    */
    private Date updateTime;

    /**
    * name, 姓名
    */
    private String name;

}