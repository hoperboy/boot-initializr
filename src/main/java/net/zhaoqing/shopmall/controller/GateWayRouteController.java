package net.zhaoqing.shopmall.controller;


import net.zhaoqing.shopmall.dao.elasticsearch.GateWayRouteRepository;
import net.zhaoqing.shopmall.pojo.GateWayRoute;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gate")
public class GateWayRouteController {

    @Autowired
    private GateWayRouteRepository gateWayRouteRepository;

    Page<GateWayRoute> page;

    List<GateWayRoute> routeList;

    @GetMapping("getList")
    public String getList(){
        Pageable pageable = PageRequest.of(0, 100);;
        //Page<GateWayRoute> page= gateWayRouteRepository.findByUrlLike("trace", pageable);
        //List<GateWayRoute> routeList= page.getContent();

//        BoolQueryBuilder qb = QueryBuilders.boolQuery();
//        qb.must(QueryBuilders.matchQuery("url", "trace"));
//        Iterable<GateWayRoute> iterable = gateWayRouteRepository.search(qb);
//        for (GateWayRoute route: iterable){
//            route = route;
//        }

        NativeSearchQueryBuilder builder=new NativeSearchQueryBuilder();
        builder.withQuery(QueryBuilders.fuzzyQuery("url","trace"));
        // 查找
        Page<GateWayRoute> page = gateWayRouteRepository.search(builder.build());
        routeList = page.getContent();

        return "ok";
    }

}
