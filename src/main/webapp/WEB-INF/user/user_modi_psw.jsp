<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title></title>
        <link type="text/css" rel="stylesheet" media="all" href="../css/global.css" />
        <link type="text/css" rel="stylesheet" media="all" href="../css/global_color.css" /> 
        <script src="../js/jquery-3.3.1.js" type="text/javascript"></script>
        <script type="text/javascript">
        function showResult() {
            showResultDiv(true);
            window.setTimeout("showResultDiv(false);", 3000);
        }
         function showResultDiv(flag) {
            var divResult = document.getElementById("save_result_info");
            if (flag)
                divResult.style.display = "block";
            else
                divResult.style.display = "none";
        }
   
        function f1(){
  		     $.ajax({
  		         url:"../updateUPsw",
  		         type:"post",
  		         data:{
  		        	psw:$("#psw").val(),
  		        	upsw:$("#upsw").val(),
  		        	upsw2:$("#upsw2").val(),
  		        },
  		         success:function (result) {
  		        		$("#msg").html(result);	     		   	
  		         }
  		 	})
  		} 
         </script>
         <style type="text/css">
         	#msg_1{
         		color:red;
         	}
         	#msg_2{
         		color:red;
         	}
         </style>
    </head>
    <body>
        <!--Logo区域开始-->
        <div id="header">
            <img src="../images/logo.png" alt="logo" class="left"/>
            <a href="#">[退出]</a>            
        </div>
        <!--Logo区域结束-->
        <!--导航区域开始-->
        <div id="navi">
            <jsp:include page="../index_navi.jsp" flush="true"></jsp:include>
        </div>
        <!--导航区域结束-->
        <div id="main">      
            <!--保存操作后的提示信息：成功或者失败-->      
            <div id="save_result_info" class="save_success"><span id="msg"></span></div><!--保存失败，旧密码错误！-->
            <form action="" method="" class="main_form">
                <div class="text_info clearfix"><span>旧密码：</span></div>
                <div class="input_info">
                    <input type="password" class="width200"  id="psw"/><span class="required" id="msg_1"></span>
                    <div class="validate_msg_medium"></div>
                </div>
                <div class="text_info clearfix"><span>新密码：</span></div>
                <div class="input_info">
                    <input type="password"  class="width200" id="upsw"/><span class="required"></span>
                    <div class="validate_msg_medium"></div>
                </div>
                <div class="text_info clearfix"><span>重复新密码：</span></div>
                <div class="input_info">
                    <input type="password" class="width200"  id="upsw2"/><span class="required" id="msg_2"></span>
                    <div class="validate_msg_medium"></div>
                </div>
                <div class="button_info clearfix">
                    <input type="button" value="保存" class="btn_save" onclick="showResult();f1()" />
                    <input type="button" value="取消" class="btn_save" />
                </div>
            </form>  
        </div>
        <!--主要区域结束-->
        <div id="footer">
           
        </div>
    </body>
</html>
