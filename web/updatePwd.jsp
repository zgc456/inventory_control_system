<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div style="width: 700px;height: 360px;">
            <div style="width: 600px;height: 360px;margin: 0px auto">
                <div style="width: 600px;height: 80px;padding:20px 0 0 50px;">
                    <div style="padding:30px;">
                        <label for="oldPassword" style="float: left;margin-right: 20px;vertical-align: middle;">原密码:</label>
                        <div style="float: left">
                            <input type="password" id="oldPassword" style="width: 200px;height: 30px;border-radius: 4px;" onchange="verifyOld()" />
                        </div>
                    </div>
                </div>
                <div style="width: 600px;height: 80px;padding:20px 0 0 50px;">
                    <div style=";padding:30px;">
                        <label for="newPassword" style="float: left;margin-right: 20px;vertical-align: middle;">新密码:</label>
                        <div style="float: left">
                            <input type="password" id="newPassword" style="width: 200px;height: 30px;border-radius: 4px;" onchange="verifyFormat(this.value)" />
                        </div>
                    </div>
                </div>
                <div style="width: 600px;height: 80px;padding:20px 0 0 50px;">
                    <div style="padding:30px;">
                        <label for="againPassword" style="float: left;margin-right: 10px;vertical-align: middle;">再次密码:</label>
                        <div style="float: left">
                            <input type="password" id="againPassword" style="width: 200px;height: 30px;border-radius: 4px;" onchange="verifyPassword()" />
                        </div>
                    </div>
                </div>
                <div style="width: 600px;height: 40px;padding-top: 30px;">
                    <div style="width: 200px;height: 40px;margin: 0px auto">
                        <button onclick="sumbit()" type="button" style="width: 80px;height: 30px;">确定</button>
                        <button onclick="result()" style="width: 80px;height: 30px;">重置</button>
                    </div>
                </div>
            </div>
    </div>
    <script src="<%=request.getContextPath()%>/static/assets/js/jquery-1.8.3.min.js"></script>
    <script src="<%=request.getContextPath()%>/static/assets/layer/layer.js"></script>
    <script>
        <!-- 表单提交 -->
        function sumbit() {
            var $oldPwd = document.getElementById("oldPassword").value;
            var $newPwd = document.getElementById("newPassword").value;
            var $againPwd = document.getElementById("againPassword").value;
            if($oldPwd.length == 0){
                layer.msg("密码不能为空",{icon:5,time:1500});
            }else if($newPwd.length == 0){
                layer.msg("密码不能为空",{icon:5,time:1500});
            }else if($againPwd.length == 0){
                layer.msg("密码不能为空",{icon:5,time:1500});
            }else {
                $.ajax({
                    url:"<%=request.getContextPath()%>/updatePassword",
                    type:"post",
                    data:{
                        password:$againPwd
                    },
                    success:function ($data) {
                        if($data.success){
                            layer.confirm(
                                $data.message,
                                {
                                    btn:['确定']
                                },function () {
                                    top.location.href = "<%=request.getContextPath()%>/login.jsp";
                                }
                            );
                        }
                    }
                });
            }
        }
        <!-- 密码长度验证 -->
        function verifyFormat($value) {
            if($value.length < 6 || $value.length > 10){
                layer.msg("密码格式为6 - 10位",{icon:6,time:1500});
                return false;
            }
            return true;
        }
        <!-- 两次密码输入是否一致验证 -->
        function verifyPassword() {
            var $newPassword = document.getElementById("newPassword").value;
            var $againPassword = document.getElementById("againPassword").value;
            var $oldPassword = document.getElementById("oldPassword").value;
            if(verifyFormat($againPassword)){
                if($newPassword != $againPassword){
                    layer.msg("两次输入的密码不一致",{icon:5,time:1500});
                }else if($oldPassword == $againPassword){
                    layer.msg("新密码不能与原密码相同",{icon:5,time:1500});
                }
            }
        }
        <!-- 是否与原密码一致验证 -->
        function verifyOld() {
            var $value = document.getElementById("oldPassword").value;
            if(verifyFormat($value)){
                var $password = $value;
                $.ajax({
                    url:"<%=request.getContextPath()%>/verifyPassword",
                    type:"post",
                    data:{
                        password:$password
                    },
                    success:function ($data) {
                        if(!$data.success){
                            layer.msg($data.message,{icon:5,time:1500});
                        }
                    }
                })
            }
        }
        <!-- 输入框重置 -->
        function result() {
            document.getElementById("oldPassword").value = "";
            document.getElementById("newPassword").value = "";
            document.getElementById("againPassword").value = "";
        }
    </script>
</body>
</html>
