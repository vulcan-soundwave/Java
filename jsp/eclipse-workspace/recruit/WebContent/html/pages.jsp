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


	<script src="../js/jquery.min.js" type="text/javascript"></script>
	<script src="../js/sidebar-menu.js"></script>
    <script src="../js/bootstrap.min.js"></script>
    <script src="../js/echarts.min.js"></script>
    <script src="../js/china.js"></script>
	

	<script src="../js/jquery-migrate-1.0.0.min.js"></script>
	<script src="../js/jquery-ui-1.10.0.custom.min.js"></script>
	<script src="../js/jquery.ui.touch-punch.js"></script>
	<script src="../js/modernizr.js"></script>
	<script src="../js/jquery.cookie.js"></script>
	<script src='../js/fullcalendar.min.js'></script>
	<script src='../js/jquery.dataTables.min.js'></script>
	<script src="../js/excanvas.js"></script>
	<script src="../js/jquery.flot.js"></script>
	<script src="../js/jquery.flot.pie.js"></script>
	<script src="../js/jquery.flot.stack.js"></script>
	<script src="../js/jquery.flot.resize.min.js"></script>
	<script src="../js/jquery.chosen.min.js"></script>
	<script src="../js/jquery.uniform.min.js"></script>
	<script src="../js/jquery.cleditor.min.js"></script>
	<script src="../js/jquery.noty.js"></script>
	<script src="../js/jquery.elfinder.min.js"></script>
	<script src="../js/jquery.raty.min.js"></script>
	<script src="../js/jquery.iphone.toggle.js"></script>
	<script src="../js/jquery.uploadify-3.1.min.js"></script>
	<script src="../js/jquery.gritter.min.js"></script>
	<script src="../js/jquery.imagesloaded.js"></script>
	<script src="../js/jquery.masonry.min.js"></script>
	<script src="../js/jquery.knob.modified.js"></script>
	<script src="../js/jquery.sparkline.min.js"></script>
	<script src="../js/counter.js"></script>
	<script src="../js/retina.js"></script>
	<script src="../js/custom.js"></script>
                 
	<!-- end: JavaScript-->
		
	<!-- start: Favicon -->
	<link rel="shortcut icon" href="img/favicon.ico">
	<!-- end: Favicon -->
	
	<style>p.indent{ padding-left: 1.8em }</style>
	<style type="text/css">
	.main-sidebar{
	    position: absolute;
	    top: 0;
	    left: 0;
	    height: 1450px;
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

	<!-- start: Header -->
	
		<div class="container-fluid-full">
		<div class="row-fluid">
				

			
			<noscript>
				<div class="alert alert-block span10">
					<h4 class="alert-heading">Warning!</h4>
					<p>You need to have <a href="http://en.wikipedia.org/wiki/JavaScript" target="_blank">JavaScript</a> enabled to use this site.</p>
				</div>
			</noscript>
			
			<!-- start: Content -->
			<div id="content" class="span10">
			
						
			<ul class="breadcrumb">
				<li>
					<i class="icon-home"></i>
					<a href="index.html">&emsp;Home</a> 
					<i class="icon-angle-right"></i>
				</li>
				<li><a href="#">Project Introduce</a></li>
			</ul>

			<div class="row-fluid">
				
				<div class="span7">
					<h1>项目介绍</h1>
					
					<div class="priority high"><span>项目背景</span></div>
					
					<div class="task high">
						<div class="desc">
							<div class="title">

							<p style="color:#000000;margin-left:20pxi;text-indent:50px;">
							2015 年 9 月 5 日，国务院印发《促进大数据发展行动纲要》。
							《纲要》首次从国家层面认定数据是国家基础性战略资源，将大数据行业定位到国家战略层面，
							大数据成为推动经济转型发展的新动力，成为重塑国家竞争优势的新机遇，成为提升政府治理能力的新途径。
							</p>

							</div>
						</div>
						<div class="time">
							<div class="date">Sept 5, 2015</div>
							<div> -</div>
						</div>
					</div>
					<div class="task high last">
						<div class="desc">
							<div class="title">

							<p style="color:#000000;margin-left:20pxi;text-indent:50px;">
							2014年中国大数据产业产值为767亿元，预计2020年可达到8828亿元，
							目前大约有150万的大数据人才缺口，如何紧跟大数据的热潮，首先第一步就是要去学习和掌握大数据的相关知识。
							</p>

							</div>
						</div>
						<div class="time">
							<div class="date">Sept 8, 2014</div>
							<div> -</div>
						</div>
					</div>
					
					<div class="priority medium"><span>实现功能</span></div>
					
					<div class="task medium">
						<div class="desc">
							<div class="title">
							数据爬取			
							<p class="indent">
								实现了智联招聘的爬取，实现了前程无忧的爬取</br>
								实现了腾讯招聘的爬取，实现了拉勾网的爬取
							</p>

							</div>
						</div>
						<div class="time">
							<div class="date">July 20, 2017</div>
							<div> 20 day</div>
						</div>
					</div>
					<div class="task medium">
                        <div class="desc">
                            <div class="title">
                            数据爬取
                            <p class="indent">
							实现了数据的清洗</br>实现了数据的分析
                            </p>

                            </div>
                        </div>
                        <div class="time">
                            <div class="date">July 20, 2017</div>
                            <div> 20 day</div>
                        </div>
                    </div>

					<div class="task medium">
                        <div class="desc">
                            <div class="title">
							数据的可视化
                            <p class="indent">
							实现了图表的可视化，实现了字符云的编写</br>
                            实现了图表与数据库的实时传输</br>
                            实现了网页的整体框架构造
                            实现了web服务器的搭建</br>
                            实现了html动态搭载于服务器上
                            </p>

                            </div>
                        </div>
                        <div class="time">
                            <div class="date">Aug 30, 2017</div>
                            <div> 15 days</div>
                        </div>
                    </div>

					<div class="task medium last">
                        <div class="desc">
                            <div class="title">
                            文档的编写与整理

                            <p class="indent">
                            实现了源代码及说明文档的整理</br>
							实现了技术文档、管理文档、系统说明文档的编写</br>
							实现了ppt的制作，及视频的录制
                            </p>

                            </div>
                        </div>
                        <div class="time">
                            <div class="date">July 20, 2017</div>
                            <div> 20 day</div>
                        </div>
                    </div>

					<div class="priority low"><span>运用技术</span></div>
					
					<div class="task low">
						<div class="desc">
							<div class="title">数据爬取</div>
							
							<p class="indent">
							python语言，scrapy框架</br>MySql数据库
							</p>

						</div>
						<div class="time">
							<div class="date">July 20, 2017</div>
							<div> 20 day</div>
						</div>
					</div>
					<div class="task low">
						<div class="desc">
							<div class="title">数据处理</div>
							<p class="indent">
							C++语言</br>MySQL C Connector</br>MySQL Wrapper(闭源)
							</p>
						</div>
						<div class="time">
							<div class="date">Aug 20, 2017</div>
							<div> 20 day</div>
						</div>
					</div>
					<div class="task low">
						<div class="desc">
							<div class="title">数据的可视化</div>
							<p class="indent">
							HTML, CSS, JavaScript语言</br>JQuery, Bootstrap, ECharts框架
							</p>
						</div>
						<div class="time">
							<div class="date">Aug 30, 2017</div>
							<div> 15 day</div>
						</div>
					</div>
					<div class="task low last">
						<div class="desc">
							<div class="title">文档的编写和整理</div>
							<p class="indent">
							WPS、openoffice
							</p>
						</div>
						<div class="time">
							<div class="date">Jun 1, 2012</div>
							<div> 1 day</div>
						</div>
					</div>
					<div class="common-modal modal fade" id="common-Modal1" tabindex="-1" role="dialog" aria-hidden="true">
						<div class="modal-content">
							<ul class="list-inline item-details">
								<li><a href="#">Admin templates</a></li>
								<li><a href="http://themescloud.org">Bootstrap themes</a></li>
							</ul>
						</div>
					</div>
					<div class="clearfix"></div>		
					
				</div>
				
				<div class="span5 noMarginLeft">
					
					<div class="dark">
					
					<h1>人员分工</h1>
					
					<div class="timeline">
						
					    <div class="timeslot">
					    	
							<div class="task">
					    		<span>
									<span class="type">member name</span>
									<span class="details">
										张莹
									</span>
									<span>
										member task
										<span class="remaining">
                                        智联招聘的爬取</br>
                                        前程无忧的爬取<br>
                                        腾讯招聘的爬取</br>
                                        Mysql的存储</br>
										PPT制作与视频录制</br>
										文档的编写
										</span>	
									</span> 
								</span>
								<div class="arrow"></div>
							</div>							
							<div class="icon">
								<i class="icon-map-marker"></i>
							</div>
							<div class="time">
								17/07/20 - 17/08/10
							</div>	
								
					    </div>
					
						<div class="clearfix"></div>
						
						<div class="timeslot alt">
					    	
							<div class="task">
					    		<span>
									<span class="type">member name</span>
									<span class="details">
										刘桐源
									</span>
									<span>
										member task
										<span class="remaining">
										数据清洗</br>
		                                数据分析</br>
	                                    文档的编写
										</span>	
									</span>
								</span>
								<div class="arrow"></div>
							</div>
							<div class="icon">
								<i class="icon-phone"></i>
							</div>
							<div class="time">
								17/08/20 - 17/09/10
							</div>	
								
					    </div>
					
						<div class="timeslot">
					    	
							<div class="task">
					    		<span>
									<span class="type">member name</span>
									<span class="details">
										邵华
									</span>
									<span>
										member task
										<span class="remaining">
										拉勾网的爬取</br>
										数据的可视化</br>
										网页的整体编写</br>
										文档的编写
										</span>	
									</span> 
								</span>
								<div class="arrow"></div>
							</div>
							<div class="icon">
								<i class="icon-envelope"></i>
							</div>
							<div class="time">
								17/08/30 - 17/09/15
							</div>	
								
					    </div>
					
						<div class="timeslot alt">
					    	
							<div class="task">
					    		<span>
									<span class="type">member name</span>
									<span class="details">
										寻宇星
									</span>
									<span>
										member task
										<span class="remaining">
											文档的编写
										</span>	
									</span> 
								</span>
								<div class="arrow"></div>
							</div>
							<div class="icon">
								<i class="icon-calendar"></i>
							</div>
							<div class="time">
								17/09/5 - 17/09/18
							</div>	
								
					    </div>
					
						<div class="timeslot">
					    	
							<div class="task">
					    		<span>
									<span class="type">member name</span>
									<span class="details">
										乔善宝
									</span>
									<span>
										member task
										<span class="remaining">
											文档的编写
										</span>	
									</span> 
								</span>
								<div class="arrow"></div>
							</div>							
							<div class="icon">
								<i class="icon-map-marker"></i>
							</div>
							<div class="time">
								17/09/5 - 17/09/18
							</div>	
								
					    </div>
					
						
					</div>
				</div>
			</div>	
		</div>
			
       

	</div><!--/.fluid-container-->
	
			<!-- end: Content -->
		</div><!--/#content.span10-->
		</div><!--/fluid-row-->
		
	<div class="modal hide fade" id="myModal">
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal">×</button>
			<h3>Settings</h3>
		</div>
		<div class="modal-body">
			<p>Here settings can be configured...</p>
		</div>
		<div class="modal-footer">
			<a href="#" class="btn" data-dismiss="modal">Close</a>
			<a href="#" class="btn btn-primary">Save changes</a>
		</div>
	</div>
	
	<div class="clearfix"></div>
	
	<!--leftsead start-->
<style="height:1420px;" >

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
