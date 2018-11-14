<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Post</title>
    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.3/css/bootstrap.min.css">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
    <script src="http://code.jquery.com/jquery-latest.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    <script src="http://googledrive.com/host/0B-QKv6rUoIcGeHd6VV9JczlHUjg"></script><!-- holder.js link -->
    <link type="text/css" rel="stylesheet" href="/resources/css/board.css"/>

</head>

<body>
<!-- Navigation -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
        <a class="navbar-brand" href="#">PostBoard</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive"
                aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="#">Home
                        <span class="sr-only">(current)</span>
                    </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">About</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Services</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Contact</a>
                </li>
                <li id="log-out">
                    <a class="nav-link" href="#">LogOut</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<!-- Page Content -->
<div class="container">

    <!-- Heading Row -->
    <div class="row my-4">

        <div id="myCarousel" class="carousel slide" data-ride="carousel" data-interval="1000">
            <ol class="carousel-indicators">
                <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                <li data-target="#myCarousel" data-slide-to="1" class=""></li>
                <li data-target="#myCarousel" data-slide-to="2" class=""></li>
            </ol>
            <div class="carousel-inner" role="listbox">
                <div class="item active">
                    <%--<img alt="test1">--%>
                    <img src="https://images.unsplash.com/photo-1503485838016-53579610c389?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=2b1c6ac2045430c177f70d08ae4c5b09&auto=format&fit=crop&w=1050&q=80"
                         height="300px">
                </div>
                <div class="item">
                    <%--<img height="300px" lt="test2">--%>
                    <img src="https://images.unsplash.com/photo-1486427944299-d1955d23e34d?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=07df4ad552d3627b7cbc7836321d9a03&auto=format&fit=crop&w=1050&q=80">
                </div>
                <div class="item">
                    <%--<img  height="300px" alt="test3">--%>
                    <img src="https://images.unsplash.com/photo-1514077583608-aedd9ec18c40?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=00120704bddcd3ac000341ad7bbead96&auto=format&fit=crop&w=1050&q=80">
                </div>
            </div>
            <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
                <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
                <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </a>
        </div>
        <hr>
        <div id="myCarousel2" class="carousel slide vertical">

            <div class="carousel-inner" role="listbox">
                <div class="item active">
                    <img data-src="holder.js/1200x500/text:First slide">
                    <div class="carousel-caption">
                    </div>
                </div>
                <div class="item">
                    <img data-src="holder.js/1200x500/text:Second slide">
                    <div class="carousel-caption">
                    </div>
                </div>
                <div class="item">
                    <img data-src="holder.js/1200x500/text:Third slide">
                    <div class="carousel-caption">
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- /.row -->
    <!-- Content Row -->
    <div class="row">
        <div class="col-md-4 mb-4">
            <div class="card h-100">
                <div id="oneDiv" class="card-body">
                    <h2 id="h2cardOne" class="card-title" >Card One</h2>
                    <h4 id="h4cardOne" class="card-content">card Test</h4>
                </div>
            </div>
        </div>
        <!-- /.col-md-4 -->
        <div class="col-md-4 mb-4">
            <div class="card h-100">
                <div class="card-body">
                    <h2 id="h2cardTwo" class="card-title">Card Two</h2>
                    <h4 id="h4cardTwo" class="card-content">card two</h4>
                </div>
            </div>
        </div>
        <!-- /.col-md-4 -->
        <div class="col-md-4 mb-4">
            <div class="card h-100">
                <div class="card-body">
                    <h2 id="h2cardThree" class="card-title">Card Three</h2>
                    <h4 id="h4cardThree" class="card-content">card three</h4>
                </div>
            </div>
            <!-- /.col-md-4 -->

        </div>
        <!-- /.row -->

    </div>
    <!-- /.container -->

    <!-- Footer -->
    <%--<footer class="py-5 bg-dark" id="footer">--%>
        <input type="submit" id="writeBtn" value="Write a post"/>
        <!-- /.container -->
    <%--</footer>--%>

    <!-- Bootstrap core JavaScript -->
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.bundle.min.js"></script>
    <script src="https://gitcdn.github.io/bootstrap-toggle/2.2.2/js/bootstrap-toggle.min.js"></script>
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.5/jquery.min.js"></script>
    <script src="/resources/js/board.js"></script>
</div>
</body>

</html>
