<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta http-equiv="content-type" content="text/html;charset=utf-8">
    <link rel="stylesheet" type="text/css" href="https://www.shenjian.io/assets/plugins/jquery-ui/jquery-ui.min.css" />
<link rel="stylesheet" type="text/css" href="https://www.shenjian.io/assets/plugins/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="https://www.shenjian.io/assets/plugins/select2/css/select2.css" />
<link rel="stylesheet" type="text/css" href="https://www.shenjian.io/assets/plugins/jquery-toast/jquery-toast.css" />
<link rel="stylesheet" type="text/css" href="https://www.shenjian.io/assets/js/components/input-password/input-password.css" />
<link rel="stylesheet" type="text/css" href="https://www.shenjian.io/assets/js/components/input-file/input-file.css?_v=2" />
<link rel="stylesheet" type="text/css" href="https://www.shenjian.io/assets/js/components/input-digit/input-digit.css" />
<link rel="stylesheet" type="text/css" href="https://www.shenjian.io/assets/js/components/icheck/icheck.css?_v=1" />
<link rel="stylesheet" type="text/css" href="https://www.shenjian.io/assets/js/components/stack/stack.css" />
<link rel="stylesheet" type="text/css" href="https://www.shenjian.io/assets/plugins/idea/idea.css" />
<link rel="stylesheet" type="text/css" href="https://www.shenjian.io/assets/plugins/idea/animations.css" />
<link rel="stylesheet" type="text/css" href="https://www.shenjian.io/assets/plugins/idea/skins/light_blue.css" />
<link rel="stylesheet" type="text/css" href="https://www.shenjian.io/assets/css/frontend.css?_v=44" />
<link rel="stylesheet" type="text/css" href="https://www.shenjian.io/assets/css/import/frontend-home.css?_v=81" />
<script type="text/javascript" src="https://www.shenjian.io/assets/plugins/jquery/jquery-3.1.1.min.js"></script>
<script type="text/javascript">
	function forgetPassword(){
		alert("请联系网站管理员！");
		}
</script>
<title>登陆</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="shortcut icon" href="/assets/image/favicon.ico?_v=1" sizes="16x16">
    <script src="/assets/plugins/compat/html5shiv.min.js"></script>
    <script src="/assets/plugins/compat/respond.min.js"></script>
</head>

<body class="page-sign page-sign-in" id="page-sign-in">
<header class="header-sign main-header">
    <div class="container">
            <img src="images/logo.png" />
    </div>
</header>
<div class="page-wrapper">
    <section class="for-login main-container">
        <div class="container">
            <div class="login-wrapper">
                <div class="recommends-bg"></div>
                <div class="login-recommends">
                    <div class="recommends">
                        <a class="recommend" href="#" target="_blank">
                            <div class="title">ResNet模型训练</div>
                            <div class="desc">一键完成人工智能图片分类，开源算法</div>
                            <div class="img"><img src="https://shenjianshou-web.oss-cn-beijing.aliyuncs.com/market/2291517_icon_mark.png" class="img-zoom" alt="" width="220" height="220"></div>
                        </a>
                        <a class="recommend" href="#" target="_blank">
                             <div class="title">ICP域名备案查询</div>
                             <div class="desc">独创的人工智能自动识别验证码备案查询速度更快，费用更低！</div>
                             <div class="img"><img src="https://shenjianshou-web.oss-cn-beijing.aliyuncs.com/market/1790143_icon.png" class="img-zoom" alt="" width="220" height="220"></div>
                        </a>
                        <a class="recommend" href="#" target="_blank">
                        	<div class="title">汽车之家口碑爬虫</div>
                        	<div class="desc">一键采集汽车口碑数据自动解析CSS和字体 完美防屏蔽</div>
                            <div class="img"><img src="https://shenjianshou-web.oss-cn-beijing.aliyuncs.com/market/817981_icon.png" class="img-zoom" alt="" width="220" height="220"></div>
                        </a>
                        <a class="recommend" href="#" target="_blank">
                            <div class="title">全球酒店数据[含经纬度]</div>
                            <div class="desc">海量全球酒店大数据一键获取</div>
                            <div class="img"><img src="https://shenjianshou-web.oss-cn-beijing.aliyuncs.com/market/792267_icon.png" class="img-zoom" alt="" width="220" height="220"></div>
                        </a>
                        <a class="recommend" href="#" target="_blank">
                        	<div class="title">生活服务类查询接口</div>
                        	<div class="desc">天气、快递、驾照、油价、公交等查询生活服务类API接口，重磅上线！</div>
                            <div class="img"><img src="https://shenjianshou-web.oss-cn-beijing.aliyuncs.com/market/938290_icon.png" class="img-zoom" alt="" width="220" height="220"></div>
                        </a>
                        <a class="recommend" href="#" target="_blank">
                            <div class="title">亚马逊/外贸商品爬虫</div>
                            <div class="desc">支持多个国家，外贸数据分析优秀工具</div>
                            <div class="img"><img src="https://shenjianshou-web.oss-cn-beijing.aliyuncs.com/market/523687_icon_mark.png" class="img-zoom" alt="" width="220" height="220"></div>
                        </a>
                     </div>
                    <ul class="indicators">
                        <li></li>
                        <li></li>
                        <li></li>
                        <li></li>
                        <li></li>
                        <li></li>
                    </ul>
                    <div class="nav prev"><i class="fs fs-angle-left"></i></div>
                    <div class="nav next"><i class="fs fs-angle-right"></i></div>
                </div>
                <div class="login-container box-sign">
                    <div class="login-title">
                       	 登录系统
                    </div>
                    <form id="login-form" role="form" action="${pageContext.request.contextPath }/loginAction_login"  method="POST">
                        <div class="form-group">
                            <div class="label-tip">
                                <h5 class="input-label">账号: </h5>
                                <span style="text-align: center;display:block;color:red;font-size: 15px">${loginInfo }</span>
                            </div>
                            <input type="text" name="username"  id="name_login" placeholder="请输入账号" value="${param.username }" autocomplete="off"  tabindex="1">
                            <div class="help-block name_login" for="error"></div>
                        </div>
                        <div class="form-group">
                            <div class="label-tip">
                                <h5 class="input-label">密码: </h5>
                                <span class="input-tip">
                            		<a href="#" class="login-link" onclick="forgetPassword()">忘记密码</a>
                        		</span>
                            </div>
                            <input type="password" name="password" id="password" placeholder="请输入密码" autocomplete="off"  tabindex="2">
                            <div class="help-block" for="error"></div>
                        </div>
                        <div class="form-group">
                            <div class="label-tip">
                                <h5 class="input-label">验证码: </h5>
                            </div>
                            <input type="text" name="checkcode" id="验证码" placeholder="请输入验证码" autocomplete="off"  tabindex="3" style="width:140px">
                            <!-- 验证码 -->
                            <img src="http://localhost:8080/${pageContext.request.contextPath }/checkImg.servlet" style="position:absolute; left:160px; top:45px; "/>
                            <div class="help-block" for="error"></div>
                        </div>
                        
                        <div align="center" style="font-size:16px">
                        	<input type="radio" name="identity" value="管理员" checked="checked">管理员&nbsp&nbsp&nbsp&nbsp
                        	<input type="radio" name="identity" value="教师">教师&nbsp&nbsp&nbsp&nbsp
                        	<input type="radio" name="identity" value="学生">学生&nbsp&nbsp&nbsp&nbsp
                        </div>
                        
                        <div class="submit-div">
                            <input type="submit" class="btn btn-info" value="登录">
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </section>
    <!-- main-container end -->
