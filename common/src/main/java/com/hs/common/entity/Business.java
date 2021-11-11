package com.hs.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Business {
    private Integer id;
    private String name;
    private String summary;
    private BigDecimal price;
    private Integer postPersonId;

    private LocalDateTime createTime;
}
