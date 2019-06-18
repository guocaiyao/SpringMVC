package cn.edu.sysu.lilab.mybatis.io;

import java.io.InputStream;

/**
 * Author: gyao
 * Date: 6/18/19
 * E-mail: yaoguocai_cool@163.com
 * 使用类加载器读取配置文件的类
 **/
public class Resources {
    /**
     * 根据传入的参数，获取一个字节输入流
     * @param filePath
     * @return
     */
    public static InputStream getResourceAsStream(String filePath){
        return  Resources.class.getClassLoader().getResourceAsStream(filePath);
    }
}
