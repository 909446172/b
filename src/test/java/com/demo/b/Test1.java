package com.demo.b;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author zyy
 * @version 1.0
 * @date 2019/11/28 16:57
 */
public class Test1 {


    @Test
    public  void test1() {
        List<String> list = Arrays.asList("a", "b", "c");
        list.stream().map(t -> {

                    return t+"--"+t;
                }
        ).forEach(t -> {    });
        System.out.println(list);

    }

}
