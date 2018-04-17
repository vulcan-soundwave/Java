<%@page import="java.util.List"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>

 
    <!-- start: Meta -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
    <title>基于互联网数据的大数据分析</title>
    <meta name="description" content="Home Page use Bootstrap">
    <meta name="author" content="vulcan">
    <meta name="keyword" content="Home, Charts, ...">
    <!-- end: Meta -->
    
    <!-- start: Mobile Specific -->
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <!-- end: Mobile Specific -->

    <!-- start: CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css">
    <link rel="stylesheet" href="../css/sidebar-menu.css">
    <link id="bootstrap-style" href="../css/bootstrap.min.css" rel="stylesheet">
    <link href="../css/bootstrap-responsive.min.css" rel="stylesheet">
    <link id="base-style" href="../css/style.css" rel="stylesheet">i
    <link id="base-style-responsive" href="../css/style-responsive.css" rel="stylesheet">
    <link href='../css/mydemo.css' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" type="text/css" href="css/main.css"/>
    <!-- end: CSS -->

    <!-- start: JavaScript-->

    <script src="../dist/jquery.min.js" type="text/javascript"></script>
    <script src="../dist/sidebar-menu.js"></script>

    <script src="../dist/bootstrap.min.js"></script>
    <script src="../dist/echarts.min.js"></script>
    <script src="../dist/china.js"></script>

    <!-- end: JavaScript-->


    <style>p.indent{ padding-left: 1.8em }</style>
    <style type="text/css">
    .main-sidebar{
        position: absolute;
        top: 0;
        left: 0;
        height: auto;
        min-height: 100%;
        width: 200px;
        z-index: 810;
        background-color: #222d32;
     }
    </style>    


<style type="text/css">
*{margin:0;padding:0;list-style-type:none;}
a,img{border:0;}

/* leftsead */
#leftsead{width:131px;height:143px;position:fixed;top:258px;right:0px;}
*html #leftsead{margin-top:258px;position:absolute;top:expression(eval(document.documentElement.scrollTop));}
#leftsead li{width:131px;height:53px;}
#leftsead li img{float:right;border-bottom-left-radius:5px;border-top-left-radius:5px;}
#leftsead li a{height:49px;float:right;display:block;min-width:47px;max-width:131px;}
#leftsead li a .shows{display:block;}
#leftsead li a .hides{margin-right:-220px;cursor:pointer;cursor:hand;}
#leftsead li a.youhui .hides{display:none;position:absolute;right:216px;top:2px;}
</style>


</head>

<body>


    <!-- start: Main Menu -->
<aside class="main-sidebar">
<section  class="sidebar">
    <ul class="sidebar-menu">
      <li class="header">MAIN NAVIGATION</li>
        <li class="treeview">
        <a href="#">
            <li><a href="pages.html"><i class="fa fa-bars"></i> <span>Home</span>
        </a>
        </li>

        <li class="treeview">
        <a href="#">
          <i class="fa fa-pie-chart"></i> <span>Charts—in china map</span> <i class="fa fa-angle-left pull-right"></i>
        </a>
        <ul class="treeview-menu">

            <!-- start: HomePage -->
          <li><a href="effective_data.html"><i class="fa fa-circle-o"></i>爬取网站及各领域岗位需求量比例</a></li>
            <!-- ends: HomePage -->

            <!-- start: in china map -->
          <li><a href="china-average_salary-distribution.html"><i class="fa fa-circle-o"></i>全国（平均）薪资分布情况</a></i>
          <li><a href="china-company-distribution.html "><i class="fa fa-circle-o"></i>全国公司的城市分布</a></i>
          <li><a href="china-requirement.html"><i class="fa fa-circle-o"></i>全国岗位需求量分布</a></i>
          <li><a href="big_data-requirement.html"><i class="fa fa-circle-o"></i>全国大数据岗位需求量分布</a></i>
          <li><a href="diff_area-average_salary.html"><i class="fa fa-circle-o"></i>不同领域的平均薪资所占比例</a></i>
            <!-- ends: in china map -->
        </ul>
        </li>
        <li class="treeview">
        <a href="#">
          <i class="fa fa-pie-chart"></i> <span>Charts—Relation</span> <i class="fa fa-angle-left pull-right"></i>
        </a>
        <ul class="treeview-menu">

            <!-- start: relation -->
          <li><a href="education-backgroud.html"><i class="fa fa-circle-o"></i>学历及工作经验与平均薪资关系</a></li>
            <!-- ends: relation -->
        </ul>
        </li>

        <li class="treeview">
        <a href="#">
          <i class="fa fa-pie-chart"></i> <span>Charts—Ranking</span> <i class="fa fa-angle-left pull-right"></i>
        </a>
        <ul class="treeview-menu">

            <!-- start: Ranking -->
          <li><a href="highest_salary-post-requirement.html"><i class="fa fa-circle-o"></i>计算机专业薪水前十名岗位及其需求量</a></i>
          <li><a href="hands-on background.html"><i class="fa fa-circle-o"></i>计算机专业工作经验要求分布情况</a></i>
          <li><a href="highest_city-requirement.html"><i class="fa fa-circle-o"></i>大数据职位需求量前十名城市中大数据岗位需求量前六名排
