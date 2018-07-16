<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<div id="sidebar">
    <!-- Start .sidebar-inner -->
    <div class="sidebar-inner">
        <!-- Start #sideNav -->
        <ul id="sideNav" class="nav nav-pills nav-stacked">
            <li>
                <a href="index.jsp"> 主页 <i class="im-paragraph-justify"></i></a>
            </li>
            <li>
                <a href="table-operation-log-select.jsp"><i class="im-checkbox-checked"></i>操作日志</a>
            </li>
            <li>
                <a href="#"> 商品管理 <i class="im-paragraph-justify"></i></a>
                <ul class="nav sub">
                    <li><a href="table-shop-select.jsp"><i class="im-checkbox-checked"></i>查看已有商品</a></li>
                    <li><a href="form-shop-add.jsp"><i class="im-checkbox-checked"></i>商品添加</a></li>
                </ul>
            </li>
            <li>
                <a href="#"> 供应商管理 <i class="im-paragraph-justify"></i></a>
                <ul class="nav sub">
                    <li><a href="table-supplier-select.jsp"><i class="im-checkbox-checked"></i>查看供应商</a></li>
                    <li><a href="form-supplier-add.jsp"><i class="im-checkbox-checked"></i>添加供应商</a></li>
                </ul>
            </li>
            <li>
                <a href="#"> 消息管理 <i class="im-paragraph-justify"></i></a>
                <ul class="nav sub">
                    <li><a href="table-message-select.jsp"><i class="im-checkbox-checked"></i>查看消息</a></li>
                    <li><a href=""><i class="im-checkbox-checked"></i>待处理消息</a></li>
                </ul>
            </li>
        </ul>
        <!-- End #sideNav -->
    </div>
    <!-- End .sidebar-inner -->
</div>

