package net.zhaoqing.shopmall.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class PageResult<T> {
    private long total;

    private T list;

}