行</a></i>
          <li><a href="highestarea_requirement_area-big_data.html"><i class="fa fa-circle-o"></i>大数据职位需求量最高的前十名行业</a></i>
          <li><a href="highest_bigdata-requirement.html"><i class="fa fa-circle-o"></i>企业需求量最高的前十种大数据人才</a></i>

          <li><a href="language-requirement.html"><i class="fa fa-circle-o"></i>编程语言职位需求量前十名</a></i>
          <li><a href="language-salary.html"><i class="fa fa-circle-o"></i>需求量前十名的编程语言平均薪资</a></i>
            <!-- ends: Ranking -->

        </ul>
        </li>



        <li class="treeview">
            <a href="#">
              <i class="fa fa-files-o"></i> <span>File</span> <i class="fa fa-angle-left pull-right"></i>
            </a>
            <!-- Collapsed Sidebar -->
            <ul class="treeview-menu" style="display: none;">
             <li><a href="#"><i class="fa fa-circle-o"></i>技术文档<i class="fa fa-angle-left pull-right"></i></a>
                <ul class="treeview-menu" style="display:none;">
                    <li><a href="../file/详细设计说明书.pdf"><i class="fa fa-circle"></i>详细设计说明书</a></li>
                    <li><a href="../file/需求规格说明书.pdf"><i class="fa fa-circle"></i>需求规格说明书</a></li>
                </ul>
             </li>
             <li><a href="../file/管理文档"><i class="fa fa-circle-o"></i>管理文档<i class="fa fa-angle-left pull-right"></i></a>
                <ul class="treeview-menu" style="display:none;">
                    <li><a href="../file/项目计划书.pdf"><i class="fa fa-circle"></i>项目计划书</a></li>
                    <li><a href="../file/项目开发日志.pdf"><i class="fa fa-circle"></i>项目开发日志</a></li>
                    <li><a href="../file/项目开发总结.pdf"><i class="fa fa-circle"></i>项目开发总结</a></li>
                </ul>
             </li>
             <li><a href="../file/系统说明文档"><i class="fa fa-circle-o"></i>系统说明文档<i class="fa fa-angle-left pull-right"></i></a>
                <ul class="treeview-menu" style="display:none;">
                    <li><a href="../file/项目说明文档.pdf"><i class="fa fa-circle"></i>项目说明文档</a></li>
                    <li><a href="../file/特别说明.pdf"><i class="fa fa-circle"></i>特别说明</a></li>
                </ul>
             </li>
            </ul>
        </li>

      <li><a href="#"> <i class=""></i> <span></span> </a></li>
      <li><a href="#"> <i class=""></i> <span></span> </a></li>

      <li class="header">LABELS</li>
      <li><a href="source.html"><i class="fa fa-circle-o text-red"></i> <span>源程序</span></a></li>
      <li><a href="database.html"><i class="fa fa-circle-o text-yellow"></i> <span>数据库备份文件</span></a></li>
      <li><a href="ppt.html"><i class="fa fa-circle-o text-aqua"></i> <span>PPT介绍文稿</span></a></li>

    </ul>
