<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="http://localhost:8080/SpringRestAPI/js/jquery-1.7.2.min.js"></script>
<script type="text/javascript">
   function getData()
  {
	var roll=document.getElementById("roll").value;
	alert("kk "+roll);
	$("#ok").empty();
	$.ajax({
	url : "http://localhost:8080/SpringRestAPI/data.do?rol="+roll,
			type : "GET",
			contentType : "application/json",
			dataType : 'json',
			success : function(response){
				
				alert("11 "+response);
				for(var i=0; i<response.length;i++)
					{
				var t="<tr><td>"+response[i].roll+"</td> <td>"+response[i].name+"</td><td>"+response[i].add+"</td> </tr>   ";	
					$('#ok').append(t);
					}
				
				
			},
			 error: function(jqXHR, exception){
				console.log(exception)
			}
		
		
		
		
		
		
		
		
	})
	
	
	
	
	
	
	
	}
</script>
</head>
<body>
<form>
<table border="2" bgcolor="orange">

<tr><td>Roll</td><td>Name</td><td>Add</td></tr>

 
<tr> <td colspan="3"><input type="text" name="roll" id="roll" onblur="getData();">  </td>   </tr>

<tbody id="ok">
</tbody>

</table>
</form>
</body>
</html>