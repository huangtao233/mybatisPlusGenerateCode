package com.warrior.serviceImpl;

import com.warrior.entity.Dictionary;
import com.warrior.mapper.DictionaryMapper;
import com.warrior.service.IDictionaryService;
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
public class DictionaryServiceImpl extends ServiceImpl<DictionaryMapper, Dictionary> implements IDictionaryService {
	
}
