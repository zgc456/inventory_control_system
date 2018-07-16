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
                        <h1 class="page-header"><i class="im-table2"></i> 操作日志列表</h1>
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
                                    <div style="width: 800px;height: 100px;float: left;padding-top: 20px">
                                        <ul style="width: 800px;height: 80px;">
                                            <li style="width: 395px;height: 35px;margin-right: 10px;float: left;">
                                                <div style="width: 300px;height: 50px;float: left;">
                                                    <span style="float: left;font-size: 16px;">操&nbsp;作&nbsp;模&nbsp;块:</span><select class="form-control" id="select_operationModel">
                                                    <option>请选择</option>
                                                    <option>商品</option>
                                                    <option>供应商</option>
                                                    <option>消息</option>
                                                </select>
                                                </div>
                                            </li>
                                            <li style="width: 395px;height: 35px;float: left;">
                                                <div style="width: 300px;height: 50px;float: left;">
                                                    <span style="float: left;font-size: 16px;">操作类型:</span>
                                                    <select class="form-control" id="select_operationAction">
                                                        <option>请选择</option>
                                                        <option>添加</option>
                                                        <option>修改</option>
                                                        <option>删除</option>
                                                    </select>
                                                </div>
                                            </li>
                                            <li style="width: 395px;height: 35px;margin-right: 10px;float: left;margin-top: 10px">
                                                <div style="width: 300px;height: 50px;float: left;">
                                                    <span style="float: left;font-size: 16px;">执行人姓名:</span>
                                                    <input type="text" class="form-control" id="select_operationUserName">
                                                </div>
                                            </li>
                                            <li style="width: 395px;height: 35px;float: left;margin-top: 10px">
                                                <div style="width: 300px;height: 50px;float: left;">
                                                    <span style="float: left;font-size: 16px;">起始日期:</span>
                                                    <input type="date" class="form-control" id="select_operationCreateTime">
                                                </div>
                                            </li>
                                        </ul>
                                    </div>
                                    <div style="width: 200px;height: 100px;float: right;">
                                        <div style="width: 100px;height: 50px;margin: 0px auto;padding-top: 40px">
                                            <input class="btn btn-primary btn-alt" type="button" onclick="sumbitSelect()" value="搜索" />
                                        </div>
                                    </div>
                                </div>
                                <div class="panel-body">
                                    <table class="table" id="showShopList">
                                        <thead>
                                            <tr>
                                                <th class="pre5" style="text-align: center;">编号</th>
                                                <th class="per10" style="text-align: center;">模块</th>
                                                <th class="per20" style="text-align: center;">模块操作</th>
                                                <th class="per20" style="text-align: center;">执行人姓名</th>
                                                <th class="per20" style="text-align: center;">执行时间</th>
                                                <th class="per10" style="text-align: center;">操作</th>
                                            </tr>
                                        </thead>
                                    </table>
                                </div>
                            </div>
                            <div style="width: 800px;height: 600px;display: none;" id="operationLog">
                                <table style="width: 800px;height: 600px;">
                                    <tr>
                                        <td style="width: 120px;"><span style="padding-left: 20px;">操作人姓名:</span></td><td><input id="operationUserName" class="form-control" type="text" disabled  /></td>
                                    </tr>
                                    <tr>
                                        <td><span style="padding-left: 20px;">操作模块:&nbsp;</span></td><td><input id="operationModel" class="form-control" type="text" disabled /></td>
                                    </tr>
                                    <tr>
                                        <td><span style="padding-left: 20px;">操作动作:&nbsp;</span></td><td><input id="operationAction" class="form-control" type="text" disabled /></td>
                                    </tr>
                                    <tr>
                                        <td><span style="padding-left: 20px;">操作时间:&nbsp;</span></td><td><input id="operationTime" class="form-control" type="text" disabled /></td>
                                    </tr>
                                    <tr>
                                        <td><span style="padding-left: 20px;">操作描述:&nbsp;</span></td><td><textarea id="operationDescribe" class="form-control" rows="10" disabled></textarea></td>
                                    </tr>
                                </table>
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
                                "operationModel":$("#select_operationModel").val(),
                                "operationModelAction":$("#select_operationAction").val(),
                                "operationUserName":$("#select_operationUserName").val(),
                                "operationCreateTime":$("#select_operationCreateTime").val()
                            });
                        },
                        url:"<%=request.getContextPath()%>/listOperationLog"
                    },
                    "aoColumns":[
                        {
                            "mData": "sortId",
                            "bSortable": false,
                            "sWidth": "5%",
                            "sClass": "center"
                        },
                        {
                            "mData": "operationModel",
                            "bSortable": false,
                            "sWidth": "20%",
                            "sClass": "center"
                        },
                        {
                            "mData": "operationModelAction",
                            "bSortable": false,
                            "sWidth": "10%",
                            "sClass": "center"
                        },
                        {
                            "mData": "operationName",
                            "bSortable": false,
                            "sWidth": "15%",
                            "sClass": "center"
                        },
                        {
                            "mData": "operationCreateTime",
                            "bSortable": false,
                            "sWidth": "15%",
                            "sClass": "center"
                        },
                        {
                            "bSortable": false,
                            "sWidth": "15%",
                            "sClass": "center",
                            "mRender":function (data,type,row) {
                                return '<td><div class="col-lg-3 col-md-6" style="width: 200px;"><input class="btn btn-primary btn-alt" type="button" onclick="selectOperationDescribe('+ row.id +')" value="查看详情" /><input class="btn btn-primary btn-alt" type="button" value="删除" /></div></td>'
                            }
                        }
                    ]
                });
            })
            function sumbitSelect() {
                table.fnDraw();
            }
            function selectOperationDescribe($value) {
                layer.open(
                    {
                        type:1,
                        title:"操作日志详细",
                        closeBtn:1,
                        area:['800px','650px'],
                        content:$("#operationLog"),
                        success:function () {
                            $.post("<%=request.getContextPath()%>/selectOperationLog",{"operationId":$value},function ($resultData) {
                                if($resultData.success){
                                    var $data = $resultData.data;
                                    $("#operationUserName").val($data.operationName);
                                    $("#operationModel").val($data.operationModel);
                                    $("#operationAction").val($data.operationModelAction);
                                    $("#operationTime").val($data.operationCreateTime);
                                    $("#operationDescribe").val($data.operationDescribe);
                                }
                            })
                        },
                        cancel:function () {
                            $("#operationLog").css({display:"none"});
                        }
                    }
                )
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