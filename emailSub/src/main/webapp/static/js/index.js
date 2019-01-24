function sub(){
			var email = $.trim($('#email').val());
			var pattern = /^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\.[a-zA-Z0-9_-]+)+$/;
			//var cookie = document.cookie.split("=")[1];
			var cookie = window.localStorage.getItem("country");
			console.log(cookie);
			if(email != ""){
				if(pattern.test(email)){
					$.ajax({
						url: 'email/getEmail',
						type: 'post',
						data: {'email':email},
						success:function(result){
							if(result == "success"){
								if(cookie == "chinese"){
									$("#successCont").html("你已成功加入白名单!");
								}else{
									$("#successCont").html("You have successfully joined the whitelist!");
								}
								$(".successPage").show();
								setTimeout(function(){
									$(".successPage").hide()
								},2500)
							}else if(result == "exist"){
								$(".successPage").show();
								if(cookie == "chinese"){
									$("#successCont").html("此邮箱已订阅!");
								}else{
									$("#successCont").html("This mailbox has been subscribed!");
								}
								setTimeout(function(){
									$(".successPage").hide()
								},2500)
							}	
						},
						error:function()
						{
							$(".successPage").show();
							if(cookie == "chinese"){
								$("#successCont").html("系统繁忙，请稍后再试!");
							}else{
								$("#successCont").html("The system is busy, please try again later!");
							}
							setTimeout(function(){
								$(".successPage").hide()
							},2500)
						}
					});
				}else{
					$(".successPage").show();
					if(cookie == "chinese"){
						$("#successCont").html("邮箱格式错误，请重新输入!");
					}else{
						$("#successCont").html("Incorrect email format,Please enter the email address!");
					}
					
					setTimeout(function(){
						$(".successPage").hide()
					},2500)
				}
			}else{
				$(".successPage").show();
				if(cookie == "chinese"){
					$("#successCont").html("请添加邮箱地址!");
				}else{
					$("#successCont").html("Please enter email address!");
				}
				setTimeout(function(){
					$(".successPage").hide()
				},2500)
			}
		
}
$("#closePage").on("click",function(){
	$(".successPage").hide()
})

























