package net.zhaoqing.shopmall.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@TableName("hotnews")
public class HotNews {

    @TableId(type = IdType.ID_WORKER)
    private Long id;

    private String name;
}
