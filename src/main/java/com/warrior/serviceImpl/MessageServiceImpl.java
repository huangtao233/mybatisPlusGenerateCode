package com.warrior.serviceImpl;

import com.warrior.entity.Message;
import com.warrior.mapper.MessageMapper;
import com.warrior.service.IMessageService;
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
public class MessageServiceImpl extends ServiceImpl<MessageMapper, Message> implements IMessageService {
	
}
