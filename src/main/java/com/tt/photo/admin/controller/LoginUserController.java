package com.tt.photo.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tt.photo.admin.pojo.LoginParameter;
import com.tt.photo.prompt.ResponseJson;

@Controller
@RequestMapping("/photo")
public class LoginUserController {
	
	
	/**
	 * 登录
	 * @return
	 */
	@PostMapping("/login")
	@ResponseBody
	public ResponseJson logUser(LoginParameter loginParameter) {
		System.out.println(loginParameter.getUser()+loginParameter.getSafety()+loginParameter.getPassword());
		return new ResponseJson();
	}

}
