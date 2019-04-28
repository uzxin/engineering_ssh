<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-cn"><head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="renderer" content="webkit">
    <title>课程过程化考核管理系统</title>  
    <link rel="stylesheet" href="admin/pintuer.css">
    <link rel="stylesheet" href="admin/admin.css">
    <script src="admin/jquery.js"></script>   
</head>
<body style="background-color:#f2f9fd;">
<div class="header bg-main">
  <div class="logo margin-big-left fadein-top">
    <h1 style="color: black"><img src="admin/logo.png" class="radius-circle rotate-hover" alt="" height="50">课程过程化考核管理系统</h1>
  </div>
  <div class="head-l"><a class="button button-little bg-green" href="#">个人信息</a>  &nbsp;&nbsp;
  	<a class="button button-little bg-red" href="#">
  		<span class="icon-power-off"></span> 退出登录</a> </div>
</div>
<div class="leftnav">
  <div class="leftnav-title" style="color: black"><strong><span class="icon-list"></span>菜单列表</strong></div>
    <h2 class=""><span class="icon-user"></span>基本设置</h2>
  		<ul style="display: none;">
    		<li><a href="javascript:void(0);" target="right"><span class="icon-caret-right"></span>修改密码</a></li>    
    		<li><a href="javascript:void(0);" target="right"><span class="icon-caret-right"></span>个人资料</a></li>
 		</ul>
    <h2 class=""><span class="icon-pencil-square-o"></span>课程管理</h2>
    	<ul>
    		<li><a href="javascript:void(0);" target="right"><span class="icon-caret-right"></span>开发中</a></li> 
    	</ul>
    <h2 class=""><span class="icon-pencil-square-o"></span>教师管理</h2>
 		<ul style="display: none;">
    		<li><a href="javascript:void(0);" target="right"><span class="icon-caret-right"></span>开发中</a></li> 
  		</ul>  
  	<h2 class=""><span class="icon-pencil-square-o"></span>学生管理</h2>
    	<ul style="display: none;">
    		<li><a href="javascript:void(0);" target="right"><span class="icon-caret-right"></span>开发中</a></li>  
     	</ul>
  	<h2 class=""><span class="icon-pencil-square-o"></span>系统维护</h2>
    	<ul style="display: none;">
     		<li><a href="javascript:void(0);" target="right"><span class="icon-caret-right"></span>开发中</a></li>   
    	</ul>  
</div>
<script type="text/javascript">
$(function(){
  $(".leftnav h2").click(function(){
	  $(this).next().slideToggle(200);	
	  $(this).toggleClass("on"); 
  })
  $(".leftnav ul li a").click(function(){
	    $("#a_leader_txt").text($(this).text());
  		$(".leftnav ul li a").removeClass("on");
		$(this).addClass("on");
  })
  
    $(".icon-home").click(function(){
	    $("#a_leader_txt").text("所有公告");
  		$(".leftnav ul li a").removeClass("on");
		$(this).addClass("on");
  })
  
});


</script>
<ul class="bread">
  <li><a href="javascript:void(0);" target="right" class="icon-home"> 首页</a></li>
  <li><a href="##" id="a_leader_txt">公告信息</a></li>
</ul>
<div class="admin">
  <iframe scrolling="auto" rameborder="0" src="admin/info.html" name="right" width="100%" height="100%"></iframe>
</div>
<div style="text-align:center;">
</div>

</body></html>