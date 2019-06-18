package cn.edu.sysu.lilab.mybatis.sqlsession.defaults;

import cn.edu.sysu.lilab.mybatis.cfg.Configuration;
import cn.edu.sysu.lilab.mybatis.sqlsession.SqlSession;
import cn.edu.sysu.lilab.mybatis.sqlsession.proxy.MapperProxy;
import cn.edu.sysu.lilab.mybatis.utils.DataSourceUtil;


import java.lang.reflect.Proxy;
import java.sql.Connection;

/**
 * Author: gyao
 * Date: 6/18/19
 * E-mail: yaoguocai_cool@163.com
 * SqlSession接口的实现类
 **/
public class DefaultSqlSession implements SqlSession {

    private Configuration cfg;
    private Connection connection;

    public DefaultSqlSession(Configuration cfg){
        this.cfg=cfg;
        connection= DataSourceUtil.getConnection(cfg);
    }
    /**
     * 用于创建代理对象
     * @param daoInterfaceClass dao的接口字节码
     * @param <T>
     * @return
     */
    public <T> T getMapper(Class<T> daoInterfaceClass) {
        return (T) Proxy.newProxyInstance(daoInterfaceClass.getClassLoader(),
                new Class[]{daoInterfaceClass},new MapperProxy(cfg.getMappers(), connection));
    }

    /**
     * 用于释放资源
     */
    public void close() {
        if(connection != null) {
            try {
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
