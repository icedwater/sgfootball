// console.log("main.js is loaded");
// $("img").width(200);

$(document).ready(function(){
	// here.

	$("section").on("click", function(){	
		// $("ul", this).toggleClass("hidden");
		$("ul", this).fadeToggle(900);
	});

	$("img").on("dblclick", function(){
		console.log("Just once, that's enough.");
		$("img").width(570);
		$("h1").fadeIn();
		$(".booboo").slideDown();
	});

	$("img").click(function(){
		$("img").width(200);
		$("h1").fadeOut();
		$(".booboo").slideUp();
	});
});
