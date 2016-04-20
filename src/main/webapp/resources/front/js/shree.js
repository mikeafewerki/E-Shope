$(document).ready(function(){
	
})

function addCart(id){
	
	$.ajax({
		url :'http://localhost:8080/eshop/addCart/'+id,
		method:'GET',
		
		dataType:'json',
		success:function(data){
			
		}
	})
}