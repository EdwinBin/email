package yuanlian.emailSubscription.service;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import yuanlian.emailSubscription.dao.EmailSubDao;
import yuanlian.emailSubscription.modele.EmailSubModele;

@Service("emailSubService")
public class EmailSubServiceImp implements EmailSubService{

	@Resource
	private EmailSubDao emailSubDao;

	/**
	 * 查询该邮箱是否已经订阅,不存在则添加
	 */
	public boolean getEmail(String email) {
		EmailSubModele emailSubModele = emailSubDao.getEmail(email);
		if (emailSubModele == null) {
			 //添加订阅邮箱
			emailSubModele = new EmailSubModele();
	        emailSubModele.setUserEmail(email);
	        emailSubModele.setAddTime(new Date());
			emailSubDao.addEmail(emailSubModele);
			return true;
			}
		else{
			return false;
		}
		
	}


	
}
