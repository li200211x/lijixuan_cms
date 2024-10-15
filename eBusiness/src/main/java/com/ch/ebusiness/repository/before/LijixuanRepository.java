package com.ch.ebusiness.repository.before;

import com.ch.ebusiness.entity.BUser;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface LijixuanRepository {
	public List<Map<String, Object>> MAPS(Integer id);
}
	
