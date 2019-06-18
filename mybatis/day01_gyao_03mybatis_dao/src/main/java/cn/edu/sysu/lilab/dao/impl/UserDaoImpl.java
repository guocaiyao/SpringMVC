package cn.edu.sysu.lilab.dao.impl;

import cn.edu.sysu.lilab.dao.IUserDao;
import cn.edu.sysu.lilab.domain.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * Author: gyao
 * Date: 6/16/19
 * E-mail: yaoguocai_cool@163.com
 **/
public class UserDaoImpl implements IUserDao {

    private SqlSessionFactory factory;

    public UserDaoImpl(SqlSessionFactory factory){
        this.factory=factory;
    }

    public List<User> findAll() {
        //1.使用工厂创建SqlSession对象
        SqlSession session=factory.openSession();
        //2.使用session执行查询所有方法
        List<User> users=session.selectList(
                "cn.edu.sysu.lilab.dao.IUserDao.findAll");
        session.close();
        //3.返回查询结果
        return users;
    }
}
