<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Admin Panel</title>

<link rel="stylesheet" href="css/layout.css" type="text/css"
	media="screen" />
<!--[if lt IE 9]>
		<link rel="stylesheet" href="css/ie.css" type="text/css" media="screen" />
		<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
	<![endif]-->
<script src="js/jquery-1.5.2.min.js" type="text/javascript"></script>
<script src="js/hideshow.js" type="text/javascript"></script>
<script src="js/jquery.tablesorter.min.js" type="text/javascript"></script>
<script type="text/javascript" src="js/jquery.equalHeight.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$(".tablesorter").tablesorter();
	});
	$(document).ready(function() {

		//When page loads...
		$(".tab_content").hide(); //Hide all content
		$("ul.tabs li:first").addClass("active").show(); //Activate first tab
		$(".tab_content:first").show(); //Show first tab content

		//On Click Event
		$("ul.tabs li").click(function() {

			$("ul.tabs li").removeClass("active"); //Remove any "active" class
			$(this).addClass("active"); //Add "active" class to selected tab
			$(".tab_content").hide(); //Hide all tab content

			var activeTab = $(this).find("a").attr("href"); //Find the href attribute value to identify the active tab + content
			$(activeTab).fadeIn(); //Fade in the active ID content
			return false;
		});

	});
</script>
<script type="text/javascript">
	$(function() {
		$('.column').equalHeight();
	});
</script>
</head>
<body>
	<div id="header">
		<h1 class="site_title">
			<a href="WEB-INF/jsp/index.html">Arcosapt</a>
		</h1>
		<h2 class="section_title">Dashboard</h2>
		<div class="btn_view_site">
			<a href="#">View Site</a>
		</div>

	</div>
	<!-- end of header bar -->

	<div id="secondary_bar">
		<div class="user">
			<p>
				John Doe (<a href="#">3 Messages</a>)
			</p>
			<!-- <a class="logout_user" href="#" title="Logout">Logout</a> -->
		</div>
		<div class="breadcrumbs_container">
			<div class="breadcrumbs">
				<a href="index.html">Website Admin</a>
				<div class="breadcrumb_divider"></div>
				<a class="current">Dashboard</a>
			</div>
		</div>
	</div>
	<!-- end of secondary bar -->

	<div id="sidebar" class="column">
		<form class="quick_search">
			<input type="text" value="Quick Search"
				onFocus="if(!this._haschanged){this.value=''};this._haschanged=true;">
		</form>
		<hr />
		<h3>Content</h3>
		<ul class="toggle">
			<li class="icn_new_article"><a href="#">New Article</a>
			</li>
			<li class="icn_edit_article"><a href="#">Edit Articles</a>
			</li>
			<li class="icn_categories"><a href="#">Categories</a>
			</li>
			<li class="icn_tags"><a href="#">Tags</a>
			</li>
		</ul>
		<h3>Users</h3>
		<ul class="toggle">
			<li class="icn_add_user"><a href="#">Add New User</a>
			</li>
			<li class="icn_view_users"><a href="#">View Users</a>
			</li>
			<li class="icn_profile"><a href="#">Your Profile</a>
			</li>
		</ul>
		<h3>Media</h3>
		<ul class="toggle">
			<li class="icn_folder"><a href="#">File Manager</a>
			</li>
			<li class="icn_photo"><a href="#">Gallery</a>
			</li>
			<li class="icn_audio"><a href="#">Audio</a>
			</li>
			<li class="icn_video"><a href="#">Video</a>
			</li>
		</ul>
		<h3>Admin</h3>
		<ul class="toggle">
			<li class="icn_settings"><a href="#">Options</a>
			</li>
			<li class="icn_security"><a href="#">Security</a>
			</li>
			<li class="icn_jump_back"><a href="#">Logout</a>
			</li>
		</ul>

		<div>
			<hr />
			<p>
				<strong>Copyright &copy; 2011 Website Admin</strong>
			</p>
			<p>
				Theme by <a href="http://www.medialoot.com">MediaLoot</a>
			</p>
		</div>
	</div>
	<!-- end of sidebar -->

	<div id="main" class="column"></div>
</body>
</html>