</div>
<footer class="main-footer footer-sign">
    <div class="footer-top">
        <a class="footer-top-sub" href="#" target="_blank">超链接</a> <span class="c-b80">|</span>
        <a class="footer-top-sub" href="#" target="_blank">超链接</a> <span class="c-b80">|</span>
        <a class="footer-top-sub" href="#" target="_blank">超链接</a> <span class="c-b80">|</span>
        <a class="footer-top-sub" href="#" target="_blank">超链接</a> <span class="c-b80">|</span>
        <a class="footer-top-sub" href="#" target="_blank">超链接</a> <span class="c-b80">|</span>
        <a class="footer-top-sub" href="#" target="_blank">超链接</a>
    </div>
    <div class="footer-bottom">成都信息工程大学版权所有 ©2003-2016 蜀ICP备05006389号-1</div>
</footer>


</div><script type="text/javascript" src="https://www.shenjian.io/assets/plugins/jquery-slider/jquery.SuperSlide.2.1.1.js"></script>
<script type="text/javascript" src="https://www.shenjian.io/assets/plugins/jquery-ui/jquery-ui.min.js"></script>
<script type="text/javascript" src="https://www.shenjian.io/assets/plugins/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="https://www.shenjian.io/assets/plugins/modernizr/modernizr.min.js"></script>
<script type="text/javascript" src="https://www.shenjian.io/assets/plugins/lodash/lodash.min.js"></script>
<script type="text/javascript" src="https://www.shenjian.io/assets/js/components/lodash-ext/lodash-ext.js?_v=4"></script>
<script type="text/javascript" src="https://www.shenjian.io/assets/plugins/select2/js/select2.min.js"></script>
<script type="text/javascript" src="https://www.shenjian.io/assets/plugins/jquery-appear/jquery-appear.js"></script>
<script type="text/javascript" src="https://www.shenjian.io/assets/plugins/jquery-cookie/jquery-cookie.js"></script>
<script type="text/javascript" src="https://www.shenjian.io/assets/plugins/jquery-query/jquery-query.js"></script>
<script type="text/javascript" src="https://www.shenjian.io/assets/plugins/jquery-toast/jquery-toast.js"></script>
<script type="text/javascript" src="https://www.shenjian.io/assets/js/components/encrypt/md5.js"></script>
<script type="text/javascript" src="https://www.shenjian.io/assets/js/components/core.js?_v=30"></script>
<script type="text/javascript" src="https://www.shenjian.io/assets/js/components/input-password/input-password.js?_v=1"></script>
<script type="text/javascript" src="https://www.shenjian.io/assets/js/components/input-file/input-file.js?_v=2"></script>
<script type="text/javascript" src="https://www.shenjian.io/assets/js/components/input-digit/input-digit.js?_v=3"></script>
<script type="text/javascript" src="https://www.shenjian.io/assets/js/components/form-ajax/form-ajax.js?_v=34"></script>
<script type="text/javascript" src="https://www.shenjian.io/assets/js/components/icheck/icheck.js"></script>
<script type="text/javascript" src="https://www.shenjian.io/assets/js/components/stack/stack.js?_v=3"></script>
<script type="text/javascript" src="https://www.shenjian.io/assets/js/components/dialog/dialog.js?_v=11"></script>
<script type="text/javascript" src="https://www.shenjian.io/assets/js/components/countdown/countdown.js?_v=9"></script>
<script type="text/javascript" src="https://www.shenjian.io/assets/js/components/customer-service/customer-service.js?_v=11"></script>
<script type="text/javascript" src="https://www.shenjian.io/assets/js/frontend.js?_v=25"></script>
<script type="text/javascript" src="https://www.shenjian.io/assets/js/import/frontend-home.js?_v=38"></script>
</body>
</html>

