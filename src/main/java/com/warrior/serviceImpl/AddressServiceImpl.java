package com.warrior.serviceImpl;

import com.warrior.entity.Address;
import com.warrior.mapper.AddressMapper;
import com.warrior.service.IAddressService;
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
public class AddressServiceImpl extends ServiceImpl<AddressMapper, Address> implements IAddressService {
	
}
