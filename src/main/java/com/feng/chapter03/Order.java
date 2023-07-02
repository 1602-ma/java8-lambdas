package com.feng.chapter03;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author f
 * @date 2023/7/2 12:57
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    private Integer orderId;
    private String orderName;
}
