package com.zhangyue.com.mykotlinproject.other;

/**
 * @author lihanrui
 * @date 2017/6/15
 */

public class Test {
    public static void main(String[] args) {

        /*CountRandom random = (CountRandom) new CountRandom.Builder()
                .setSeed(System.currentTimeMillis())
                .setLowRange(0)
                .setUpRange(10)
                .build();
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " > " + random.next());
        }*/
        new ListTest().test();
    }
}
