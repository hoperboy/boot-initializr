package net.zhaoqing.shopmall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import net.zhaoqing.shopmall.common.PageResult;
import net.zhaoqing.shopmall.pojo.TUser;
import net.zhaoqing.shopmall.dao.mybatisplus.TUserMapper;
import net.zhaoqing.shopmall.service.ITUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-06-30
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements ITUserService {

    @Override
    public String crud(String id){
        Serializable key = id;
        TUser user= baseMapper.selectById(key);

        user.setName(user.getName()+"#abc");
        baseMapper.updateById(user);

        baseMapper.deleteById(key);

        return "ok";
    }

    @Override
    public Page<TUser> selectList(long current){
        Page<TUser> iPage=new Page<>(current, 5);
        QueryWrapper<TUser> queryWrapper=new QueryWrapper<>();
        queryWrapper.orderByAsc("name");
        Page<TUser> result = baseMapper.selectPage(iPage, queryWrapper);

        return result;

        /*long total = result.getTotal();
        List<TUser> list= result.getRecords();
        PageResult<List<TUser>> pageResult=new PageResult<>(total, list);
        return pageResult;*/
    }

}
