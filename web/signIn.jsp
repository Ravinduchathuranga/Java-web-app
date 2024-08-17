<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="css/bootstrap.css">
</head>

<body>
    <div class="container vh-100">
        <div class="row">
            <div class="offset-2 col-8 p-5">
                <h1 class="text-center p-3">Sign In</h1>
                <form action="LogIn" method="POST">
                    <div class="row g-2">
                        <div class="col-12">
                            <h5>Mobile</h5>
                            <input type="text" class="form-control" name="mobile">
                        </div>                                          
                        <div class="col-12 d-flex justify-content-center">
                            <button type="submit" class="btn btn-primary">Sign Up</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</body>

</html>