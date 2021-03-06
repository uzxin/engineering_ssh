<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<HTML>
<HEAD>
<meta http-equiv="Content-Language" content="zh-cn">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${pageContext.request.contextPath}/css/Style1.css"
	rel="stylesheet" type="text/css" />
<script language="javascript"
	src="${pageContext.request.contextPath}/js/public.js"></script>
<script language="javascript" src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>
<script type="text/javascript">
			function addCourse(){
				window.location.href = "${pageContext.request.contextPath}/addTeacher.jsp";
			}
			
			function delTeacher(tid){
				var isDel = confirm("您确认要删除吗？");
				if(isDel){
					//要删除
					location.href = "${pageContext.request.contextPath}/teacherAction_del?tid="+tid;
				}
			}
		</script>
</HEAD>
<body>
	<br>
	<form id="Form1" name="Form1" action="${pageContext.request.contextPath}/adminSearchProductList" method="post">
		
		教师名字：<input type="text" name="pname" value="${condition.pname }">&nbsp;&nbsp;
		<input type="submit" value="搜索">
		<br/>
	
		<table style="margin-top:10px" cellSpacing="1" cellPadding="0" width="100%" align="center"
			bgColor="#f5fafe" border="0">
			<TBODY>
				<tr>
					<td class="ta_01" align="center" bgColor="#afd1f3"><strong>教师列表</strong>
					</TD>
				</tr>
				<tr>
					<td class="ta_01" align="right">
						<button type="button" id="add" name="add" value="添加"
							class="button_add" onclick="addCourse()"> 添加教师</button>

					</td>
				</tr>
				<tr>
					<td class="ta_01" align="center" bgColor="#f5fafe">
						<table cellspacing="0" cellpadding="1" rules="all"
							bordercolor="gray" border="1" id="DataGrid1"
							style="BORDER-RIGHT: gray 1px solid; BORDER-TOP: gray 1px solid; BORDER-LEFT: gray 1px solid; WIDTH: 100%; WORD-BREAK: break-all; BORDER-BOTTOM: gray 1px solid; BORDER-COLLAPSE: collapse; BACKGROUND-COLOR: #f5fafe; WORD-WRAP: break-word">
							<tr
								style="FONT-WEIGHT: bold; FONT-SIZE: 12pt; HEIGHT: 25px; BACKGROUND-COLOR: #afd1f3">

								<td align="center" width="3%">序号</td>
								<td align="center" width="6%">教师名字</td>
								<td align="center" width="8%">邮箱</td>
								<td align="center" width="5%">登陆账号</td>
								<td align="center" width="5%">密码</td>
								<td align="center" width="17%">教师介绍</td>
								<td width="2%" align="center">编辑</td>
								<td width="2%" align="center">删除</td>
							</tr>
							
							<c:forEach items="${teacherList }" var="teacher" varStatus="vs">
							
								<tr onmouseover="this.style.backgroundColor = 'white'"
									onmouseout="this.style.backgroundColor = '#F5FAFE';">
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="3%">${vs.count }</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="6%">${teacher.realname }</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="8%">${teacher.email }</td>	
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="5%">${teacher.username }</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="5%">${teacher.password }</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="17%">${teacher.intro }</td>
									<td align="center" style="HEIGHT: 2px"><a
										href="${ pageContext.request.contextPath }/teacherAction_edit?tid=${teacher.tid}">
											<img
											src="${pageContext.request.contextPath}/images/i_edit.gif"
											border="0" style="CURSOR: hand">
									</a></td>
	
									<td align="center" style="HEIGHT: 2px">
										<a href="javascript:void(0);" onclick="delTeacher('${teacher.tid}')"> 
											<img src="${pageContext.request.contextPath}/images/i_del.gif"
											width="16" height="16" border="0" style="CURSOR: hand">
										</a>
									</td>
								</tr>
							
							</c:forEach>
							
							
						</table>
					</td>
				</tr>

			</TBODY>
		</table>
	</form>
</body>
</HTML>

