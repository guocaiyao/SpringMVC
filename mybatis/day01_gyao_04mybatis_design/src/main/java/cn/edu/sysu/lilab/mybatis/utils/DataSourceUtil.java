package cn.edu.sysu.lilab.mybatis.utils;

import cn.edu.sysu.lilab.mybatis.cfg.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Author: gyao
 * Date: 6/18/19
 * E-mail: yaoguocai_cool@163.com
 * 用于创建数据源的工具类
 **/
public class DataSourceUtil {
    /**
     * 用于获取一个连接
     * @param cfg
     * @return
     */
    public static Connection getConnection(Configuration cfg){
        try {
            Class.forName(cfg.getDriver());
            return DriverManager.getConnection(cfg.getUrl(), cfg.getUsername(), cfg.getPassword());
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
