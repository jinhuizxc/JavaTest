package com;

import java.util.Date;

/**
 * 快捷键
 *
 * 1、在IntelJ中和Eclipse中稍有不同，在Eclipse中，输入main再按Alt+/即可自动补全main函数，但是在IntellJ中则是输入psvm，选中即可
 * 2、在方法体内部有for循环，在IntellJ中是输入fori，然后会有一个提示，选中需要的for循环即可
 * 3、System.out.println();在IntellJ中是输入sout
 */
public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(new Date());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

}