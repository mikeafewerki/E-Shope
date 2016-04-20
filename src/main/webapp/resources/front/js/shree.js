$(document).ready(function(){
	
})

function addCart(id){
	
	$.ajax({
		url :'http://localhost:8080/eshop/addCart/'+id,
		method:'GET',
		
		dataType:'json',
		success:function(data){
			if(data.login==0){
				$('#modal_message').html("Please login to add to cart");
				$('#messageModal').modal('show');
			}
		}
	})
}