package net.zhaoqing.shopmall.controller;


import com.alibaba.fastjson.JSONObject;
import net.zhaoqing.shopmall.dao.elasticsearch.EmployeeRepository;
import net.zhaoqing.shopmall.dao.elasticsearch.GoodsESRepository;
import net.zhaoqing.shopmall.pojo.Employee;
//import net.zhaoqing.shopmall.service.ElasticsearchService;
import net.zhaoqing.shopmall.pojo.GoodsESEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author linzhiqiang
 */
@RestController
@RequestMapping("/es")
public class ElasticsearchController {

    @Autowired
    private EmployeeRepository employeeRepository;

    private Long id=5l;

    @Autowired
    private GoodsESRepository goodsESRepository;

//    @Autowired
//    private ElasticsearchService esService;

    /**
     * 添加
     * @return
     */
    @RequestMapping("add")
    public String add() throws Exception {
        Employee employee = new Employee();
        employee.setId((id++).toString());
        employee.setFirstName("xuxu");
        employee.setLastName("zh");
        employee.setAge(26);
        employee.setAbout("i am in peking");
        employeeRepository.save(employee);
        //esService.add(employee,false);
        System.err.println("add a obj");
        return "success";
    }

    @RequestMapping("add2")
    public String add2() throws Exception {
        GoodsESEntity goodsESEntity1 = new GoodsESEntity(id++, "尾灯 L 大众速腾bb", "国际品牌", "16D 945 095", "31231231", "16D 945 095",
                "尾灯 L 大众速腾 国际品牌 16D 945 095 31231231 16D 945 095");
         goodsESRepository.save(goodsESEntity1);
        //esService.add(employee,false);
        System.err.println("add a obj");
        return "success";
    }

    @RequestMapping("getList")
    public String getList(){
        /*List<Employee> list= esService.getList(null);
        String s= JSONObject.toJSONString(list);
        System.out.println(s);*/
        return "ok";
    }

}