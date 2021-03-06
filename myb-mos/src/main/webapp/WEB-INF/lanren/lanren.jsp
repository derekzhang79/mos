<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <title>简单易用的类似banner切换效果的图片墙动画效果</title>
    <link rel="stylesheet" href="../css/lanren/lanren.css">
</head>
<body>

<!-- 代码部分begin -->
	<div style="float: right; width: 128px; height: 19px; background-color: wheat;">
		<a href="/myb-mos/project/index.jhtml">返回首页</a>
	</div>

	<div id="wrap" class="wrap">
    <div class="photo" id="photo_{{index}}" onclick="turn(this)">
        <div class="photo_wrap" >
            <div class="side side_front">
                <div class="image">
                    <img src="../images/lanren/{{img}}" alt="{{alt}}"/>
                </div>
                <div class="capation">
                    {{caption}}
                </div>
            </div>
            <div class="side side_back">
                <div class="desc">
                    {{desc}}
                </div>
            </div>
        </div>
    </div>
</div>
<script>
	var myData = [];
var myDataStr = "1.霍比特人<br>\
<br>\
导演:彼得.杰克逊<br>\
编剧:弗兰.威尔士<br>\
主演:ruby<br>\
类型:动作<br>\
制片国家:美国<br>\
语言:英语<br>\
上映时间:2015-01-23<br>\
片长:144分钟<br>\
<br>\
<br>\
2.冰雪奇缘<br>\
<br>\
导演:彼得.杰克逊<br>\
编剧:弗兰.威尔士<br>\
主演:ruby<br>\
类型:动作<br>\
制片国家:美国<br>\
语言:英语<br>\
上映时间:2015-01-23<br>\
片长:144分钟<br>\
<br>\
<br>\
3.速度与激情7<br>\
<br>\
导演:彼得.杰克逊<br>\
编剧:弗兰.威尔士<br>\
主演:ruby<br>\
类型:动作<br>\
制片国家:美国<br>\
语言:英语<br>\
上映时间:2015-01-23<br>\
片长:144分钟<br>\
<br>\
<br>\
4.一路惊喜<br>\
<br>\
导演:彼得.杰克逊<br>\
编剧:弗兰.威尔士<br>\
主演:ruby<br>\
类型:动作<br>\
制片国家:美国<br>\
语言:英语<br>\
上映时间:2015-01-23<br>\
片长:144分钟<br>\
<br>\
<br>\
5.三傻大闹宝莱坞<br>\
<br>\
导演:彼得.杰克逊<br>\
编剧:弗兰.威尔士<br>\
主演:ruby<br>\
类型:动作<br>\
制片国家:美国<br>\
语言:英语<br>\
上映时间:2015-01-23<br>\
片长:144分钟<br>\
<br>\
<br>\
6.甜心先生<br>\
<br>\
导演:彼得.杰克逊<br>\
编剧:弗兰.威尔士<br>\
主演:ruby<br>\
类型:动作<br>\
制片国家:美国<br>\
语言:英语<br>\
上映时间:2015-01-23<br>\
片长:144分钟<br>\
<br>\
<br>\
7.青春三<br>\
<br>\
导演:彼得.杰克逊<br>\
编剧:弗兰.威尔士<br>\
主演:ruby<br>\
类型:动作<br>\
制片国家:美国<br>\
语言:英语<br>\
上映时间:2015-01-23<br>\
片长:144分钟<br>\
<br>\
<br>\
8.美女<br>\
<br>\
导演:彼得.杰克逊<br>\
编剧:弗兰.威尔士<br>\
主演:ruby<br>\
类型:动作<br>\
制片国家:美国<br>\
语言:英语<br>\
上映时间:2015-01-23<br>\
<br>\
<br>\
9.邓紫棋<br>\
<br>\
导演:彼得.杰克逊<br>\
编剧:弗兰.威尔士<br>\
主演:ruby<br>\
类型:动作<br>\
制片国家:美国<br>\
语言:英语<br>\
上映时间:2015-01-23<br>\
<br>\
<br>\
10.铁塔<br>\
<br>\
导演:彼得.杰克逊<br>\
编剧:弗兰.威尔士<br>\
主演:ruby<br>\
类型:动作<br>\
制片国家:美国<br>\
语言:英语<br>\
上映时间:2015-01-23<br>\
<br>\
<br>\
11.love<br>\
<br>\
导演:彼得.杰克逊<br>\
编剧:弗兰.威尔士<br>\
主演:ruby<br>\
类型:动作<br>\
制片国家:美国<br>\
语言:英语<br>\
上映时间:2015-01-23<br>\
"
//定义函数分割myData数据 , myData接收分好组的数据 :以三个连续的<br>\标记为分界

var d = myDataStr.split("<br><br><br>");   //以三个br分出不同大主题
for(var i=0 ;i< d.length;i++){
    var c = d[i].split("<br><br>");
    myData.push(
        {
            img:c[0].replace('.',"")+".jpg",
            caption:c[0].split('.')[1],
            desc:c[1]
        }
    )
}
</script>
<script src="../js/lanren/lanren.js"></script>
<!-- 代码部分end -->

</body>
</html>