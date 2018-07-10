<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
    <head>
        <meta charset="utf-8">
        <title>Form validation</title>
        <!-- Mobile specific metas -->
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <meta http-equiv="x-ua-compatible" content="IE=9" />
        <meta name="author" content="SuggeElson" />
        <meta name="description" content=""/>
        <meta name="keywords" content=""/>
        <meta name="application-name" content="sprFlat admin template" />
        <!-- Import google fonts - Heading first/ text second -->
        <!--[if lt IE 9]-->
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
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="/static/assets/img/ico/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="/static/assets/img/ico/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="/static/assets/img/ico/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="/static/assets/img/ico/apple-touch-icon-57-precomposed.png">
        <link rel="icon" href="/static/assets/img/ico/favicon.ico" type="image/png">
        <!-- Windows8 touch icon ( http://www.buildmypinnedsite.com/ )-->
        <meta name="msapplication-TileColor" content="#3399cc" />

    </head>
    <body>
        <%@ include file="top.jsp"%>
        <%@include file="lift.jsp"%>
        <!-- Start #right-sidebar -->
        <div id="right-sidebar" class="hide-sidebar">
            <!-- Start .sidebar-inner -->
            <div class="sidebar-inner">
                <div class="sidebar-panel mt0">
                    <div class="sidebar-panel-content fullwidth pt0">
                        <div class="chat-user-list">
                            <form class="form-horizontal chat-search" role="form">
                                <div class="form-group">
                                    <input type="text" class="form-control" placeholder="Search for user...">
                                    <button type="submit"><i class="ec-search s16"></i>
                                    </button>
                                </div>
                                <!-- End .form-group  -->
                            </form>
                            <ul class="chat-ui bsAccordion">
                                <li>
                                    <a href="#">Favorites <span class="notification teal">4</span><i class="en-arrow-down5"></i></a>
                                    <ul class="in">
                                        <li>
                                            <a href="#" class="chat-name">
                                                <img class="chat-avatar" src="<%=request.getContextPath()%>/static/assets/img/avatars/49.jpg" alt="@chadengle">Chad Engle
                                                <span class="has-message"><i class="im-pencil"></i></span>
                                            </a>
                                            <span class="status online"><i class="en-dot"></i></span>
                                        </li>
                                        <li>
                                            <a href="#" class="chat-name">
                                                <img class="chat-avatar" src="<%=request.getContextPath()%>/static/assets/img/avatars/54.jpg" alt="@alagoon">Anthony Lagoon</a>
                                            <span class="status offline"><i class="en-dot"></i></span>
                                        </li>
                                        <li>
                                            <a href="#" class="chat-name">
                                                <img class="chat-avatar" src="<%=request.getContextPath()%>/static/assets/img/avatars/52.jpg" alt="@koridhandy">Kory Handy</a>
                                            <span class="status"><i class="en-dot"></i></span>
                                        </li>
                                        <li>
                                            <a href="#" class="chat-name">
                                                <img class="chat-avatar" src="<%=request.getContextPath()%>/static/assets/img/avatars/50.jpg" alt="@divya">Divia Manyan</a>
                                            <span class="status"><i class="en-dot"></i></span>
                                        </li>
                                    </ul>
                                </li>
                                <li>
                                    <a href="#">Online <span class="notification green">3</span><i class="en-arrow-down5"></i></a>
                                    <ul class="in">
                                        <li>
                                            <a href="#" class="chat-name">
                                                <img class="chat-avatar" src="<%=request.getContextPath()%>/static/assets/img/avatars/51.jpg" alt="@kolage">Eric Hofman</a>
                                            <span class="status online"><i class="en-dot"></i></span>
                                        </li>
                                        <li>
                                            <a href="#" class="chat-name">
                                                <img class="chat-avatar" src="<%=request.getContextPath()%>/static/assets/img/avatars/55.jpg" alt="@mikebeecham">Mike Beecham</a>
                                            <span class="status online"><i class="en-dot"></i></span>
                                        </li>
                                        <li>
                                            <a href="#" class="chat-name">
                                                <img class="chat-avatar" src="<%=request.getContextPath()%>/static/assets/img/avatars/53.jpg" alt="@derekebradley">Darek Bradly</a>
                                            <span class="status online"><i class="en-dot"></i></span>
                                        </li>
                                    </ul>
                                </li>
                                <li>
                                    <a href="#">Offline <span class="notification red">5</span><i class="en-arrow-down5"></i></a>
                                    <ul>
                                        <li>
                                            <a href="#" class="chat-name">
                                                <img class="chat-avatar" src="<%=request.getContextPath()%>/static/assets/img/avatars/56.jpg" alt="@laurengray">Lauren Grey</a>
                                            <span class="status offline"><i class="en-dot"></i></span>
                                        </li>
                                        <li>
                                            <a href="#" class="chat-name">
                                                <img class="chat-avatar" src="<%=request.getContextPath()%>/static/assets/img/avatars/49.jpg" alt="@chadengle">Chad Engle</a>
                                            <span class="status offline"><i class="en-dot"></i></span>
                                        </li>
                                        <li>
                                            <a href="#" class="chat-name">
                                                <img class="chat-avatar" src="<%=request.getContextPath()%>/static/assets/img/avatars/58.jpg" alt="@frankiefreesbie">Frankie Freesibie</a>
                                            <span class="status offline"><i class="en-dot"></i></span>
                                        </li>
                                        <li>
                                            <a href="#" class="chat-name">
                                                <img class="chat-avatar" src="<%=request.getContextPath()%>/static/assets/img/avatars/57.jpg" alt="@joannefournier">Joane Fornier</a>
                                            <span class="status offline"><i class="en-dot"></i></span>
                                        </li>
                                        <li>
                                            <a href="#" class="chat-name">
                                                <img class="chat-avatar" src="<%=request.getContextPath()%>/static/assets/img/avatars/59.jpg" alt="@aiiaiiaii">Alia Alien</a>
                                            <span class="status offline"><i class="en-dot"></i></span>
                                        </li>
                                    </ul>
                                </li>
                            </ul>
                        </div>
                        <div class="chat-box">
                            <h5>Chad Engle</h5>
                            <a id="close-user-chat" href="#" class="btn btn-xs btn-primary"><i class="en-arrow-left4"></i></a>
                            <ul class="chat-ui chat-messages">
                                <li class="chat-user">
                                    <p class="avatar">
                                        <img src="<%=request.getContextPath()%>/static/assets/img/avatars/49.jpg" alt="@chadengle">
                                    </p>
                                    <p class="chat-name">Chad Engle <span class="chat-time">15 seconds ago</span>
                                    </p>
                                    <span class="status online"><i class="en-dot"></i></span>
                                    <p class="chat-txt">Hello Sugge check out the last order.</p>
                                </li>
                                <li class="chat-me">
                                    <p class="avatar">
                                        <img src="<%=request.getContextPath()%>/static/assets/img/avatars/48.jpg" alt="SuggeElson">
                                    </p>
                                    <p class="chat-name">SuggeElson <span class="chat-time">10 seconds ago</span>
                                    </p>
                                    <span class="status online"><i class="en-dot"></i></span>
                                    <p class="chat-txt">Ok i will check it out.</p>
                                </li>
                                <li class="chat-user">
                                    <p class="avatar">
                                        <img src="<%=request.getContextPath()%>/static/assets/img/avatars/49.jpg" alt="@chadengle">
                                    </p>
                                    <p class="chat-name">Chad Engle <span class="chat-time">now</span>
                                    </p>
                                    <span class="status online"><i class="en-dot"></i></span>
                                    <p class="chat-txt">Thank you, have a nice day</p>
                                </li>
                            </ul>
                            <div class="chat-write">
                                <form class="form-horizontal" role="form">
                                    <div class="form-group">
                                        <textarea name="sendmsg" id="sendMsg" class="form-control elastic" rows="1"></textarea>
                                        <a role="button" class="btn" id="attach_photo_btn">
                                            <i class="fa-picture s20"></i>
                                        </a>
                                        <input type="file" name="attach_photo" id="attach_photo">
                                    </div>
                                    <!-- End .form-group  -->
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- End .sidebar-inner -->
        </div>
        <!-- End #right-sidebar -->
        <!-- Start #content -->
        <div id="content">
            <!-- Start .content-wrapper -->
            <div class="content-wrapper">
                <div class="row">
                    <!-- Start .row -->
                    <!-- Start .page-header -->
                    <div class="col-lg-12 heading">
                        <h1 class="page-header"><i class="im-checkbox-checked"></i> Form validation</h1>
                        <!-- Start .bredcrumb -->
                        <ul id="crumb" class="breadcrumb">
                        </ul>
                        <!-- End .breadcrumb -->
                        <!-- Start .option-buttons -->
                        <div class="option-buttons">
                            <div class="btn-toolbar" role="toolbar">
                                <div class="btn-group">
                                    <a id="clear-localstorage" class="btn tip" title="Reset panels position">
                                        <i class="ec-refresh color-red s24"></i>
                                    </a>
                                </div>
                                <div class="btn-group dropdown">
                                    <a class="btn dropdown-toggle" data-toggle="dropdown" id="dropdownMenu1"><i class="br-grid s24"></i></a>
                                    <div class="dropdown-menu pull-right" role="menu" aria-labelledby="dropdownMenu1">
                                        <div class="option-dropdown">
                                            <div class="shortcut-button">
                                                <a href="#">
                                                    <i class="im-pie"></i>
                                                    <span>Earning Stats</span>
                                                </a>
                                            </div>
                                            <div class="shortcut-button">
                                                <a href="#">
                                                    <i class="ec-images color-dark"></i>
                                                    <span>Gallery</span>
                                                </a>
                                            </div>
                                            <div class="shortcut-button">
                                                <a href="#">
                                                    <i class="en-light-bulb color-orange"></i>
                                                    <span>Fresh ideas</span>
                                                </a>
                                            </div>
                                            <div class="shortcut-button">
                                                <a href="#">
                                                    <i class="ec-link color-blue"></i>
                                                    <span>Links</span>
                                                </a>
                                            </div>
                                            <div class="shortcut-button">
                                                <a href="#">
                                                    <i class="ec-support color-red"></i>
                                                    <span>Support</span>
                                                </a>
                                            </div>
                                            <div class="shortcut-button">
                                                <a href="#">
                                                    <i class="st-lock color-teal"></i>
                                                    <span>Lock area</span>
                                                </a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="btn-group dropdown">
                                    <a class="btn dropdown-toggle" data-toggle="dropdown" id="dropdownMenu2"><i class="ec-pencil s24"></i></a> 
                                    <div class="dropdown-menu pull-right" role="menu" aria-labelledby="dropdownMenu2">
                                        <div class="option-dropdown">
                                            <div class="row">
                                                <p class="col-lg-12">Quick post</p>
                                                <form class="form-horizontal" role="form">
                                                    <div class="form-group">
                                                        <div class="col-lg-12">
                                                            <input type="text" class="form-control" placeholder="Enter title">
                                                        </div>
                                                    </div>
                                                    <!-- End .form-group  -->
                                                    <div class="form-group">
                                                        <div class="col-lg-12">
                                                            <textarea class="form-control wysiwyg" placeholder="Enter text"></textarea>
                                                        </div>
                                                    </div>
                                                    <!-- End .form-group  -->
                                                    <div class="form-group">
                                                        <div class="col-lg-12">
                                                            <input type="text" class="form-control tags1" placeholder="Enter tags">
                                                        </div>
                                                    </div>
                                                    <!-- End .form-group  -->
                                                    <div class="form-group">
                                                        <div class="col-lg-12">
                                                            <button class="btn btn-default btn-xs">Save Draft</button>
                                                            <button class="btn btn-success btn-xs pull-right">Publish</button>
                                                        </div>
                                                    </div>
                                                    <!-- End .form-group  -->
                                                </form>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="btn-group">
                                    <a class="btn dropdown-toggle" data-toggle="dropdown" id="dropdownMenu3"><i class="ec-help s24"></i></a>
                                    <div class="dropdown-menu pull-right" role="menu" aria-labelledby="dropdownMenu3">
                                        <div class="option-dropdown">
                                            <p>First time visitor ? <a href="#" id="app-tour" class="btn btn-success ml15">Take app tour</a> 
                                            </p>
                                            <hr>
                                            <p>Or check the <a href="#" class="btn btn-danger ml15">FAQ</a>
                                            </p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- End .option-buttons -->
                    </div>
                    <!-- End .page-header -->
                </div>
                <!-- End .row -->
                <!-- Page start here ( usual with .row ) -->
                <div class="outlet">
                    <!-- Start .outlet -->
                    <div class="row">
                        <!-- Start .row -->
                        <div class="col-lg-12">
                            <!-- Start col-lg-12 -->
                            <div class="panel panel-default toggle">
                                <!-- Start .panel -->
                                <div class="panel-heading">
                                    <h3 class="panel-title">商品添加</h3>
                                </div>
                                <div class="panel-body">
                                    <!-- 表单提交 -->
                                    <form class="form-horizontal group-border hover-stripped" id="submitFrom">
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">商品名称</label>
                                            <div class="col-lg-10">
                                                <input type="text" class="form-control required" id="commodityName">
                                                <span style="width: 200px;height: 50px;color: #953b39;" id="commodityNameSpan"></span>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">供应商名称</label>
                                            <div class="col-lg-10">
                                                <select id='supplierId' class="form-control"></select>
                                            </div>
                                        </div>
                                        <div class="form-group"></div>
                                        <div class="panel panel-default plain toggle panelClose panelRefresh">
                                            <!-- Start .panel -->
                                            <div class="panel-heading white-bg">
                                                <h4 class="panel-title">商品规格</h4>
                                                <input class="btn btn-primary btn-alt" type="button" value="添加一行" onclick="appendTr()" />
                                            </div>
                                            <div class="panel-body">
                                                <table class="table table-striped">
                                                    <thead>
                                                    <tr>
                                                        <th class="per5">规格详细</th>
                                                        <th class="per5">进货数量</th>
                                                        <th class="per5">警戒数量</th>
                                                        <th class="per5">商品单价</th>
                                                        <th class="per5">操作</th>
                                                    </tr>
                                                    </thead>
                                                    <tbody id="shop_table">

                                                    </tbody>
                                                </table>
                                            </div>
                                        </div>
                                        <!-- End .form-group  -->
                                        <div class="form-group">
                                            <div class="col-lg-offset-2">
                                                <input type="button" class="btn btn-default ml15" onclick="sumbit()" value="提交"></input>
                                            </div>
                                        </div>
                                        <!-- End .form-group  -->
                                    </form>
                                </div>
                            </div>
                            <!-- End .panel -->
                        </div>
                        <!-- End col-lg-12 -->
                    </div>
                    <!-- End .row -->
                    <!-- Page End here -->
                </div>
                <!-- End .outlet -->
            </div>
            <!-- End .content-wrapper -->
            <div class="clearfix"></div>
        </div>
        <!-- End #content -->
        <!-- Javascripts -->
        <!-- Load pace first -->
        <script src="<%=request.getContextPath()%>/static/assets/plugins/core/pace/pace.min.js"></script>
        <!-- Important javascript libs(put in all pages) -->
        <script src="<%=request.getContextPath()%>/static/assets/js/jquery-1.8.3.min.js"></script>
        <script>
            $(document).ready(function () {
                appendTr();
                appendOption();
                appendSupplier();
            });
            <!-- 提交数据 -->
            function sumbit() {
                if(verifyFrom()){
                    var $commodity = {};
                    $commodity.commodityName = document.getElementById("commodityName").value;
                    $commodity.supplier = document.getElementById("supplierId").value;
                    $commodity.supplierName = $("#supplierId").find("option:selected").text();
                    var $commodityNumber = [];
                    var $commoditySecurityLine = [];
                    var $commodityPrice = [];
                    var $commoditySku = [];
                    for(var i = 0;i < document.getElementsByName("shopDetail").length;i++){
                        $commodityNumber[i] = document.getElementsByName("commodityNumber")[i].value;
                        $commoditySecurityLine[i]= document.getElementsByName("commoditySecurityLine")[i].value;
                        $commodityPrice[i] = document.getElementsByName("commodityPrice")[i].value;
                        $commoditySku[i] = document.getElementsByName("commoditySku")[i].value;
                    }
                    $commodity.commodityNumber = $commodityNumber;
                    $commodity.commoditySecurityLine = $commoditySecurityLine;
                    $commodity.commodityPrice = $commodityPrice;
                    $commodity.commoditySku = $commoditySku;
                    var $jsonFromData = JSON.stringify($commodity);
                    $.ajax(
                        {
                            url:"<%=request.getContextPath()%>/insertCommodity",
                            type:"post",
                            data:{
                                json:$jsonFromData
                            },
                            dataType:"json",
                            success:function ($resultData) {
                                if($resultData.success){
                                    layer.msg($resultData.message,{icon:6,time:1500})
                                }
                            }
                        }
                    )
                }
            }
            <!-- 清空规格数据 -->
            function cleanOptionText($option) {
                $option.parentElement.children[0].value = "";
            }
            <!-- 规格框追加数据 -->
            function appendOptionText($option) {
                if($option.value > 0){
                    var $optionVale = $option.parentElement.children[0].value;
                    if($optionVale.split(" ").length < 6){
                        $option.parentElement.children[0].value = $optionVale + " " + $option[$option.value].text
                    }else {
                        layer.msg("最多选5个规格个哟",{icon:6,time:1500});
                    }
                }else {
                    cleanOptionText($option);
                }
            }
            <!-- 规格下拉框添加数据 -->
            function appendOption() {
                var $select = document.getElementsByName("shopDetail");
                $.ajax(
                    {
                        url:"<%=request.getContextPath()%>/listSpecification",
                        type:"post",
                        success:function ($resultData) {
                            for(var i = 0;i < $select.length;i++){
                                $select[i].innerHTML = "";
                                var $option = $("<option value='-1'>清空</option>")
                                $option.appendTo($select[i]);
                                for(var j = 0;j < $resultData.data.length;j++) {
                                    var $option = $(
                                        "<optgroup label=" + $resultData.data[j].topicName + ">" + $resultData.data[j].detailed + "</optgroup>"
                                    );
                                    $option.appendTo($select[i]);
                                }
                            }
                        }
                    }
                )
            }
            <!-- 获取供应商 -->
            function appendSupplier() {
                $.ajax(
                    {
                        url:"<%=request.getContextPath()%>/listSupplierAll",
                        type:"POST",
                        success:function ($resultData) {
                            var $select = document.getElementById("supplierId");
                            $select.innerHTML = "";
                            $("<option value='-1'>请选择</option>").appendTo($select);
                            for(var i = 0;i < $resultData.data.length;i++){
                                var $option = $("<option value="+$resultData.data[i].id+">"+$resultData.data[i].supplierName+"</option>");
                                $option.appendTo($select);
                            }
                        }
                    }
                )
            }
            <!-- 删除商品规格信息 -->
            function deleteTr($input) {
                layer.confirm("要删除吗?",function () {
                    $input.parentElement.parentElement.remove();
                    layer.msg("删除成功",{icon:6,time:1500});
                })
            }
            <!-- 添加一行商品样式 -->
            function appendTr() {
                var $table = document.getElementById("shop_table");
                var $tr = $(
                    "<tr>\n" +
                    "                                                            <td>\n" +
                    "                                                                <div class=\"form-group\">\n" +
                    "                                                                    <div class=\"col-lg-10 col-md-10\" style=\"width: 250px;\">\n" +
                    "                                                                        <input style=\"width: 250px;\" type=\"text\" disabled class=\"form-control tags\" name='commoditySku' placeholder=\"请选择规格详细\">\n" +
                    "                                                                            <select style=\"width: 250px;\" name='shopDetail' class=\"form-control\" onchange='appendOptionText(this)'></select>\n" +
                    "                                                                    </div>\n" +
                    "                                                                </div>\n" +
                    "                                                            </td>\n" +
                    "                                                            <td>\n" +
                    "                                                                <div class=\"col-lg-3 col-md-6\">\n" +
                    "                                                                    <input style=\"width: 200px;\" type=\"number\" class=\"form-control\" name='commodityNumber' min='1' value=\"1\"  />\n" +
                    "                                                                </div>\n" +
                    "                                                            </td>\n" +
                    "                                                            <td>\n" +
                    "                                                                <div class=\"col-lg-3 col-md-6\">\n" +
                    "                                                                    <input style=\"width: 200px;\" class=\"form-control\" type=\"number\" name='commoditySecurityLine' min='1' value=\"1\" >\n" +
                    "                                                                </div>\n" +
                    "                                                            </td>\n" +
                    "                                                            <td>\n" +
                    "                                                                <div class=\"col-lg-3 col-md-6\">\n" +
                    "                                                                    <input style=\"width: 200px;\" class=\"form-control\" type=\"number\" name='commodityPrice' min='1' value=\"1.00\" >\n" +
                    "                                                                </div>\n" +
                    "                                                            </td>\n" +
                    "                                                            <td>\n" +
                    "                                                                <input class=\"btn btn-primary btn-alt\" type=\"button\" onclick='deleteTr(this)' value=\"删除\" />\n" +
                    "                                                            </td>\n" +
                    "                                                        </tr>"
                );
                $tr.appendTo($table);
                appendOption();
            }
            <!-- 验证表单 -->
            function verifyFrom() {
                var commodityName = document.getElementById("commodityName").value;
                if(null == commodityName || "" == commodityName){
                    layer.msg("商品名称不能为空",{icon:6,time:1500});
                    return false
                }
                if(parseInt(document.getElementById("supplierId").value) < 0){
                    layer.msg("请选择供应商",{icon:6,time:1500});
                    return false
                }
                for(var i = 0;i < document.getElementsByName("shopDetail").length;i++){
                    var $commodityNumber = document.getElementsByName("commodityNumber")[i].value;
                    var $commoditySecurityLine = document.getElementsByName("commoditySecurityLine")[i].value;
                    var $commodityPrice = document.getElementsByName("commodityPrice")[i].value;
                    var $commoditySku = document.getElementsByName("commoditySku")[i].value;
                    if("" == $commodityNumber || parseInt($commodityNumber) <= 0){
                        layer.msg("商品数量格式不正确",{icon:6,time:1500});
                        return false;
                    }
                    if("" == $commoditySecurityLine || parseInt($commoditySecurityLine) <= 0){
                        layer.msg("商品警告数量格式不正确",{icon:6,time:1500});
                        return false;
                    }
                    if("" == $commodityPrice || parseInt($commodityPrice) <= 0){
                        layer.msg("商品价格格式不正确",{icon:6,time:1500});
                        return false;
                    }
                    if(null == $commoditySku || "" == $commoditySku){
                        layer.msg("商品规格不能为空",{icon:6,time:1500});
                        return false;
                    }
                }
                return true;
            }
        </script>
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
        <!-- Core plugins ( not remove ever) -->
        <!-- Handle responsive view functions -->
        <script src="<%=request.getContextPath()%>/static/assets/js/jRespond.min.js"></script>
        <!-- Custom scroll for sidebars,tables and etc. -->
        <script src="<%=request.getContextPath()%>/static/assets/plugins/core/slimscroll/jquery.slimscroll.min.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/plugins/core/slimscroll/jquery.slimscroll.horizontal.min.js"></script>
        <!-- Resize text area in most pages -->
        <script src="<%=request.getContextPath()%>/static/assets/plugins/forms/autosize/jquery.autosize.js"></script>
        <!-- Proivde quick search for many widgets -->
        <script src="<%=request.getContextPath()%>/static/assets/plugins/core/quicksearch/jquery.quicksearch.js"></script>
        <!-- Bootbox confirm dialog for reset postion on panels -->
        <script src="<%=request.getContextPath()%>/static/assets/plugins/ui/bootbox/bootbox.js"></script>
        <!-- Other plugins ( load only nessesary plugins for every page) -->
        <script src="<%=request.getContextPath()%>/static/assets/plugins/core/moment/moment.min.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/plugins/charts/sparklines/jquery.sparkline.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/plugins/charts/pie-chart/jquery.easy-pie-chart.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/plugins/forms/icheck/jquery.icheck.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/plugins/forms/tags/jquery.tagsinput.min.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/plugins/forms/tinymce/tinymce.min.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/plugins/forms/switch/jquery.onoff.min.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/plugins/forms/maxlength/bootstrap-maxlength.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/plugins/forms/bootstrap-filestyle/bootstrap-filestyle.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/plugins/forms/color-picker/spectrum.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/plugins/forms/daterangepicker/daterangepicker.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/plugins/forms/datetimepicker/bootstrap-datetimepicker.min.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/plugins/forms/globalize/globalize.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/plugins/forms/maskedinput/jquery.maskedinput.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/plugins/forms/select2/select2.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/plugins/forms/dual-list-box/jquery.bootstrap-duallistbox.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/plugins/forms/password/jquery-passy.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/plugins/forms/validation/jquery.validate.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/plugins/forms/validation/additional-methods.min.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/plugins/misc/highlight/highlight.pack.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/plugins/misc/countTo/jquery.countTo.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/js/jquery.sprFlat.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/js/app.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/js/pages/form-validation.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/layer/layer.js"></script>
    </body>
</html>