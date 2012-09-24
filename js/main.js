// console.log("main.js is loaded");
// $("img").width(200);

$(document).ready(function(){
	// here.

	$("section").on("click", function(){	
		$("ul", this).fadeToggle(450);
	});

});
