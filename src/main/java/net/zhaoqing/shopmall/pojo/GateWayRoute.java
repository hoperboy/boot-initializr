package net.zhaoqing.shopmall.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.zhaoqing.shopmall.config.EsConsts;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "gatewayroutestatistics", type = EsConsts.DEFAULT_TYPE_NAME, shards = 1, replicas = 0)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GateWayRoute {

    @Id
    private String id;

    private Long visitDate;

    //@Field(type = FieldType.Keyword)
    private String url;
}
