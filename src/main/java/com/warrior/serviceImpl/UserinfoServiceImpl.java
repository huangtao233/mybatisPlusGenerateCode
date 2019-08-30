package com.warrior.serviceImpl;

import com.warrior.entity.Userinfo;
import com.warrior.mapper.UserinfoMapper;
import com.warrior.service.IUserinfoService;
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
public class UserinfoServiceImpl extends ServiceImpl<UserinfoMapper, Userinfo> implements IUserinfoService {
	
}
