<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<div id="header">
    <div class="container-fluid">
        <div class="navbar">
            <div class="navbar-header">
                <a class="navbar-brand" href="index.jsp">
                    <i class="im-windows8 text-logo-element animated bounceIn"></i><span class="text-logo">spr</span><span class="text-slogan">flat</span>
                </a>
            </div>
            <nav class="top-nav" role="navigation">
                <ul class="nav navbar-nav pull-left">
                    <li id="toggle-sidebar-li">
                        <a href="#" id="toggle-sidebar"><i class="en-arrow-left2"></i>
                        </a>
                    </li>
                    <li>
                        <a href="#" class="full-screen"><i class="fa-fullscreen"></i></a>
                    </li>
                </ul>
                <ul class="nav navbar-nav pull-right">
                    <li class="dropdown">
                        <a href="#" data-toggle="dropdown" style="height: 50px;"><i class="br-alarm"></i> <span class="notification">提示</span></a>
                        <ul class="dropdown-menu notification-menu right" role="menu">

                        </ul>
                    </li>
                    <li class="dropdown">
                        <a href="#" data-toggle="dropdown">
                            <img class="user-avatar" src="<%=request.getContextPath()%>/static/assets/img/avatars/48.jpg" alt="SuggeElson">管理员</a>
                        <ul class="dropdown-menu right" role="menu">
                            <li><a href="#"><i class="st-settings"></i> 修改密码 </a>
                            </li>
                            <li><a href="login.jsp"><i class="im-exit"></i> 退出 </a>
                            </li>
                        </ul>
                    </li>
                    <%--<li id="toggle-right-sidebar-li"><a href="#" id="toggle-right-sidebar"><i class="ec-users"></i> <span class="notification">3</span></a>--%>
                    </li>
                </ul>
            </nav>
        </div>
        <!-- Start #header-area -->
        <div id="header-area" class="fadeInDown">
            <div class="header-area-inner">
                <ul class="list-unstyled list-inline">
                    <li>
                        <div class="shortcut-button">
                            <a href="#">
                                <i class="im-pie"></i>
                                <span>Earning Stats</span>
                            </a>
                        </div>
                    </li>
                    <li>
                        <div class="shortcut-button">
                            <a href="#">
                                <i class="ec-images color-dark"></i>
                                <span>Gallery</span>
                            </a>
                        </div>
                    </li>
                    <li>
                        <div class="shortcut-button">
                            <a href="#">
                                <i class="en-light-bulb color-orange"></i>
                                <span>Fresh ideas</span>
                            </a>
                        </div>
                    </li>
                    <li>
                        <div class="shortcut-button">
                            <a href="#">
                                <i class="ec-link color-blue"></i>
                                <span>Links</span>
                            </a>
                        </div>
                    </li>
                    <li>
                        <div class="shortcut-button">
                            <a href="#">
                                <i class="ec-support color-red"></i>
                                <span>Support</span>
                            </a>
                        </div>
                    </li>
                    <li>
                        <div class="shortcut-button">
                            <a href="#">
                                <i class="st-lock color-teal"></i>
                                <span>Lock area</span>
                            </a>
                        </div>
                    </li>
                </ul>
            </div>
        </div>
        <!-- End #header-area -->
    </div>
    <!-- Start .header-inner -->
</div>
