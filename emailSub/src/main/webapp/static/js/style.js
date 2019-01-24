$(document).ready(function() {	
var cookie = window.localStorage.getItem("country");
			$("#serve").click(function(){
				cookie = window.localStorage.getItem("country");
				if(cookie == "english" || cookie == null){
					$(".langEnglish").show()
				}else{
					$(".langChina").show()
				}
			})
})
			function closeCont(data){
				$("."+data).hide()
			}