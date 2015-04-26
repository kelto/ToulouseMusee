<!DOCTYPE html>
<html lang="fr">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="keltorin">

    <title>Toulouse Musee</title>

    <!-- Bootstrap Core CSS -->
    <asset:stylesheet src="bootstrap.min.css"/>

    <!-- Custom CSS -->
    <asset:stylesheet src="modern-business.css"/>


    <!-- Custom Fonts -->
    <asset:stylesheet src="font-awesome.min.css"/>

</head>

<body>

<!-- Navigation -->
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="{{ path('home') }}">keltorin</a>
        </div>

        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav navbar-right">
                <li>
                    <g:link url="[controller: 'index']">Index</g:link>
                </li>
                <li>
                <g:link url="[controller: 'index']">Visite</a>
            </li>
                <li>
                <g:link url="[controller: 'musee']">Musée</a>
            </li>
            </ul>
        </div>
        <!-- /.navbar-collapse -->
    </div>
    <!-- /.container -->
</nav>

<!-- Page Content -->
<div class="container">
    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">
            </h1>
            <ol class="breadcrumb">
                <li><a href="index.html">Home</a>
                </li>
                <li class="active">Blog Home One</li>
            </ol>
            #}
        </div>
    </div>

    <g:layoutBody/>
    <!-- Footer -->
    <footer>
        <div class="row">
            <div class="col-lg-12">
                <p>opensource website: <a href="https://github.com/kelto/keltorin">keltorin.com</a></p>
            </div>
        </div>
    </footer>

</div>
<!-- /.container -->

<!-- jQuery Version 1.11.0 -->
                    <asset:javascript src="jquery-1.11.0.js" />
                    <asset:javascript src="bootstrap.min.js" />


</body>

</html>
