$(document).ready(function(){
  $(".btn2").click(function(){
	  $.ajax({
		    url:$('#url').val(),
		    type:'GET', //GET
		    async:false,    //或false,是否异步
		    data:{
		        name:'yang',age:25
		    },
		    timeout:5000,    //超时时间
		    dataType:'html',    //返回的数据格式：json/xml/html/script/jsonp/text
		    beforeSend:function(xhr){
		        console.log(xhr)
		        console.log('发送前')
		    },
		    success:function(data,textStatus,jqXHR){
		    	console.log(data);
		    },
		    error:function(xhr,textStatus){
		        console.log('错误')
		        console.log(xhr)
		        console.log(textStatus)
		    },
		    complete:function(){
		        console.log('结束')
		    }
		})
  });
});