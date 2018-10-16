package com.jsj.member.ob.dao;

import com.jsj.member.ob.entity.CartProduct;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.springframework.stereotype.Repository;
import com.baomidou.mybatisplus.plugins.Page;

import java.util.List;

/**
 *   @description : CartProduct Mapper 接口
 *   ---------------------------------
 * 	 @author cc
 *   @since 2018-10-16
 */
@Repository
public interface CartProductMapper extends BaseMapper<CartProduct> {

}