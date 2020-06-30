package net.zhaoqing.shopmall.pojo;

import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2020-06-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TUser implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String name;

    private Integer age;

    private Date createtime;


}
