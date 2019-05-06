package com.huangbin.ssm.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author: huangbin
 * @description:
 * @date: Created in 2019/5/6
 * @modified By:
 */
@Setter
@Getter
@AllArgsConstructor
public class Course {

    private String id;

    private String name;

    private String instructor;

    private String startDate;

    private String endDate;
}
