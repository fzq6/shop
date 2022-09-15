<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Gramos - Admin Dashboard</title>

    <!-- begin::global styles -->
    <link rel="stylesheet" href="/shop2/assets/vendors/bundle.css" type="text/css">
    <!-- end::global styles -->

    <!-- begin::custom styles -->
    <link rel="stylesheet" href="/shop2/assets/css/app.css" type="text/css">
    <!-- end::custom styles -->

</head>
<body class="bg-white h-100-vh p-t-0">

<!-- begin::page loader-->
<div class="page-loader">
    <div class="spinner-border"></div>
    <span>Loading ...</span>
</div>
<!-- end::page loader -->

<div class="p-b-50 d-block d-lg-none"></div>

<div class="container h-100-vh">
    <div class="row align-items-md-center h-100-vh">
        <div class="col-lg-6 d-none d-lg-block">
            <img class="img-fluid" src="/shop2/assets/media/svg/register.svg" alt="...">
        </div>
        <div class="col-lg-4 offset-lg-1">
            <h3>User Register</h3>
            <p>Create a new account</p>
            <form action="/shop2/buser/register" method="post">
                <div class="form-group mb-4">
                    <input type="text" name="bemail" value="${bUser.bemail}" class="form-control form-control-lg" autofocus placeholder="Username">
                </div>
                <div class="form-group mb-4">
                    <input type="password" name="bpwd" value="${bUser.bpwd}" class="form-control form-control-lg" placeholder="Email">
                </div>
				<hr>
				<h3>${message}</h3>
				
                <div class="form-group">
                    <div class="custom-control custom-switch">
                        <input type="checkbox" class="custom-control-input" id="customSwitch" checked="">
                        <label class="custom-control-label" for="customSwitch">I agree to the Terms and Privacy.</label>
                    </div>
                </div>
                <button type="submit" "btn btn-primary btn-lg btn-block btn-uppercase mb-4">Create Account</button>
                <p class="text-right">
                    <a href="#" class="text-underline">Already a user?</a>
                </p>
            </form>
        </div>
    </div>
</div>
</body>

<!-- begin::global scripts -->
<script src="/shop2/assets/vendors/bundle.js"></script>
<!-- end::global scripts -->

<!-- begin::custom scripts -->
<script src="/shop2/assets/js/app.js"></script>
<!-- end::custom scripts -->

</body>
</html>