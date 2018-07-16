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
        <!-- Element样式库 -->
        <link rel="stylesheet" href="https://unpkg.com/element-ui/lib/theme-chalk/index.css">
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
        <link rel="stylesheet" href="<%=request.getContextPath()%>/static/assets/layui/css/layui.css" media="all">
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
                        <h1 class="page-header"><i class="im-table2"></i> 供应商列表</h1>
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
                                <!-- Start .panel -->
                                <div class="panel-heading white-bg">
                                    <h4 class="panel-title">供应商列表</h4>
                                </div>
                                <div class="panel-body">
                                    <table class="table">
                                        <thead>
                                        <tr>
                                            <th class="per10">编号</th>
                                            <th class="per15">名称</th>
                                            <th class="per15">电话</th>
                                            <th class="per10">操作</th>
                                        </tr>
                                        </thead>
                                        <tbody id="supplier_table">
                                        </tbody>
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
            <div class="clearfix"></div>
            <div id="supplier_update" style="width: 1000px;height: 550px;margin: 0px auto;display: none;">
                <div class="panel-body" style="margin: 0px auto;width: 800px;height: 400px;padding-top: 100px;">
                    <div class="form-group">
                        <label class="col-lg-2 control-label">供应商名称</label>
                        <div class="col-lg-10">
                            <input id="supplier_name" type="text" class="form-control required">
                        </div>
                    </div>
                    <div class="form-group"></div>
                    <div class="form-group" style="margin-top: 20px;">
                        <label class="col-lg-2 control-label">供应商电话</label>
                        <div class="col-lg-10">
                            <input id="supplier_phone" type="text" class="form-control required">
                        </div>
                    </div>
                    <div class="form-group"></div>
                    <div class="form-group" style="margin-top: 20px;">
                        <label class="col-lg-2 control-label">供应商介绍</label>
                        <div class="col-lg-10">
                            <textarea id="supplier_introduce" style="height: 200px;" class="form-control required"></textarea>
                        </div>
                    </div>
                </div>
            </div>
        </div>
       <script src="<%=request.getContextPath()%>/static/assets/layui/layui.js"></script>
        <script>
            $(document).ready(function () {
                appendTr();
            })
            function updateSupplier($td) {
                var $supplierId = $td.parentElement.parentElement.parentElement.children[0].innerText;
                layer.open(
                    {
                        type: 1,
                        closeBtn: 1,
                        title: "修改供应商信息",
                        area: ['1000px', '650px'],
                        content: $("#supplier_update"),
                        btn:['提交','取消'],
                        success:function () {
                            $.ajax(
                                {
                                    url:"<%=request.getContextPath()%>/selectSupplier",
                                    type:"post",
                                    data:{
                                        supplierId:$supplierId
                                    },
                                    success:function ($resultData) {
                                        if($resultData.success){
                                            $("#supplier_name").val($resultData.data.supplierName);
                                            $("#supplier_phone").val($resultData.data.supplierPhone);
                                            $("#supplier_introduce").val($resultData.data.supplierRemark);
                                        }
                                    }
                                }
                            )
                        },
                        yes:function () {
                            var $supplierName = document.getElementById("supplier_name").value;
                            var $supplierPhone = document.getElementById("supplier_phone").value;
                            var $supplierIntroduce = document.getElementById("supplier_introduce").value;
                            var $supplier = {}
                            $supplier.supplierName = $supplierName;
                            $supplier.supplierPhone = $supplierPhone;
                            if("" != $supplierName && null != $supplierName){
                                if("" != $supplierPhone && null != $supplierPhone){
                                    if($supplierPhone.length == 11){
                                        $supplier.supplierRemark = $supplierIntroduce;
                                        $supplier.id = $supplierId;
                                        var $supplierJson = JSON.stringify($supplier);
                                        $.ajax(
                                            {
                                                url:"<%=request.getContextPath()%>/updateSupplier",
                                                type:"post",
                                                data:{
                                                    json:$supplierJson
                                                },
                                                dataType:"json",
                                                success:function ($resultData) {
                                                    if($resultData.success){
                                                        layer.msg($resultData.message,{icon:6,time:1500})
                                                        appendTr();
                                                        layer.closeAll();
                                                        $("#supplier_update").css({display:"none"})
                                                    }
                                                }
                                            }
                                        )
                                    }else {
                                        layer.msg("电话的格式位11位",{icon:5,time:1500})
                                    }
                                }else {
                                    layer.msg("电话不能为空",{icon:5,time:1500})
                                }
                            }else {
                                layer.msg("名称不能为空",{icon:5,time:1500})
                            }
                        },
                        btn2:function () {
                            layer.close();
                            $("#supplier_update").css({display:"none"})
                            clearForm();
                        },
                        cancel:function () {
                            $("#supplier_update").css({display:"none"})
                            clearForm();
                        }
                    }
                )
            }
            function clearForm() {
                document.getElementById("supplier_name").value = "";
                document.getElementById("supplier_phone").value = "";
                document.getElementById("supplier_introduce").value = "";
            }
            function deleteSupplier($td) {
                var $supplierId = $td.parentElement.parentElement.parentElement.children[0].innerText;
                layer.confirm("是否删除",{
                    btn:['确定','取消']
                },function () {
                    $.ajax(
                        {
                            url:"<%=request.getContextPath()%>/deleteSupplier",
                            type:"post",
                            data:{
                                supplierId:$supplierId
                            },
                            success:function ($resultData) {
                                if($resultData.success){
                                    layer.msg($resultData.message,{icon:6,time:1500});
                                    appendTr();
                                }
                            }
                        }
                    )
                })
            }
            function clearForm() {
                document.getElementById("supplier_name").value = "";
                document.getElementById("supplier_phone").value = "";
                document.getElementById("supplier_introduce").value = "";
            }
            function appendTr() {
                $.ajax(
                    {
                        url:"<%=request.getContextPath()%>/listSupplierAll",
                        type:"POST",
                        success:function ($resultData) {
                            var $tbody = document.getElementById("supplier_table");
                            $tbody.innerHTML = "";
                            for(var i = 0;i < $resultData.data.length;i++){
                                var $tr = $(
                                    "<tr>\n" +
                                    "                                            <td>"+$resultData.data[i].id+"</td>"+
                                    "                                            <td>"+$resultData.data[i].supplierName+"</td>\n" +
                                    "                                            <td>"+$resultData.data[i].supplierPhone+"</td>\n" +
                                    "                                            <td>\n" +
                                    "                                                <div class=\"col-lg-3 col-md-6\" style=\"width: 200px;\">\n" +
                                    "                                                    <input class=\"btn btn-primary btn-alt\" type=\"button\" value=\"修改\" onclick=\"updateSupplier(this)\"/>\n" +
                                    "                                                    <input class=\"btn btn-primary btn-alt\" type=\"button\" value=\"删除\" onclick=\"deleteSupplier(this)\"/>\n" +
                                    "                                                </div>\n" +
                                    "                                            </td>\n" +
                                    "                                        </tr>"
                                )
                                $tr.appendTo($tbody);
                            }
                        }
                    }
                )
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
        <!-- Element组件库 -->
        <link rel="stylesheet" href="https://unpkg.com/element-ui/lib/theme-chalk/index.css">
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
        <script src="<%=request.getContextPath()%>/static/assets/plugins/misc/highlight/highlight.pack.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/plugins/misc/countTo/jquery.countTo.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/js/jquery.sprFlat.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/js/app.js"></script>
        <script src="<%=request.getContextPath()%>/static/assets/js/pages/tables.js"></script>
    </body>
</html>