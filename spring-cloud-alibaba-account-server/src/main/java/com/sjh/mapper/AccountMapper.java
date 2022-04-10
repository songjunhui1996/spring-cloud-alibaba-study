package com.sjh.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author 宋俊辉
 * @date 2022/4/10 0010
 */
@Mapper
public interface AccountMapper {

    /**
     * 账户扣款
     *
     * @param id
     * @param money
     * @return
     */
    int takeOffBalance(@Param("id") int id, @Param("money") Long money);

}
