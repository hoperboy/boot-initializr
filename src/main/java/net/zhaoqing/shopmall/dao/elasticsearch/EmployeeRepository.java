package net.zhaoqing.shopmall.dao.elasticsearch;



import net.zhaoqing.shopmall.pojo.Employee;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;
/**
 * @author linzhiqiang
 */
@Component
public interface EmployeeRepository extends ElasticsearchRepository<Employee,String>{

    /**
     * 查询雇员信息
     * @param id
     * @return
     */
    Employee queryEmployeeById(String id);
}