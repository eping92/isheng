/************************* 首页js ******************************/
if (!INDEX) {
	var INDEX = {};
}

/**
 * 数据请求url
 */
INDEX.url = {
	login: "/login",
	loadRoot: "/loadRoot",
	loadMenu: "/loadMenu"
}

/**
 * 加载顶部根菜单
 * @returns
 */
function loadRootMenu() {
	$.post(INDEX.url.loadRoot, function(data) {
		$("#headerNav").html(data);
	}).fail(function(err) {
		alertErr("用户根菜单加载失败！");
	});
}

/**
 * 加载左侧菜单
 * @returns
 */
function loadMenu() {
	$.post(INDEX.url.loadMenu, function(data) {
		$("#_left").html(data);
	}).fail(function() {
		alertErr("用户菜单加载失败！");
	});
}

/**
 * 菜单点击事件
 * @param obj
 * @returns
 */
function menuClick(obj) {
	$this = $(obj);
	var url = $this.attr("url");
	if (!url) {
		url = "/";
	}
	
	$.post(url, function(data) {
		$("#_right").html(data);
	}).fail(function() {
		alertErr("数据加载失败！");
	});
}

$(function() {
	loadRootMenu();
	loadMenu();
})