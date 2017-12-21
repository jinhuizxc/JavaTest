package com;

import java.util.Date;

/**
 * 快捷键
 *
 * 1、在IntelJ中和Eclipse中稍有不同，在Eclipse中，输入main再按Alt+/即可自动补全main函数，但是在IntellJ中则是输入psvm，选中即可
 * 2、在方法体内部有for循环，在IntellJ中是输入fori，然后会有一个提示，选中需要的for循环即可
 * 3、System.out.println();在IntellJ中是输入sout
 *
 * 本集内容：Alt+数字键可跳转到相应的地方，再点Esc可跳转回去。
 * 注意：如果没有如老师那样的窗口，可点击view——tool buttons打开
 *
 * 项目的跳转
 * ctrl+Alt+[]
 * 快速寻找功能快捷键——ctrl+shift+A
 *
 * 文件的跳转
 ctrl+e 最近的文件
 ctrl+shift+e 最近编辑的文件

 浏览修改位置的跳转
 ctrl+shift+backspace

 最新浏览位置的修改
 ctrl+shift+左箭头（win10会改变屏幕方向）

 使用书签进行跳转
 标记书签 ctrl+shift+数字或字母
 跳转书签 ctrl+数字或者字母
 总览书签 shift+F11

 插件emacs
 在同一屏幕内支持跳转到任何字母
 需要自己设置快捷键
 使用方法是点下快捷键后
 在点下相应的字母


 定位类
 ctrl+n

 定位文件
 ctrl + shift +n

 定位函数或者属性
 ctrl + shift + alt +n

 字符串
 ctrl + shift + f



 列操作

 ctrl+shift+alt +j

 移动一个词：
 Ctrl+←→

 移动并选中一个词：
 Ctrl+Shift+↔

 Ctrl+Home， Ctrl+End

 代码格式化

 ctrl+alt+l

 重构变量（重命名变量）：Shift+F6
 重构方法：直接在报错的地方输入Alt+Enter，这是坠快的！
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
