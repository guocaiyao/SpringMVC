package cn.edu.sysu.lilab.mybatis.sqlsession.defaults;

import cn.edu.sysu.lilab.mybatis.cfg.Configuration;
import cn.edu.sysu.lilab.mybatis.sqlsession.SqlSession;
import cn.edu.sysu.lilab.mybatis.sqlsession.SqlSessionFactory;

/**
 * Author: gyao
 * Date: 6/18/19
 * E-mail: yaoguocai_cool@163.com
 * SqlSessionFactory接口的实现类
 **/
public class DefaultSqlSessionFactory implements SqlSessionFactory {

    private Configuration cfg;
    public DefaultSqlSessionFactory(Configuration cfg){
        this.cfg=cfg;
    }

    /**
     * 用于创建一个新的操作数据库对象
     * @return
     */
    public SqlSession openSession() {
        return new DefaultSqlSession(cfg);
    }
}
