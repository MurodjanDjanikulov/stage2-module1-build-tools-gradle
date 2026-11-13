package com.epam.demo;

import com.epam.utils.StringUtils;

import java.util.Arrays;
import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        return args != null && args.stream().allMatch(StringUtils::isPositiveNumber);
    }
    public static void main(String[] args) {
        System.out.println(isAllPositiveNumbers(Arrays.asList("-1")));
    }

}