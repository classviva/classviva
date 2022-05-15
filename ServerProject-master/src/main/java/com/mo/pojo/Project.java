package com.mo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @create 2022-05-04 17:41
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project {
    private int pid;
    private String pname;
    private int ptype;
}
