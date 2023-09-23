package com.yeqifu.sys.vo;

import com.yeqifu.sys.entity.Permission;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by XinChen
 * @Date: 2019/11/22 15:30
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PermissionVo extends Permission {

    private Integer page=1;
    private Integer limit=10;
}
