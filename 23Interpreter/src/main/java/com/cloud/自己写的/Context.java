package com.cloud.自己写的;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/7
 * @Time 9:07
 */
// 环境角色，拥有全局信息
public class Context {

    String command;

    int numSub; // 下标
    List<Integer> numList = new ArrayList<>(); // 保存数字的集合

    int signSub; // 下标
    List<String> signList = new ArrayList<>(); // 保存符号的集合

    int value; // 之前计算的数值


    public Context(String command) {
        this.command = command;
        getNumList();
        getSignList();
    }

    // 筛选出所有数字
    public void getNumList() {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(command);
        while (matcher.find()) {
            numList.add(Integer.parseInt(matcher.group(0)));
        }
    }

    // 筛选出所有符号
    public void getSignList() {
        Pattern pattern = Pattern.compile("\\W+");
        Matcher matcher = pattern.matcher(command);
        while (matcher.find()) {
            signList.add(matcher.group(0));
        }
    }
}
