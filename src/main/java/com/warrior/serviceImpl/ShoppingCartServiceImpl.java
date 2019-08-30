package com.warrior.serviceImpl;

import com.warrior.entity.ShoppingCart;
import com.warrior.mapper.ShoppingCartMapper;
import com.warrior.service.IShoppingCartService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author huangtao
 * @since 2019-08-30
 */
@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements IShoppingCartService {
	
}
