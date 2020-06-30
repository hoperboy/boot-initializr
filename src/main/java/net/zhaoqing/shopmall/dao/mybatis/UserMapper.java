package net.zhaoqing.shopmall.dao.mybatis;

import net.zhaoqing.shopmall.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    @Insert(" INSERT INTO `user` (id, name, age) values (#{id}, #{name}, #{age})")
    void insert(User user);

}
