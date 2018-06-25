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
                                            <input type="date" class="form-control" id="select_commodityCreateTime">
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
                                    <table class="table">
                                        <thead>
                                            <tr>
                                                <th class="pre10">编号</th>
                                                <th class="per10">商品名称</th>
                                                <th class="per15">商品规格</th>
                                                <th class="per10">商品数量</th>
                                                <th class="per10">商品单价</th>
                                                <th class="per20">介绍</th>
                                                <th class="per10">添加时间</th>
                                                <th class="per10">操作</th>
                                            </tr>
                                        </thead>
                                        <tbody id="showShopList"></tbody>
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
        <script>
            $(document).ready(function () {
                $.ajax(
                    {
                        url:"<%=request.getContextPath()%>/listCommodityHomePage",
                        type:"post",
                        success:function ($result) {
                            if($result.success){
                                var $page = document.getElementById("page");
                                appendCommodit($result);
                                appendPage($result,$page);
                            }
                        }
                    }
                )
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
                var $select_CommodityName = document.getElementById("select_commodityName");
                var $select_CommoditySku = document.getElementById("select_commoditySpecification");
                var $select_CommodityCreateTime = document.getElementById("select_commodityCreateTime");
                var $commodityVo = {};
                $commodityVo.commodityName = $select_CommodityName.value;
                if($select_CommoditySku.value > 0){
                    $commodityVo.commoditySku = $select_CommoditySku.value
                };
                $commodityVo.createTime = $select_CommodityCreateTime.value;
                $commodityVo.customPage = 1;
                $json = JSON.stringify($commodityVo);
                $.ajax(
                    {
                        url:"<%=request.getContextPath()%>/listCommodityByCondition",
                        type:"post",
                        data: {
                            json: $json
                        },
                        dataType : "json",
                        success:function ($result) {
                            if($result.success){
                                var $page = document.getElementById("page");
                                appendCommodit($result);
                                appendPage($result,$page);
                            }
                        }
                    }
                )
            }
            function isShop() {
                if(confirm("是否删除?")){
                    $.ajax({

                    })
                }
            }
            function skipPage($li,identifier) {
                var $skip = {};
                if(identifier > 0){
                    $skip.skip = identifier;
                }else{
                    $skip.customPage = $li.innerText;
                }
                $json = JSON.stringify($skip);
                $.ajax(
                    {
                        url:"<%=request.getContextPath()%>/listCommodityByCondition",
                        type:"post",
                        data: {
                            json: $json
                        },
                        dataType : "json",
                        success:function ($result) {
                            if($result.success){
                                var $page = document.getElementById("page");
                                appendCommodit($result);
                                appendPage($result,$page);
                            }
                        }
                    }
                )
            }
            function appendPage($result,$page) {
                $page.innerHTML = "";
                var $li = $("<li onclick='skipPage(this,1)'><a><i class=\"en-arrow-left8\"></i></a></li>");
                $li.appendTo($page);
                for(var j = 0;j < $result.data.pageCount;j++){
                    $li = $(
                        "<li onclick='skipPage(this,-1)'><a>"+ (j + 1) +"</a></li>"
                    );
                    $li.appendTo($page);
                }
                $li = $("<li onclick='skipPage(this,2)'><a><i class=\"en-arrow-right8\"></i></a></li>");
                $li.appendTo($page);
            }
            function appendCommodit($result) {
                var $tbody = document.getElementById("showShopList");
                $tbody.innerHTML = "";
                var $pageData = $result.data.pageData;
                for(var i = 0;i < $pageData.length;i++){
                    var $tr = $(
                        "<tr>" +
                        "   <td>"+$pageData[i].id+"</td>"+
                        "   <td>"+$pageData[i].commodity.commodityName+"</td>\n" +
                        "   <td>"+$pageData[i].commoditySku+"</td>\n" +
                        "   <td>"+$pageData[i].commodityNumber+"</td>\n" +
                        "   <td>"+$pageData[i].commodityPrice+"</td>\n" +
                        "   <td>"+$pageData[i].commodity.commodityIntroduce+"</td>\n" +
                        "   <td>"+$pageData[i].commodityCreateTime+"</td>\n" +
                        "   <td>\n" +
                        "       <div class=\"col-lg-3 col-md-6\" style=\"width: 200px;\">\n" +
                        "            <input class=\"btn btn-primary btn-alt\" type=\"button\" value=\"修改\" />\n" +
                        "            <input class=\"btn btn-primary btn-alt\" type=\"button\" value=\"删除\" />\n" +
                        "       </div>\n" +
                        "  </td>\n" +
                        "</tr>"
                    )
                    $tr.appendTo($tbody);
                }
            }
        </script>
        <!-- End #content -->
        <!-- Javascripts -->
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
        <script src="<%=request.getContextPath()%>/static/assets/plugins/forms/checkall/jquery.checkAll.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/plugins/misc/highlight/highlight.pack.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/plugins/misc/countTo/jquery.countTo.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/js/jquery.sprFlat.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/js/app.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/js/pages/tables.js"></script>
    </body>
</html>