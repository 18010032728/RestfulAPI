package com.example.ztlend.dataobject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: Li Liu
 * @Description:
 * @Date: Created in 下午3:23 2018/11/14
 * @Modified By:
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String addr;
    private Integer age;
    private BigDecimal salary;
    private Date createTime;
    private Date updateTime;
}
