// console.log("main.js is loaded");
// $("img").width(200);

$(document).ready(function(){
	// here.

	$("li").on("click", function(){

		if ($(this).hasClass("done")) {
			$(this).removeClass("done");
		} else {
			$(this).addClass("done");
		}
	});

	$("img").on("dblclick", function(){
		console.log("Just once, that's enough.");
		$("img").width(570);
		$("h1").fadeIn();
		$(".booboo").slideDown();
		$("#rahul").show();
	});

	$("img").click(function(){
		$("img").width(200);
		$("h1").fadeOut();
		$(".booboo").slideUp();
		$("#rahul").hide();
	});
});
