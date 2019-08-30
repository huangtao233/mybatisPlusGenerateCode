package com.warrior.serviceImpl;

import com.warrior.entity.Shoes;
import com.warrior.mapper.ShoesMapper;
import com.warrior.service.IShoesService;
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
public class ShoesServiceImpl extends ServiceImpl<ShoesMapper, Shoes> implements IShoesService {
	
}
