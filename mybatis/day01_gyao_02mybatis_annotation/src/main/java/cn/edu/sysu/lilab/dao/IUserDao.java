package cn.edu.sysu.lilab.dao;

import java.util.List;
import cn.edu.sysu.lilab.domain.User;
import org.apache.ibatis.annotations.Select;

/**
 * Author: gyao
 * Date: 6/15/19
 * E-mail: yaoguocai_cool@163.com
 * 用户的持久层接口,用户通过这个持久层接口实现对数据库实体类的操作
 **/
public interface IUserDao {
    /**
     * 查询所有操作
     * @return
     */
//    应用select注解取代映射配置文件IUserDao.xml
    @Select("select * from user")
    List<User> findAll();
}
