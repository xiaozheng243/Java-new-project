﻿<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>405</title>
    <link href="${pageContext.request.contextPath}/styles/css/404.css" rel="stylesheet" type="text/css"/>
    <script src="${pageContext.request.contextPath}/bower_components/jquery/dist/jquery.min.js"></script>
    <script type="text/javascript">
        $(function () {
            var h = $(window).height();
            $('body').height(h);
            $('.mianBox').height(h);
            centerWindow(".tipInfo");
        });

        //2.将盒子方法放入这个方，方便法统一调用
        function centerWindow(a) {
            center(a);
            //自适应窗口
            $(window).bind('scroll resize',
                function () {
                    center(a);
                });
        }

        //1.居中方法，传入需要剧中的标签
        function center(a) {
            var wWidth = $(window).width();
            var wHeight = $(window).height();
            var boxWidth = $(a).width();
            var boxHeight = $(a).height();
            var scrollTop = $(window).scrollTop();
            var scrollLeft = $(window).scrollLeft();
            var top = scrollTop + (wHeight - boxHeight) / 2;
            var left = scrollLeft + (wWidth - boxWidth) / 2;
            $(a).css({
                "top": top,
                "left": left
            });
        }
    </script>
    <style>
        a {
            width: 60px;
            height: 20px;
            line-height: 20px;
            display: block;
            color: white;
            margin: 30px auto 0 auto;
            text-decoration: none;
            background-color: #e94c3c;
            padding: 5px;
        }
    </style>
</head>

<body>
<div class="mianBox">
    <img src="${pageContext.request.contextPath}/styles/img/yun0.png" alt="" class="yun yun0"/>
    <img src="${pageContext.request.contextPath}/styles/img/yun1.png" alt="" class="yun yun1"/>
    <img src="${pageContext.request.contextPath}/styles/img/yun2.png" alt="" class="yun yun2"/>
    <img src="${pageContext.request.contextPath}/styles/img/bird.png" alt="" class="bird"/>
    <img src="${pageContext.request.contextPath}/styles/img/san.png" alt="" class="san"/>
    <div class="tipInfo">
        <div class="in">
            <div class="textThis">
                <h2>505！</h2>
                <p>哎呀，服务器遇到了不能解决的问题，请稍后重试！
                    <a href="${pageContext.request.contextPath}/index">回首页</a>
                </p>
            </div>
        </div>
    </div>
</div>

</body>

</html>