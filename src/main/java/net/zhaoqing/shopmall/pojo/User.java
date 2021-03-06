package net.zhaoqing.shopmall.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class User {

    @TableId(type = IdType.ID_WORKER)

    private String id;
    private String name;
    private Integer age;

}