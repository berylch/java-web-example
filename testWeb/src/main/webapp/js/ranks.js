$(document).ready(function(){
//	$('#ad_novels').on('beforeshow',function(e){
//		alert(1)
//	});
	Date.prototype.format = function(fmt) { 
	     var o = { 
	        "M+" : this.getMonth()+1,                 //月份 
	        "d+" : this.getDate(),                    //日 
	        "h+" : this.getHours(),                   //小时 
	        "m+" : this.getMinutes(),                 //分 
	        "s+" : this.getSeconds(),                 //秒 
	        "q+" : Math.floor((this.getMonth()+3)/3), //季度 
	        "S"  : this.getMilliseconds()             //毫秒 
	    }; 
	    if(/(y+)/.test(fmt)) {
	            fmt=fmt.replace(RegExp.$1, (this.getFullYear()+"").substr(4 - RegExp.$1.length)); 
	    }
	     for(var k in o) {
	        if(new RegExp("("+ k +")").test(fmt)){
	             fmt = fmt.replace(RegExp.$1, (RegExp.$1.length==1) ? (o[k]) : (("00"+ o[k]).substr((""+ o[k]).length)));
	         }
	     }
	    return fmt; 
	}
	
	window.basePath = getBasePath();
    
//	$.ajax({
//		  type: "POST",
//		  url: window.basePath + "/rank.htm",
//		  dataType: "json",
//		  success: function(data, textStatus, jqXHR){
////			  var obj = jQuery.parseJSON(data.root);
////			  console.log(data.root[0].name);
//			  createNovelTable(data.root,$('#ad_novels'));
//		  }
//		});


	function getBasePath(){
	    //获取当前网址，如： http://localhost:8080/ems/Pages/Basic/Person.jsp
	    var curWwwPath = window.document.location.href;
	    //获取主机地址之后的目录，如： /ems/Pages/Basic/Person.jsp
	    var pathName = window.document.location.pathname;
	    var pos = curWwwPath.indexOf(pathName);
	    //获取主机地址，如： http://localhost:8080
	    var localhostPath = curWwwPath.substring(0, pos);
	    //获取带"/"的项目名，如：/ems
	    var projectName = pathName.substring(0, pathName.substr(1).indexOf('/') + 1);
	    //获取项目的basePath   http://localhost:8080/ems/
	    var basePath=localhostPath+projectName+"/";
	    return basePath;
	};
	
	function createNovelTable(root,target){
		console.log(root);
		var tbody = target.find('tbody');
//		console.log(tbody);
		for(var i=0;i<root.length;i++) {
			var t = new Date(root[i].last_update).format("yyyy-MM-dd hh:mm:ss");;
			console.log(t);
			tbody.append('<tr><td>'+root[i].name+'</td><td>'+root[i].type
					+'</td><td>'+root[i].author+'</td><td>'+root[i].words
					+'</td><td>'+root[i].state+'</td><td>'+t+'</td><td>最新章节002</td></tr>');
		}
	}
});