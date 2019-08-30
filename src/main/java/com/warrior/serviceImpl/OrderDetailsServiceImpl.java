package com.warrior.serviceImpl;

import com.warrior.entity.OrderDetails;
import com.warrior.mapper.OrderDetailsMapper;
import com.warrior.service.IOrderDetailsService;
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
public class OrderDetailsServiceImpl extends ServiceImpl<OrderDetailsMapper, OrderDetails> implements IOrderDetailsService {
	
}
