package yuanlian.emailSubscription.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import yuanlian.emailSubscription.service.EmailSubService;


@Controller
@RequestMapping("/email")
public class EmailSubController {
	@Resource
	private EmailSubService emailSubService;

	public static final String SUCCES = "success";  //订阅成功
	public static final String EXIST = "exist";  //邮箱已存在
	/**
	 * 查询该邮箱是否已经订阅，不存在则添加
	 * @param request
	 * @return
	 */
	@RequestMapping("/getEmail")
	@ResponseBody
	public String geta(HttpServletRequest req){
		boolean ruselt = emailSubService.getEmail(req.getParameter("email"));
		if(ruselt == true){
			return SUCCES;
		}
		return EXIST;
	}
	
	/**
	 * 返回关于我们
	 * @param request
	 * @return
	 */
	@RequestMapping("/getAboutUs")
	public String getAboutUs(HttpServletRequest req){
		return "about_us.html";
	}
	/**
	 * 返回首页
	 * @param request
	 * @return
	 */
	@RequestMapping("/getHomePage")
	public String getHomePage(HttpServletRequest req){
		return "index.html";
	}
}