</section>
</aside>

    <!-- ends: Main Menu -->
	<div id="main" style="width: 1200px; height: 515px;"></div>
	<script type="text/javascript">
        var myChart = echarts.init(document.getElementById('main'));

				<%Map<String, Object> info = (Map<String, Object>) request.getAttribute("info");%> 
		var option = {
			title: {
				text: '爬取网站及各领域岗位需求量比例',
				x: 'right',
				subtext:'<%List<String> namelist=(List<String>)info.get("namelist");
				int data[]=(int [])info.get("dataa");
				List<Object> datas=(List<Object>)info.get("datas");
				List<String> company=(List<String>)info.get("company");
				List<String> namel=(List<String>)info.get("namelist");
				List<Integer> datal=null;
				for(int i=0;i<company.size();i++){
					datal=(List<Integer>)datas.get(i);
					out.print(company.get(i)+":"+data[i]+"\\n");
					for(int j=0;j<namel.size();j++){
						out.print(namel.get(j)+':'+ datal.get(j)+"\\n");
					}
				}
				%>'
				,
				<!--	'前程无忧：16\n大数据：4\n开发：4\n运维：4\n测试：4\n智联招聘：12\n大数据：3\n开发：3\n运维：3\n测试：3\n拉勾网：8\n大数据：2\n开发：2\n运维：2\n测试：2\n腾讯招聘：4\n大数据：1\n开发：1\n运维：1\n测试：1\n',-->
				//data: [225, 450, 676, 900],
				//data: [3008, 6016, 9024,12032],
				//data: [7834, 15668, 23501, 31335],
				//data: [115973, 231947, 347920, 463894],
				subtextStyle:{
				    //文字颜色
    			    color:'#ccc',
    			    //字体风格,'normal','italic','oblique'
    			    fontStyle:'normal',
    			    //字体粗细 'normal','bold','bolder','lighter',100 | 200 | 300 | 400...
    			    fontWeight:'bold',
    			    //字体系列
    			    fontFamily:'sans-serif',
    			    //字体大小
　　			　　 fontSize:18

    			}
			},
		    angleAxis: {
		    },
		    radiusAxis: {
		        type: 'category',
		        data: [<%
		               for(int i=0;i<company.size();i++)
		               out.print('\''+(String)company.get(i)+"\',");%>],
		        z: 10
		    },
		    polar: {
		    },
		    series: [
		     <%for(int i=0;i<datas.size();i++){
		     datal=(List<Integer>)datas.get(i);%>
		             {
		       	 	type: 'bar',
						data: [<%for(int j=0;j<datal.size();j++)
						out.print(datal.get(j)+",");%>],
		       		coordinateSystem: 'polar',
		       	 	name: '<%out.print(namel.get(i));%>',
		        		stack: 'a'
		   		 	},
		    <%}%>
		    
		   ],
		   
		  legend: {
		        show: true,
		        data: [<%for(int i=0;i<namel.size();i++)
		        out.print('\''+namel.get(i)+"\', ");%>]
		  }
		};
		

        myChart.setOption(option);
    </script>


	<!--leftsead start-->
<style="height:500px;" >

<div id="leftsead">
    <ul>
        <li><a id="top_btn">
            <img src="../images/ll06.png" width="47" height="49" class="hides"/>
            <img src="../images/l06.png" width="47" height="49" class="shows" />
        </a></li>
        <li><a href="">
            <img src="../images/ll03.png"  width="47" height="49" class="hides"/>
            <img src="../images/l03.png" width="47" height="49" class="shows" />
        </a></li>
        <li><a href="">
            <img src="../images/emails_2.png" width="220" height="49" class="hides"/>
            <img src="../images/emails_1.png" width="47" height="49" class="shows" />
        </a></li>
        <li><a class="youhui">
            <img src="../images/l02.png" width="47" height="49" class="shows" />
            <img src="../images/wechat.png" width="196" height="205" class="hides" usemap="#taklhtml"/>
        </a></li>
    </ul>
</div>
    <!--leftsead end-->


<script type="text/javascript">
$(document).ready(function(){

    $("#leftsead a").hover(function(){
        if($(this).prop("className")=="youhui"){
            $(this).children("img.hides").show();
        }else{
            $(this).children("img.hides").show();
            $(this).children("img.shows").hide();
            $(this).children("img.hides").animate({marginRight:'0px'},'slow');
        }
    },function(){
        if($(this).prop("className")=="youhui"){
            $(this).children("img.hides").hide('slow');
        }else{
            $(this).children("img.hides").animate({marginRight:'-143px'},'slow',function(){$(this).hide();$(this).next("img.shows").show();});
        }
    });

    $("#top_btn").click(function(){if(scroll=="off") return;$("html,body").animate({scrollTop: 0}, 600);});

});
</script>



<script>
    $.sidebarMenu($('.sidebar-menu'))
</script>


</body>
</html>
