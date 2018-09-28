<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link type="text/css" rel="stylesheet" media="all" href="css/global.css" />
<link type="text/css" rel="stylesheet" media="all" href="css/global_color.css" /> 
<title>Insert title here</title>
</head>
<body>
	<!-- <ul id="menu">
                <li><a href="index.jsp" class="index_on"></a></li>
                <li><a href="role/role_list.html" class="role_off"></a></li>
                <li><a href="admin/admin_list.html" class="admin_off"></a></li>
                <li><a href="fee/fee_list.html" class="fee_off"></a></li>
                <li><a href="account/account_list.html" class="account_off"></a></li>
                <li><a href="service/service_list.html" class="service_off"></a></li>
                <li><a href="bill/bill_list.html" class="bill_off"></a></li>
                <li><a href="report/report_list.html" class="report_off"></a></li>
                <li><a href="user/user_info.html" class="information_off"></a></li>
                <li><a href="user/user_modi_pwd.html" class="password_off"></a></li>
            </ul> -->
            <ul id="menu">
            	<%-- ${ls}
            	${ls[0].powers}
            	${ls[0].user_name}
            	 --%>
                <li><a href="index.jsp" class="index_on"></a></li>
                <c:if test = "${fn:contains(ls[0].powers,1)}">
                	<li><a href="selectURole" class="role_off"></a></li>
                </c:if>
                <c:if test = "${fn:contains(ls[0].powers,2)}">
                	<li><a href="${pageContext.request.contextPath}admin/admin_list.jsp" class="admin_off"></a></li>
                </c:if>
                <c:if test = "${fn:contains(ls[0].powers,3)}">
                <li><a href="fee/fee_list.jsp" class="fee_off"></a></li>
                </c:if>
                <c:if test = "${fn:contains(ls[0].powers,4)}">
                <li><a href="account/account_list.jsp" class="account_off"></a></li>
                </c:if>
                <c:if test = "${fn:contains(ls[0].powers,5)}">
                <li><a href="service/service_list.jsp" class="service_off"></a></li>
                </c:if>
                <c:if test = "${fn:contains(ls[0].powers,6)}">
                <li><a href="bill/bill_list.jsp" class="bill_off"></a></li>
                </c:if>
                <c:if test = "${fn:contains(ls[0].powers,7)}">
                <li><a href="${pageContext.request.contextPath}report/report_list.jsp" class="report_off"></a></li>
                </c:if>
                <li><a href="user_infoFrom" class="information_off"></a></li>
                <li><a href="user/user_modi_psw.jsp" class="password_off"></a></li>
            </ul>
           
</body>
</html>