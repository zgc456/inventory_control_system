<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>Tables</title>
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
        <link rel="apple-touch-icon-precomposed" href="<%=request.getContextPath()%>/static/assets/img/ico/apple-touch-icon-57-precomposed.png">
        <link rel="icon" href="<%=request.getContextPath()%>/static/assets/img/ico/favicon.ico" type="image/png">
        <link rel="stylesheet" href="<%=request.getContextPath()%>/static/assets/layer/mobile/need/layer.css">
        <link rel="stylesheet" href="<%=request.getContextPath()%>/static/assets/layui/css/layui.css">
        <link rel="stylesheet" href="<%=request.getContextPath()%>/static/assets/css/jquery.dataTables.css">
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
                                <form action="#" class="form-horizontal" role="form">
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
                        <h1 class="page-header"><i class="im-table2"></i> Tables</h1>
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
                <div class="outlet">
                    <!-- Start .outlet -->
                    <!-- Page start here ( usual with .row ) -->
                    <div class="row">
                        <div class="col-lg-12">
                            <!-- col-lg-12 start here -->
                            <div class="panel panel-default plain toggle panelClose panelRefresh">
                                <div class="panel-heading white-bg" style="height: 100px;">
                                    <div style="width: 800px;height: 100px;float: left;">
                                        <div style="width: 200px;height: 50px;padding-top: 40px;float: left;">
                                            <input type="text" class="form-control" placeholder="商品名称" id="select_commodityName">
                                        </div>
                                        <div style="width: 300px;height: 50px;padding-top: 40px;float: left;">
                                            <select class="form-control" id="select_commoditySpecification">
                                                <option value="-1">商品规格</option>
                                            </select>
                                        </div>
                                        <div style="width: 300px;height: 50px;padding-top: 40px;float: left;">
                                            <span style="float: left;font-size: 16px;">起始日期:</span><input type="date" class="form-control" id="select_commodityCreateTime">
                                        </div>
                                    </div>
                                    <div style="width: 200px;height: 100px;float: right;">
                                        <div style="width: 100px;height: 50px;margin: 0px auto;padding-top: 40px">
                                            <input class="btn btn-primary btn-alt" type="button" onclick="sumbitSelect()" value="搜索" />
                                        </div>
                                    </div>
                                </div>
                                <div class="panel-heading white-bg">
                                    <h4 class="panel-title">供应商列表</h4>
                                </div>
                                <div class="panel-body">
                                    <table class="table" id="showShopList">
                                        <thead>
                                            <tr>
                                                <th class="pre10" style="text-align: center;">编号</th>
                                                <th class="per15" style="text-align: center;">商品名称</th>
                                                <th class="per20" style="text-align: center;">商品规格</th>
                                                <th class="per10" style="text-align: center;">商品数量</th>
                                                <th class="per10" style="text-align: center;">商品单价</th>
                                                <th class="per15" style="text-align: center;">添加时间</th>
                                                <th class="per10" style="text-align: center;">操作</th>
                                            </tr>
                                        </thead>
                                        <tbody></tbody>
                                    </table>
                                </div>
                            </div>
                            <!-- End .panel -->
                        </div>
                        <!-- col-lg-12 end here -->
                    </div>
                    <!-- Page End here -->
                </div>
                <!-- End .outlet -->
            </div>
            <!-- End .content-wrapper -->
            <div class="col-lg-12" >
                <ul class="pagination mb0" id="page">

                </ul>
            </div>
        </div>
        <div id="updateCommodity" style="width: 800px;height: 400px;margin: 0px auto;display: none;padding-top: 40px;">
            <div style="width: 600px;height: 300px;margin: 0px auto">
                <form id="updateCommodityFrom">
                    <div class="form-group">
                        <label class="col-lg-2 control-label">商品名称</label>
                        <div class="col-lg-10">
                            <input type="text" style="display:none" id="commodityId">
                            <input type="text" class="form-control required" id="commodityName" name="commodityName">
                        </div>
                    </div>
                    <div style="height: 50px;"></div>
                    <div class="form-group">
                        <label class="col-lg-2 control-label">商品规格</label>
                        <div class="col-lg-10">
                            <input type="text" class="form-control required" id="commoditySku" disabled>
                            <select style="width: 70%;" id="shopDetail" class="form-control" onchange="appendOptionText(this)">
                            </select>
                        </div>
                    </div>
                    <div style="height: 50px;"></div>
                    <div class="form-group">
                        <label class="col-lg-2 control-label">进货数量</label>
                        <div class="col-lg-10">
                            <input type="number" class="form-control required" id="commodityNumber" name="commodityNumber">
                        </div>
                    </div>
                    <div style="height: 50px;"></div>
                    <div class="form-group" >
                        <label class="col-lg-2 control-label">商品警戒值</label>
                        <div class="col-lg-10">
                            <input type="number" class="form-control required" id="commoditySecurityLine" name="commoditySecurityLine">
                        </div>
                    </div>
                    <div style="height: 50px;"></div>
                    <div class="form-group" >
                        <label class="col-lg-2 control-label">商品单价</label>
                        <div class="col-lg-10">
                            <input type="number" class="form-control required" id="commodityPrice" name="commodityPrice">
                        </div>
                    </div>
                </form>
            </div>
        </div>
        <script>
            var table;
            $(document).ready(function () {
                table = $("#showShopList").dataTable({
                    "language":"${pageContext.request.contextPath}/chat/zh_CN.txt",
                    "processing":false,
                    "searching":false,
                    "bPaginate" : true,
                    "bLengthChange":false,
                    "info":false,
                    "bStateSave": false,
                    "sPaginationType":"full_numbers",
                    "bFilter": false,
                    "iDisplayLength": 10,
                    "bServerSide": true,
                    "serverSide":true,
                    "ajax":{
                        type:"POST",
                        data: function(d) {
                            return $.extend({}, d, {
                                "json":returnJson()
                            });
                        },
                        url:"<%=request.getContextPath()%>/listCommodityByCondition"
                    },
                    "aoColumns":[
                        {
                            "mData": "id",
                            "bSortable": false,
                            "sWidth": "5%",
                            "sClass": "center"
                        },
                        {
                            "mData": "commodity.commodityName",
                            "bSortable": false,
                            "sWidth": "20%",
                            "sClass": "center"
                        },
                        {
                            "mData": "commoditySku",
                            "bSortable": false,
                            "sWidth": "10%",
                            "sClass": "center"
                        },
                        {
                            "mData": "commodityNumber",
                            "bSortable": false,
                            "sWidth": "15%",
                            "sClass": "center"
                        },
                        {
                            "mData": "commodityPrice",
                            "bSortable": false,
                            "sWidth": "15%",
                            "sClass": "center"
                        },
                        {
                            "mData": "commodityCreateTime",
                            "bSortable": false,
                            "sWidth": "10%",
                            "sClass": "center"
                        },
                        {
                            "mData": "id",
                            "bSortable": false,
                            "sWidth": "15%",
                            "sClass": "center",
                            "mRender":function (data,type,row) {
                                return '<td><div class="col-lg-3 col-md-6" style="width: 200px;"><input class="btn btn-primary btn-alt" type="button" value="修改" onclick="updateCommodity('+row.id+')" /><input class="btn btn-primary btn-alt" type="button" value="删除" /></div></td>'
                            }
                        }
                    ]
                });
                $.ajax(
                    {
                        url:"<%=request.getContextPath()%>/listSpecification",
                        type:"post",
                        success:function ($result) {
                            if($result.success){
                                var $select = document.getElementById("select_commoditySpecification");
                                for(var i = 0;i < $result.data.length;i++){
                                    var $optgroup = $(
                                        "<optgroup label="+$result.data[i].topicName+">"+$result.data[i].detailed+"</optgroup>"
                                    )
                                    $optgroup.appendTo($select);
                                }
                            }
                        }
                    }
                )
            })
            function sumbitSelect() {
                table.fnDraw();
            }
            function returnJson() {
                var commodity = {};
                commodity.commodityName = document.getElementById("select_commodityName").value;
                commodity.commoditySku = document.getElementById("select_commoditySpecification").value;
                commodity.createTime = document.getElementById("select_commodityCreateTime").value;
                var json = JSON.stringify(commodity);
                return json;
            }
            <!-- 删除商品 -->
            function isShop($commodityId) {
                layer.confirm("是否删除",{
                    btn:['确认','取消']
                },function () {
                    $.post("<%=request.getContextPath()%>/deleteCommodity",{commodityId:$commodityId},function ($resultData) {
                        if($resultData.success){
                            layer.msg($resultData.message,{icon:6,time:1500});
                        }
                    })
                })
            }
            <!-- 修改商品 -->
            function updateCommodity($input) {
                layer.open(
                    {
                        type:1,
                        title:"修改商品",
                        closeBtn:0,
                        area:['800px','500px'],
                        content:$("#updateCommodity"),
                        btn:['确认','取消'],
                        success:function () {
                            $.ajax(
                                {
                                    url:"<%=request.getContextPath()%>/selectCommodity",
                                    type:"post",
                                    data:{
                                        commodityId:$input
                                    },
                                    success:function ($resultData) {
                                        if($resultData.success){
                                            document.getElementById("commodityId").value = $resultData.data[0].id;
                                            document.getElementById("commodityName").value = $resultData.data[0].commodity.commodityName;
                                            document.getElementById("commoditySku").value = $resultData.data[0].commoditySku;
                                            document.getElementById("commodityNumber").value = $resultData.data[0].commodityNumber;
                                            document.getElementById("commoditySecurityLine").value = $resultData.data[0].commoditySecurityLine;
                                            document.getElementById("commodityPrice").value = $resultData.data[0].commodityPrice;
                                            appendOption();
                                        }
                                    }
                                }
                            )
                        },
                        yes:function () {
                            if(examineUpdateFrom()){
                                var $jsonFromData = {};
                                var $updateFromData = new FormData(document.getElementById("updateCommodityFrom"));
                                $updateFromData.append("id",document.getElementById("commodityId").value);
                                $updateFromData.append("commoditySku",document.getElementById("commoditySku").value);
                                for(var entity of $updateFromData.entries()){
                                    $jsonFromData[entity[0]] = entity[1];
                                }
                                $.post("<%=request.getContextPath()%>/updateCommodity",{json:JSON.stringify($jsonFromData)},function ($resultData) {
                                    if($resultData.success){
                                        layer.msg($resultData.message,{icon:6,time:1500});
                                        $("#updateCommodity").css({display:"none"});
                                        layer.closeAll();
                                        table.fnDraw();
                                    }
                                })
                            }
                        },
                        btn2:function () {
                            $("#updateCommodity").css({display:"none"})
                        }
                    }
                )
            }
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
            function appendOption() {
                var $select = document.getElementById("shopDetail");
                $.ajax(
                    {
                        url:"<%=request.getContextPath()%>/listSpecification",
                        type:"post",
                        success:function ($resultData) {
                            $select.innerHTML = "";
                            var $option = $("<option value='-1'>清空</option>")
                            $option.appendTo($select);
                            for(var j = 0;j < $resultData.data.length;j++) {
                                var $option = $(
                                    "<optgroup label=" + $resultData.data[j].topicName + ">" + $resultData.data[j].detailed + "</optgroup>"
                                );
                                $option.appendTo($select);
                            }
                        }
                    }
                )
            }
            function examineUpdateFrom() {
                if(null == $("#commodityName").val() || "" == $("#commodityName").val()){
                    layer.msg("商品名称不能为空",{icon:6,time:1500});
                    return false;
                }
                if(null == $("#commoditySku").val() || "" == $("#commoditySku").val()){
                    layer.msg("商品规格不能为空",{icon:6,time:1500});
                    return false;
                }
                if(null == $("#commodityNumber").val || "" == $("#commodityNumber").val()){
                    layer.msg("进货数量不能为空",{icon:6,time:1500});
                    return false;
                }else if(parseInt($("#commodityNumber").val()) <= 0){
                    layer.msg("商品数量不能小于等于0",{icon:6,time:1500});
                    return false;
                }
                if(null == $("#commoditySecurityLine").val || "" == $("#commoditySecurityLine").val()){
                    layer.msg("商品警戒数量不能为空",{icon:6,time:1500});
                    return false;
                }else if(parseInt($("#commoditySecurityLine").val()) <= 0){
                    layer.msg("商品警戒数量不能小于等于0",{icon:6,time:1500});
                    return false;
                }
                if(null == $("#commodityPrice").val || "" == $("#commodityPrice").val()){
                    layer.msg("商品价格不能为空",{icon:6,time:1500});
                    return false;
                }else if(parseInt($("#commodityPrice").val()) <= 0){
                    layer.msg("商品价格不能小于等于0",{icon:6,time:1500});
                    return false;
                }
                return true;
            }
        </script>
        <script src="<%=request.getContextPath()%>/static/assets/plugins/core/pace/pace.min.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/js/jquery-1.8.3.min.js"></script>
        <script>
        window.jQuery || document.write('<script src="<%=request.getContextPath()%>/static/assets/js/libs/jquery-2.1.1.min.js">\x3C/script>')
        </script>
        <script src="http://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
        <script>
        window.jQuery || document.write('<script src="<%=request.getContextPath()%>/static/assets/js/libs/jquery-ui-1.10.4.min.js">\x3C/script>')
        </script>
        <script src="<%=request.getContextPath()%>/static/assets/layui/layui.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/js/bootstrap/bootstrap.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/js/jRespond.min.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/plugins/core/slimscroll/jquery.slimscroll.min.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/plugins/core/slimscroll/jquery.slimscroll.horizontal.min.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/plugins/forms/autosize/jquery.autosize.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/plugins/core/quicksearch/jquery.quicksearch.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/plugins/ui/bootbox/bootbox.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/plugins/core/moment/moment.min.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/plugins/charts/sparklines/jquery.sparkline.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/plugins/charts/pie-chart/jquery.easy-pie-chart.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/plugins/forms/icheck/jquery.icheck.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/plugins/forms/tags/jquery.tagsinput.min.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/plugins/forms/tinymce/tinymce.min.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/plugins/misc/highlight/highlight.pack.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/plugins/misc/countTo/jquery.countTo.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/js/jquery.sprFlat.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/js/app.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/js/pages/tables.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/js/dataTable/jquery.dataTables.min.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/js/dataTable/jquery.dataTables.bootstrap.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/js/dataTable/dataTables.select.js"></script>
    </body>
</html>