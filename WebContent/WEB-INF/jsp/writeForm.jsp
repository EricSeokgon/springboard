<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
	<title> SringBoard</title>
	<script type="text/javascript"> 
		function doSubmit() {
			if(boardFrm.title.value == "") {
				alert("제목을 입력해주세요.");
				return;
			}
			if(boardFrm.content.value == "") {
				alert("내용을 입력해주세요.");
				return;
			}
			
			boardFrm.submit()
		}
		
	</script>

</head>
<table border="1" width="600px" >
<form name="boardFrm" action="writeProc.do" method="post">
<tr>
	<td height="30" width="10%" bgcolor="#dddddd" align="center">
		제목
	</td>
	<td align="left" height="30">				
		<input type="text" size="80" maxLength="150" name="title">
	</td>
</tr>
<tr>
	<td height="30" bgcolor="#dddddd" align="center">
		내용
	</td>
	<td>
		<textarea cols="60" rows="15" name="content"></textarea><br/><br/>
	</td>	
</tr>
<tr>
	<td colspan="2" align="center">
		<input type="button" value="전송" onclick="doSubmit()">
	</td>
	
</tr>
</form>
</table>
</html>
