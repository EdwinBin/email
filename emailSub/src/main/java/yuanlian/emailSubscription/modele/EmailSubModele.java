package yuanlian.emailSubscription.modele;

import java.util.Date;

public class EmailSubModele {

	
	public Integer id; //邮箱Id
	
	public String userEmail; //邮箱
	
	public String userName; //用户姓名
	
	public Integer userAge; //用户年龄
	
	public String userSex; //用户性别
	
	public String userNationality; //用户国籍
	
	public Date addTime;//订阅时间
	
	

	public EmailSubModele() {
		super();
		// TODO Auto-generated constructor stub
	}



	public EmailSubModele(Integer id, String userEmail, String userName, Integer userAge, String userSex,
			String userNationality, Date addTime) {
		super();
		this.id = id;
		this.userEmail = userEmail;
		this.userName = userName;
		this.userAge = userAge;
		this.userSex = userSex;
		this.userNationality = userNationality;
		this.addTime = addTime;
	}




	public String getUserEmail() {
		return userEmail;
	}



	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public Integer getUserAge() {
		return userAge;
	}



	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}



	public String getUserSex() {
		return userSex;
	}



	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}



	public String getUserNationality() {
		return userNationality;
	}



	public void setUserNationality(String userNationality) {
		this.userNationality = userNationality;
	}


	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Date getAddTime() {
		return addTime;
	}



	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}



	@Override
	public String toString() {
		return "EmailSubModele [userId=" + id + ", userEmail=" + userEmail + ", userName=" + userName + ", userAge="
				+ userAge + ", userSex=" + userSex + ", userNationality=" + userNationality + ", userTime=" + addTime
				+ "]";
	}


}
