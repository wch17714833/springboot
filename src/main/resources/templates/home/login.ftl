<!DOCTYPE html>
<html
<#include "../head.ftl">
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
<#include "../body.ftl">
<div class="layui-body" layout:fragment="content">
    <!-- 内容主体区域 -->
    <div style="padding: 15px;">内容主体11区域</div>
</div>
<#include "../footer.ftl">
</div>
</body>
<script>
       //JavaScript代码区域
        layui.use('element', function(){
            var element = layui.element;

        });
   /*    layui.config({
        base:'../static/' //你的模块目录
    }).use('layout_demo'); //加载入口*/
</script>
</html>
