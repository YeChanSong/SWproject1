<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Starry night KW Flee Market</title>

    <!-- Bootstrap Core CSS -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/vendor/bootstrap/css/bootstrap.min.css">

    <!-- Custom Fonts -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/vendor/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic">
    <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Montserrat:400,700">

    <!-- Theme CSS -->
    <link href="${pageContext.request.contextPath}/resources/css/grayscale.min.css" rel="stylesheet"> <!-- /resources/vendor/bootstrap/css/bootstrap.min.css -->

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body id="page-top" data-spy="scroll" data-target=".navbar-fixed-top">

    <!-- Navigation -->
    <nav class="navbar navbar-custom navbar-fixed-top" role="navigation">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-main-collapse">
                    Menu <i class="fa fa-bars"></i>
                </button>
                <a class="navbar-brand page-scroll" href="#page-top">
                    <i class="fa fa-play-circle"></i> <span class="light">Top of</span> KW FLEE Market
                </a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse navbar-right navbar-main-collapse">
                <ul class="nav navbar-nav">
                    <!-- Hidden li included to remove active class from about link when scrolled up past about section -->
                    <li class="hidden">
                        <a href="#page-top"></a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#Representation">Market INFO</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#buyer">Accuse & Free Talk</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#Seller">Buy and Sell</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>

    <!-- Intro Header -->
    <header class="intro">
        <div class="intro-body">
            <div class="container">
                <div class="row">
                    <div class="col-md-8 col-md-offset-2">
                        <h1 class="brand-heading">KW Flee Market</h1>
                        <p class="intro-text">There is everything except nothing.
                            <br>광운 장터에 오신것을 환영합니다.</p>
                        <a href="#Representation" class="btn btn-circle page-scroll">
                            <i class="fa fa-angle-double-down animated"></i>
                        </a>
                    </div>
                </div>
            </div>
        </div>
    </header>

    <!-- Representation Section -->
    <section id="Representation" class="container content-section text-center">
        <div class="row">
            <div class="col-lg-8 col-lg-offset-2">
                <h2>KW FLEE Market은</h2>
                <p>학우들이 서로 필요한, 필요없는 물건을 사고 파는 벼룩시장입니다!</p>
            </div>
        </div>
    </section>

    <!-- Buyer Section -->
    <section id="buyer" class="content-section text-center">
        <div class="buyer-section"> 
            <div class="container">
                <div class="col-lg-8 col-lg-offset-2">
                    <h2>신고 / 자유 게시판</h2>
                    <a href="http://localhost:8080/board/accuse" class="btn btn-default btn-lg">신고 게시판</a>
                    <p>사기꾼 신고 게시판</p>
                    <a href="http://localhost:8080/board/freetalk" class="btn btn-default btn-lg">자유게시판</a>
                    <p>자유 게시판</p>
                </div>
               
            </div>
        </div>
    </section>

    <!-- Seller Section -->
    <section id="Seller" class="container content-section text-center">
        <div class="row">
            <div class="col-lg-8 col-lg-offset-2">
                <h2>구매 / 판매 / 후기 게시판</h2>
                <ul class="list-inline banner-social-buttons">
                    <li>
                        <a href="http://localhost:8080/board/purchase" class="btn btn-default btn-lg"><span class="network-name">구매 게시판</span></a>
                    </li>
                    <li>
                        <a href="http://localhost:8080/board/sell" class="btn btn-default btn-lg"><span class="network-name">판매 게시판</span></a>
                    </li>
                    <li>
                        <a href="http://localhost:8080/board/after" class="btn btn-default btn-lg"><span class="network-name">후기 게시판</span></a>
                    </li>
                </ul>
            </div>
        </div>
    </section>

    <!-- Map Section -->
 	 
 	 
 	 <section id="Map" class="container content-section text-center">
        <div class="row">
            <div class="col-lg-8 col-lg-offset-2">
                <h2>KW FLEE Market 오픈 장소</h2>
            </div>
        </div>
    </section>
 	 
 	
 	 
 	<style>
		#map {
  	      width: 100%;
  	      height: 400px;
 	       background-color: grey;
 	     }
	</style>
	
	
	
 	
 	
    <div id="map"></div>

    <!-- Footer -->
    <footer>
        <div class="container text-center">
            <p>Copyright &copy; SP_Project_3 by 5 Company</p>
        </div>
    </footer>

    <!-- jQuery -->
    <script src="/resources/vendor/jquery/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="/resources/vendor/bootstrap/js/bootstrap.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>

    <!-- Google Maps API Key - Use your own API key to enable the map feature. More information on the Google Maps API can be found at https://developers.google.com/maps/ -->
    <script async defer src="https://maps.googleapis.com/maps/api/js?key=AIzaSyD5InjPbHJL1X_i3Aatl71jDb_W7fo8T9g&callback=initMap"></script>
	
	<script>
		function initMap() { 
    	    var latVal = 37.619504; 
   	    	var lngVal = 127.059951;
    	    var mapLocation = {lat: latVal, lng: lngVal}; 
    	    
    	    var map = new google.maps.Map(document.getElementById('map'), { 
                zoom: 18, 
                center: mapLocation
              });

    	    var mapOptions = {
                    center: mapLocation, 
                    zoom: 18, 
                    mapTypeId: google.maps.MapTypeId.ROADMAP
                  };
                  var map = new google.maps.Map(document.getElementById("map"), 
                      mapOptions);

			var marker = new google.maps.Marker({
				position: mapLocation,
				title: "KWU"
			});		

    	    marker.setMap(map);
    	    
		}
    	    
    	    
	</script>
	
    <!-- Theme JavaScript -->
    <script src="/resources/js/grayscale.min.js"></script>

</body>

</html>
