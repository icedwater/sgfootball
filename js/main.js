// console.log("main.js is loaded");
// $("img").width(200);

$(document).ready(function(){
	// Start with only clubs open
	$("ul","section").css("display","none");
	$("ul","#clubs").css("display","block");

	$("section").on("click", function(e){
		e.preventDefault();
		$("ul", "section").fadeOut(150);
		$("ul", this).fadeIn(150);
	});

	$("a","li").on("hover", function(e){
		$("#preview").html($(this).attr('href'));
	});

});
