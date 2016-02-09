<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
	<title> SringBoard</title>
	<script type="text/javascript" src="/springboard/js/jquery-1.8.0.js" charset="utf-8"></script>
	<script type="text/javascript"> 
		function viewAjaxList() {
			$.ajax({ 
		        type     : "POST"
		    ,   url      : "/springboard/listJson.do"
		    ,   dataType : "json"
		    ,   data     : ""
		    ,   success  : function(result) {
		            $.each(result,function(key) {
		            	var list = result[key];	
		            	
		            	var content = "<table>";	

		            	for( i = 0;i < list.length ;i++) {
		            		content += "<tr>";
		            		content +="<td>" + list[i].no + "</td>";
		            		content +="<td>" + list[i].title + "</td>";
		            		content +="<td>" + list[i].content + "</td>";
		            		content +="</tr>";

		            	}
		            	content += "<table>";

		            	$("#ajaxList").html(content);		            	
		            });
		        }
		    }); 

			
		}
		
	</script>

</head>
<body>
<div id="ajaxList"></div>

<input type="button" value="리스트 가지고 오기" onclick="viewAjaxList() ">

</body>
</html>
