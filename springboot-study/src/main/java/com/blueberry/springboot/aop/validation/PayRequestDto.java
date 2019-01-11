package com.blueberry.springboot.aop.validation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PayRequestDto {
     
    /**
     * 支付完成时间
     **/
    @NotEmpty(message="支付完成时间不能空")
    @Size(max=14,message="支付完成时间长度不能超过{max}位")
    private String payTime;
     
    /**
     * 状态
     **/
    @Pattern(regexp = "0[0123]", message = "状态只能为00或01或02或03")
    private String status;
 

}
