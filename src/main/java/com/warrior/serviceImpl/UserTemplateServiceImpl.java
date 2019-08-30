package com.warrior.serviceImpl;

import com.warrior.entity.UserTemplate;
import com.warrior.mapper.UserTemplateMapper;
import com.warrior.service.IUserTemplateService;
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
public class UserTemplateServiceImpl extends ServiceImpl<UserTemplateMapper, UserTemplate> implements IUserTemplateService {
	
}
