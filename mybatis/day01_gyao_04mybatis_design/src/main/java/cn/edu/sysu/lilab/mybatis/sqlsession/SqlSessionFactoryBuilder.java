package cn.edu.sysu.lilab.mybatis.sqlsession;

import cn.edu.sysu.lilab.mybatis.cfg.Configuration;
import cn.edu.sysu.lilab.mybatis.sqlsession.defaults.DefaultSqlSessionFactory;
import cn.edu.sysu.lilab.mybatis.utils.XMLConfigBuilder;

import java.io.InputStream;

/**
 * Author: gyao
 * Date: 6/18/19
 * E-mail: yaoguocai_cool@163.com
 * 用于创建一个SqlSessionFactory对象
 **/
public class SqlSessionFactoryBuilder {
    /**
     * 根据参数的字节输入流来构建一个SqlSessionFactory工厂
     * @param config
     * @return
     */
    public SqlSessionFactory build(InputStream config){
        Configuration cfg= XMLConfigBuilder.loadConfiguration(config);
        return new DefaultSqlSessionFactory(cfg);
    }
}
