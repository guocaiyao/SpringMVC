package cn.edu.sysu.lilab.mybatis.sqlsession;

/**
 * Author: gyao
 * Date: 6/18/19
 * E-mail: yaoguocai_cool@163.com
 **/
public interface SqlSessionFactory {
    /**
     * 用于打开一个新的SqlSession对象
     * @return
     */
    SqlSession openSession();
}
