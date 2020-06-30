package net.zhaoqing.shopmall.dao.elasticsearch;

import net.zhaoqing.shopmall.pojo.GoodsESEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;


/**
 * @author zhangboqing
 * @date 2019-12-06
 */
public interface GoodsESRepository extends ElasticsearchRepository<GoodsESEntity, Long> {

    /**
     * 根据goodsId区间查询
     */
    List<GoodsESEntity> findByGoodsIdBetween(Integer min, Integer max);

}
