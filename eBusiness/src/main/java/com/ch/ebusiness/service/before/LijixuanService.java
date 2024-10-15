package com.ch.ebusiness.service.before;

import com.ch.ebusiness.entity.BUser;
import org.springframework.ui.Model;

import javax.servlet.http.HttpSession;

public interface LijixuanService {
	public String isUse(BUser bUser);
	public String register(BUser bUser);
	public String myData( Model model, HttpSession session);
}
