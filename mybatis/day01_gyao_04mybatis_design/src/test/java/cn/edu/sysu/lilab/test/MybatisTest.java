package cn.edu.sysu.lilab.test;

import cn.edu.sysu.lilab.dao.IUserDao;
import cn.edu.sysu.lilab.domain.User;
import cn.edu.sysu.lilab.mybatis.io.Resources;
import cn.edu.sysu.lilab.mybatis.sqlsession.SqlSession;
import cn.edu.sysu.lilab.mybatis.sqlsession.SqlSessionFactory;
import cn.edu.sysu.lilab.mybatis.sqlsession.SqlSessionFactoryBuilder;


import java.io.InputStream;
import java.util.List;

/**
 * Author: gyao
 * Date: 6/15/19
 * E-mail: yaoguocai_cool@163.com
 * mybatis的入门案例测试
 **/
public class MybatisTest {
    /**
     * 入门案例
     * @param args
     */

    public static void main(String[] args) throws Exception {
        //1.读取配置文件
        InputStream in= Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        SqlSessionFactory factory=builder.build(in);
        //3.使用工厂生产SqlSession对象
        SqlSession session=factory.openSession();
        //4.使用SqlSession创建Dao接口的代理对象
        IUserDao userDao=session.getMapper(IUserDao.class);
        //5.使用代理对象执行方法
        List<User> users=userDao.findAll();
        for (User user:users){
            System.out.println(user);
        }
        //6.释放资源
        session.close();
        in.close();
    }
}
