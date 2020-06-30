package net.zhaoqing.shopmall.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import net.zhaoqing.shopmall.common.PageResult;
import net.zhaoqing.shopmall.pojo.TUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jobob
 * @since 2020-06-30
 */
public interface ITUserService extends IService<TUser> {

    String crud(String id);

    Page<TUser> selectList(long current);
}
