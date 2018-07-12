<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>Login</title>
        <!-- Mobile specific metas -->
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <!-- Force IE9 to render in normal mode -->
        <!--[if IE]><meta http-equiv="x-ua-compatible" content="IE=9" /><![endif]-->
        <meta name="author" content="SuggeElson" />
        <meta name="description" content=""
        />
        <meta name="keywords" content=""
        />
        <meta name="application-name" content="sprFlat admin template" />
        <!-- Import google fonts - Heading first/ text second -->
        <link rel='stylesheet' type='text/css' href='http://fonts.googleapis.com/css?family=Open+Sans:400,700|Droid+Sans:400,700' />
        <!--[if lt IE 9]>
<link href="http://fonts.googleapis.com/css?family=Open+Sans:400" rel="stylesheet" type="text/css" />
<link href="http://fonts.googleapis.com/css?family=Open+Sans:700" rel="stylesheet" type="text/css" />
<link href="http://fonts.googleapis.com/css?family=Droid+Sans:400" rel="stylesheet" type="text/css" />
<link href="http://fonts.googleapis.com/css?family=Droid+Sans:700" rel="stylesheet" type="text/css" />
<![endif]-->
        <!-- Css files -->
        <!-- Icons -->
        <link href="<%=request.getContextPath()%>/static/assets/css/icons.css" rel="stylesheet" />
        <!-- jQueryUI -->
        <link href="<%=request.getContextPath()%>/static/assets/css/sprflat-theme/jquery.ui.all.css" rel="stylesheet" />
        <!-- Bootstrap stylesheets (included template modifications) -->
        <link href="<%=request.getContextPath()%>/static/assets/css/bootstrap.css" rel="stylesheet" />
        <!-- Plugins stylesheets (all plugin custom css) -->
        <link href="<%=request.getContextPath()%>/static/assets/css/plugins.css" rel="stylesheet" />
        <!-- Main stylesheets (template main css file) -->
        <link href="<%=request.getContextPath()%>/static/assets/css/main.css" rel="stylesheet" />
        <!-- Custom stylesheets ( Put your own changes here ) -->
        <link href="<%=request.getContextPath()%>/static/assets/css/custom.css" rel="stylesheet" />
        <!-- Fav and touch icons -->
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="<%=request.getContextPath()%>/static/assets/img/ico/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="<%=request.getContextPath()%>/static/assets/img/ico/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="<%=request.getContextPath()%>/static/assets/img/ico/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="${pageContext.request.contextPath}/img/ico/apple-touch-icon-57-precomposed.png">
        <link rel="icon" href="<%=request.getContextPath()%>/static/assets/img/ico/favicon.ico" type="image/png">
        <!-- Windows8 touch icon ( http://www.buildmypinnedsite.com/ )-->
        <meta name="msapplication-TileColor" content="#3399cc" />
    </head>
    <body class="login-page" style="background: url(<%=request.getContextPath()%>/static/assets/img/login.jpg) no-repeat fixed center;">
    <%
        Cookie[] cookies = request.getCookies();
        String userAccount = "";
        String userPassword = "";
        if(null != cookies){
            for(int i = 0;i < cookies.length;i++){
                if("userAccount".equals(cookies[i].getName())){
                    userAccount = cookies[i].getValue();
                }else if("userPassword".equals(cookies[i].getName())){
                    userPassword = cookies[i].getValue();
                }
            }
        }
    %>
        <!-- Start #login -->
        <div id="login" class="animated bounceIn">
            <!-- Start .login-wrapper -->
            <div class="login-wrapper">
                <ul id="myTab" class="nav nav-tabs nav-justified bn">
                    <li>
                        <a href="#log-in" data-toggle="tab">登录</a>
                    </li>
                </ul>
                <div id="myTabContent" class="tab-content bn">
                    <div class="tab-pane fade active in" id="log-in">
                        <div class="form-group">
                            <div class="col-lg-12">
                                <input type="text" id="userAccount" class="form-control left-icon" placeholder="请输入你的账号" value="<%=userAccount%>">
                            </div>
                        </div>
                        <div class="form-group" style="margin-top: 50px;">
                            <div class="col-lg-12">
                                <input type="password" id="password" class="form-control left-icon" placeholder="请输入你的密码" value="<%=userPassword%>">
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-lg-6 col-md-6 col-sm-6 col-xs-8">
                                <!-- col-lg-12 start here -->
                                <label class="checkbox">
                                    <%
                                        if(null != userAccount && !userAccount.equals("")){

                                    %>
                                        <input type="checkbox" id="rememberMe" checked="checked" >记住我
                                        <%
                                        }else {
                                        %>
                                        <input type="checkbox" id="rememberMe">记住我
                                    <%
                                        }
                                    %>
                                </label>
                            </div>
                            <!-- col-lg-12 end here -->
                            <div class="col-lg-6 col-md-6 col-sm-6 col-xs-4">
                                <!-- col-lg-12 start here -->
                                <button class="btn btn-success pull-right" onclick="formLogin()">确定</button>
                            </div>
                            <!-- col-lg-12 end here -->
                        </div>
                    </div>
                </div>
            </div>
            <!-- End #.login-wrapper -->
        </div>
        <script>
            function formLogin() {
                var $userAccount = document.getElementById("userAccount").value;
                var $userPassword = document.getElementById("password").value;
                var userVo = {};
                userVo.userAccount = $userAccount;
                userVo.userPassword = $userPassword;
                userVo.rememberMe = $("#rememberMe").is(":checked");
                var $json = JSON.stringify(userVo);
               if(null != $userAccount && $userAccount != "" ){
                 if(null != $userPassword && $userPassword != "" ){
                     $.ajax({
                         url : "<%=request.getContextPath()%>/login",
                         type : "post",
                         data:{
                             json:$json
                         },
                         dataType : "json",
                         success : function ($data) {
                             if($data.success){
                                 location.href = "index.jsp"
                             }else {
                                 layer.msg($data.message,{icon:5,time:1500});
                             }
                         }
                     })
                 }else {
                   layer.msg("请输入密码",{icon:5,time:1500});
                 }
               }else {
                   layer.msg("请输入用户名",{icon:5,time:1500});
               }
            }
        </script>
        <!-- Load pace first -->
        <script src="<%=request.getContextPath()%>/static/assets/plugins/core/pace/pace.min.js"></script>
        <!-- Important javascript libs(put in all pages) -->
        <script src="<%=request.getContextPath()%>/static/assets/js/jquery-1.8.3.min.js"></script>
        <script>
        window.jQuery || document.write('<script src="<%=request.getContextPath()%>/static/assets/js/libs/jquery-2.1.1.min.js">\x3C/script>')
        </script>
        <script src="http://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
        <script>
        window.jQuery || document.write('<script src="<%=request.getContextPath()%>/static/assets/js/libs/jquery-ui-1.10.4.min.js">\x3C/script>')
        </script>
        <!--[if lt IE 9]>
  <script type="text/javascript" src="<%=request.getContextPath()%>/static/assets/js/libs/excanvas.min.js"></script>
  <script type="text/javascript" src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
  <script type="text/javascript" src="<%=request.getContextPath()%>/static/assets/js/libs/respond.min.js"></script>
<![endif]-->
        <!-- Bootstrap plugins -->
        <script src="<%=request.getContextPath()%>/static/assets/js/bootstrap/bootstrap.js"></script>
        <!-- Form plugins -->
        <script src="<%=request.getContextPath()%>/static/assets/plugins/forms/icheck/jquery.icheck.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/plugins/forms/validation/jquery.validate.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/plugins/forms/validation/additional-methods.min.js"></script>
        <!-- Init plugins olny for this page -->
        <script src="<%=request.getContextPath()%>/static/assets/js/pages/login.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/layer/layer.js"></script>
    </body>
</html>