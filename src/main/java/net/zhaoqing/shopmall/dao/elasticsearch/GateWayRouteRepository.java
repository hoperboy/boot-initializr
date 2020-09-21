package net.zhaoqing.shopmall.dao.elasticsearch;

import net.zhaoqing.shopmall.pojo.Employee;
import net.zhaoqing.shopmall.pojo.GateWayRoute;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

@Component
public interface GateWayRouteRepository  extends ElasticsearchRepository<GateWayRoute,String> {

    Page<GateWayRoute> findByUrlLike(String url, Pageable pageable);

}
