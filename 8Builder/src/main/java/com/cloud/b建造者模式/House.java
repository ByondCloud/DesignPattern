package com.cloud.b建造者模式;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/20
 * @Time 8:23
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class House {
    private String basic;
    private String wall;
    private String roofed;
}
