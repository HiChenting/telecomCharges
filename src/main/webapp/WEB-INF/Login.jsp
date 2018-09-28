<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title></title>
        <link type="text/css" rel="stylesheet" media="all" href="css/global.css" />
        <link type="text/css" rel="stylesheet" media="all" href="css/global_color.css" />
        <style>
        	#bLogin{
        		background-image: url("images/login_btn.png");
        		width: 125px;
        		height: 40px;
        		border: none;
        		border-radius: 10px;
        	}
        </style> 
        <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
        <!-- <script src="js/jquery-3.3.1.js" type="text/javascript"></script> -->
        <script type="text/javascript">
        
        	function textFocus(el) {
    	    if (el.defaultValue == el.value) { 
    	    		el.value = ''; el.style.color = '#333'; 
    	    	}
    	    }
    	    
    		function textBlur(el) {
    			var name=document.getElementById("uname").value;
    			var psw=document.getElementById("upsw").value;
    			var yz=document.getElementById("yz").value;
    	    	if (el.value == '') { 
    	    		el.value = el.defaultValue; el.style.color = '#999';
    	    	}
    	    	if(name.trim().length==0||name==null){
    				document.getElementById("errmsg_1").innerText="*请输入用户名";	
    			}else{
    				document.getElementById("errmsg_1").innerText=" ";	
    			}
    	    	if(psw.trim().length==0||psw==null){
    				document.getElementById("errmsg_2").innerText="*请输入密码";	
    			}else{
    				document.getElementById("errmsg_2").innerText=" ";
    			}
    	    	if(yz=="8251"){
    	    		document.getElementById("errmsg_3").innerText=" ";
    			}else{
    				document.getElementById("errmsg_3").innerText="*验证码错误";	
    			}
    		}
    		function nameCheck(){
    			var name=document.getElementById("uname").value;
    			if(name.trim().length==0){
    				document.getElementById("errmsg_1").innerText="*用户名不能为空";	
    			} 
    			if(name.indexOf(" ") != -1){
    				document.getElementById("errmsg_1").innerText="*用户名不能包含空格";	
    			}
    		}
    		 function f1(){
    		     $.ajax({
    		         url:"indexFrom",
    		         type:"post",
    		         data:{
    		        	 user_account:$("#uname").val(),
    		        	 user_psw:$("#upsw").val(),
    		        },
    		         success:function (result) {
	    		        	if(result=="success"){
	    		        		window.location.href = "afterLogin";
	    		        	}else{
	    		        		$("#errmsg_4").html(result); 
	    		        	}
	    		        	
    		         }
    		        
    		 	})
    		}
    		

        </script>
    </head>
    <body class="index">
        <div class="login_box">
            <table>
                <tr>
                    <td class="login_info">账号：</td>
                    <td colspan="2">
                    	<input name="" type="text" class="width150" maxlength="12"
                    	onFocus="textFocus(this)" onBlur="textBlur(this)" onchange="nameCheck()"
                    	id = "uname"/>
                    </td>
                    <td class="login_error_info"><span class="required" id = "errmsg_1"></span></td>
                </tr>
                <tr>
                    <td class="login_info">密码：</td>
                    <td colspan="2">
                    	<input name="" type="password" class="width150"
                    	onFocus="textFocus(this)" onBlur="textBlur(this)"
                    	id = "upsw"/>
                    </td>
                    <td><span class="required" id="errmsg_2"></span></td>
                </tr>
                <tr>
                    <td class="login_info">验证码：</td>
                    <td class="width70">
                    	<input name="" type="text" class="width70" 
                    	id="yz" onFocus="textFocus(this)" onBlur="textBlur(this)"/>
                    </td>
                    <td><img src="images/valicode.jpg" alt="验证码" title="点击更换" /></td>  
                    <td><span class="required" id = "errmsg_3"></span></td>              
                </tr>            
                <tr>
                    <td></td>
                    <td class="login_button" colspan="2">
                        <button id="bLogin" onclick="f1()"></button>
                    </td>    
                    <td><span class="required" id = "errmsg_4" ></span></td>                
                </tr>
            </table>
        </div>
    </body>
</html>
