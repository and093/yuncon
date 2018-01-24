$(document).ready(function() {
    "use-strict";

    // Highlight the top nav as scrolling occurs
    $('body').scrollspy({
        target: '.navbar-fixed-top'
    })

    /*Url jumping*/
    $(function() {
        $('a[href*=#]:not([href=#])').click(function() {
            if (location.pathname.replace(/^\//, '') == this.pathname.replace(/^\//, '') && location.hostname == this.hostname) {
                var target = $(this.hash);
                target = target.length ? target : $('[name=' + this.hash.slice(1) + ']');
                if (target.length) {
                    $('html,body').animate({
                        scrollTop: target.offset().top
                    }, 1000);
                    return false;
                }
            }
        });
    });

    // Owl Carousel 幻灯片
//    $(document).ready(function() {
//        $("#owl-demo").owlCarousel({
//
//            navigation: true, // Show next and prev buttons
//            slideSpeed: 300,
//            paginationSpeed: 400,
//            singleItem: true
//
//            // "singleItem:true" is a shortcut for:
//            // items : 1, 
//            // itemsDesktop : false,
//            // itemsDesktopSmall : false,
//            // itemsTablet: false,
//            // itemsMobile : false
//
//        });
//    });

    // Animate and WOW Animation
    var wow = new WOW(
        {
            offset: 50,
            mobile: false,
            live: true
        }
    );
    wow.init();

    // Prettyphoto Installation  图片查看组件
//    $(document).ready(function(){
//        $("a[class^='prettyPhoto']").prettyPhoto();
//    }); 

	var _hmt = _hmt || [];
	(function() {
	  var hm = document.createElement("script");
	  hm.src = "https://hm.baidu.com/hm.js?1ebcd8df65a9d796b492f7aac7468ee3";
	  var s = document.getElementsByTagName("script")[0]; 
	  s.parentNode.insertBefore(hm, s);
	})();
});
