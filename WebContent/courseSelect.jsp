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
			function addTCourseSelect(){
				window.location.href = "${pageContext.request.contextPath}/courseSelectAction_getTeacherAndCourse";
			}
			function addSCourseSelect(){
				window.location.href = "${pageContext.request.contextPath}/courseSelectAction_getStudentAndCourse";
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
		<c:if test="${not empty teacherList }">
			教师名字：<input type="text" name="pname" value="${condition.pname }">&nbsp;&nbsp;
		</c:if>
		<c:if test="${not empty studentList }">
			学生名字：<input type="text" name="pname" value="${condition.pname }">&nbsp;&nbsp;
		</c:if>
		课程名字：<input type="text" name="pname" value="${condition.pname }">&nbsp;&nbsp;
		<input type="submit" value="搜索">
		<br/>
	
		<table style="margin-top:10px" cellSpacing="1" cellPadding="0" width="100%" align="center"
			bgColor="#f5fafe" border="0">
			<TBODY>
				<tr>
					<c:if test="${not empty teacherList }">
						<td class="ta_01" align="center" bgColor="#afd1f3"><strong>教师选课列表</strong></td>
					</c:if>
					<c:if test="${not empty studentList }">
						<td class="ta_01" align="center" bgColor="#afd1f3"><strong>学生选课列表</strong></td>
					</c:if>
				</tr>
				<tr>
					<td class="ta_01" align="right">
						<c:if test="${not empty teacherList }">
							<button type="button" id="add" name="add" value="添加" class="button_add" onclick="addTCourseSelect()"> 添加教师选课</button>
						</c:if>
						<c:if test="${not empty studentList }">
							<button type="button" id="add" name="add" value="添加" class="button_add" onclick="addSCourseSelect()"> 添加学生选课</button>
						</c:if>
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
								<c:if test="${not empty teacherList }">
									<td align="center" width="6%">教师名字</td>
								</c:if>
								<c:if test="${not empty studentList }">
									<td align="center" width="6%">学生名字</td>
								</c:if>
								<td align="center" width="8%">课程名字</td>
								<td width="2%" align="center">删除</td>
							</tr>
							
							<c:forEach items="${csList }" var="list" varStatus="vs">
							
								<tr onmouseover="this.style.backgroundColor = 'white'"
									onmouseout="this.style.backgroundColor = '#F5FAFE';">
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="3%">${vs.count }</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="6%">${list.realname }</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="8%">${list.cname }</td>	
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

