<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Gramos - Admin Dashboard</title>

    <!-- begin::global styles -->
    <link rel="stylesheet" href="/shop2/assets/vendors/bundle.css" type="text/css">
    <!-- end::global styles -->

    <!-- begin::datepicker -->
    <link rel="stylesheet" href="/shop2/assets/vendors/datepicker/daterangepicker.css">
    <!-- begin::datepicker -->

    <!-- begin::vmap -->
    <link rel="stylesheet" href="/shop2/assets/vendors/vmap/jqvmap.min.css">
    <!-- begin::vmap -->

    <!-- begin::custom styles -->
    <link rel="stylesheet" href="/shop2/assets/css/app.css" type="text/css">
    <link rel="stylesheet" href="/shop2/assets/css/custom.css" type="text/css">
    <!-- end::custom styles -->

</head>
<body>

<!-- begin::page loader-->
<div class="page-loader">
    <div class="spinner-border"></div>
    <span>Loading ...</span>
</div>
<!-- end::page loader -->

<!-- begin::sidebar -->
<div class="sidebar">
    <ul class="nav nav-pills nav-justified m-b-30" id="pills-tab" role="tablist">
        <li class="nav-item">
            <a class="nav-link" id="notifications-tab" data-toggle="pill" href="#notifications" role="tab"
               aria-controls="notifications" aria-selected="false">
                <i class="fa fa-bell"></i>
            </a>
        </li>
        <li class="nav-item">
            <a class="nav-link" id="settings-tab" data-toggle="pill" href="#settings" role="tab"
               aria-controls="settings" aria-selected="false">
                <i class="ti-settings"></i>
            </a>
        </li>
    </ul>
    <div class="tab-content" id="pills-tabContent">
        <div class="tab-pane" id="notifications" role="tabpanel" aria-labelledby="notifications-tab">
            <div class="tab-pane-body">
                <h5 class="font-weight-bold m-b-20">Notifications</h5>
                <div>
                    <p class="text-muted">Today</p>
                    <ul class="list-group list-group-flush m-b-10">
                        <li class="list-group-item d-flex p-l-r-0">
                            <div>
                                <figure class="avatar avatar-xs m-r-10">
                                    <span class="avatar-title bg-success rounded-circle">A</span>
                                </figure>
                            </div>
                            <div>
                                <p class="m-b-0">
                                    <span class="badge small badge-danger">New</span>
                                    New user registration.
                                </p>
                                <ul class="list-inline small">
                                    <li class="list-inline-item text-muted">8 minute ago</li>
                                    <li class="list-inline-item">
                                        <a href="#">Mark Read</a>
                                    </li>
                                    <li class="list-inline-item">
                                        <a href="#">View</a>
                                    </li>
                                </ul>
                            </div>
                        </li>
                        <li class="list-group-item d-flex p-l-r-0">
                            <div>
                                <figure class="avatar avatar-xs m-r-10">
                                    <span class="avatar-title rounded-circle">
                                        <i class="fa fa-cloud-upload"></i>
                                    </span>
                                </figure>
                            </div>
                            <div>
                                <p class="m-b-0">Files uploaded successfully.</p>
                                <ul class="list-inline small">
                                    <li class="list-inline-item text-muted">50 minute ago</li>
                                    <li class="list-inline-item">
                                        <a href="#">Mark Read</a>
                                    </li>
                                    <li class="list-inline-item">
                                        <a href="#">View</a>
                                    </li>
                                </ul>
                            </div>
                        </li>
                    </ul>
                </div>
                <div>
                    <p class="text-muted">Yesterday</p>
                    <ul class="list-group list-group-flush m-b-10">
                        <li class="list-group-item d-flex p-l-r-0">
                            <div>
                                <figure class="avatar avatar-xs m-r-10">
                                    <span class="avatar-title bg-warning rounded-circle">V</span>
                                </figure>
                            </div>
                            <div>
                                <p class="m-b-0">New user registration.</p>
                                <ul class="list-inline small">
                                    <li class="list-inline-item text-muted">5 hours ago</li>
                                    <li class="list-inline-item">
                                        <a href="#">Mark Read</a>
                                    </li>
                                    <li class="list-inline-item">
                                        <a href="#">View</a>
                                    </li>
                                </ul>
                            </div>
                        </li>
                        <li class="list-group-item d-flex p-l-r-0">
                            <div>
                                <figure class="avatar avatar-xs m-r-10">
                                    <span class="avatar-title rounded-circle">
                                        <i class="fa fa-file-o"></i>
                                    </span>
                                </figure>
                            </div>
                            <div>
                                <p class="m-b-0">Your invoice prepared.</p>
                                <ul class="list-inline small">
                                    <li class="list-inline-item text-muted">10 hours ago</li>
                                    <li class="list-inline-item">
                                        <a href="#">Mark Read</a>
                                    </li>
                                </ul>
                            </div>
                        </li>
                        <li class="list-group-item d-flex p-l-r-0">
                            <div>
                                <figure class="avatar avatar-xs m-r-10">
                                    <span class="avatar-title rounded-circle">
                                        <i class="fa fa-cloud-upload"></i>
                                    </span>
                                </figure>
                            </div>
                            <div>
                                <p class="m-b-0">Files uploaded successfully.</p>
                                <ul class="list-inline small">
                                    <li class="list-inline-item text-muted">16 hours ago</li>
                                    <li class="list-inline-item">
                                        <a href="#">Mark Read</a>
                                    </li>
                                    <li class="list-inline-item">
                                        <a href="#">View</a>
                                    </li>
                                </ul>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
            <div class="tab-pane-footer">
                <a href="#" class="btn btn-primary btn-block">Mark All Read</a>
            </div>
        </div>
        <div class="tab-pane" id="settings" role="tabpanel" aria-labelledby="settings-tab">
            <div class="tab-pane-body">
                <div class="m-b-30">
                    <h5 class="font-weight-bold m-b-20">Settings</h5>
                    <h6 class="font-weight-bold">System</h6>
                    <ul class="list-group list-group-flush">
                        <li class="list-group-item d-flex justify-content-between p-l-r-0">
                            <span>Automatic updates</span>
                            <div class="custom-control custom-switch">
                                <input type="checkbox" class="custom-control-input" id="customSwitch1" checked>
                                <label class="custom-control-label" for="customSwitch1"></label>
                            </div>
                        </li>
                        <li class="list-group-item d-flex justify-content-between p-l-r-0">
                            <span>Current statistics</span>
                            <div class="custom-control custom-switch">
                                <input type="checkbox" class="custom-control-input" id="customSwitch2" checked>
                                <label class="custom-control-label" for="customSwitch2"></label>
                            </div>
                        </li>
                        <li class="list-group-item d-flex justify-content-between p-l-r-0">
                            <span>User suggestions</span>
                            <div class="custom-control custom-switch">
                                <input type="checkbox" class="custom-control-input" id="customSwitch3" checked>
                                <label class="custom-control-label" for="customSwitch3"></label>
                            </div>
                        </li>
                    </ul>
                </div>
                <div class="m-b-30">
                    <h6 class="font-weight-bold">Accout</h6>
                    <ul class="list-group list-group-flush">
                        <li class="list-group-item d-flex justify-content-between p-l-r-0">
                            <span>Senior account security</span>
                            <div class="custom-control custom-switch">
                                <input type="checkbox" class="custom-control-input" id="customSwitch4">
                                <label class="custom-control-label" for="customSwitch4"></label>
                            </div>
                        </li>
                        <li class="list-group-item d-flex justify-content-between p-l-r-0">
                            <span>Account protection</span>
                            <div class="custom-control custom-switch">
                                <input type="checkbox" class="custom-control-input" id="customSwitch5" checked>
                                <label class="custom-control-label" for="customSwitch5"></label>
                            </div>
                        </li>
                    </ul>
                </div>
                <div class="m-b-30">
                    <h6 class="font-weight-bold">Notifications</h6>
                    <ul class="list-group list-group-flush">
                        <li class="list-group-item d-flex justify-content-between p-l-r-0">
                            <span>Browser notifications</span>
                            <div class="custom-control custom-switch">
                                <input type="checkbox" class="custom-control-input" id="customSwitch6">
                                <label class="custom-control-label" for="customSwitch6"></label>
                            </div>
                        </li>
                        <li class="list-group-item d-flex justify-content-between p-l-r-0">
                            <span>Mobile notifications</span>
                            <div class="custom-control custom-switch">
                                <input type="checkbox" class="custom-control-input" id="customSwitch7">
                                <label class="custom-control-label" for="customSwitch7"></label>
                            </div>
                        </li>
                        <li class="list-group-item d-flex justify-content-between p-l-r-0">
                            <span>Email subscription</span>
                            <div class="custom-control custom-switch">
                                <input type="checkbox" class="custom-control-input" id="customSwitch8">
                                <label class="custom-control-label" for="customSwitch8"></label>
                            </div>
                        </li>
                        <li class="list-group-item d-flex justify-content-between p-l-r-0">
                            <span>Sms notifications</span>
                            <div class="custom-control custom-switch">
                                <input type="checkbox" class="custom-control-input" id="customSwitch9" checked>
                                <label class="custom-control-label" for="customSwitch9"></label>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
            <div class="tab-pane-footer">
                <a href="#" class="btn btn-primary btn-block">Save Settings</a>
            </div>
        </div>
    </div>
</div>
<!-- end::sidebar -->

<!-- begin::side menu -->
<jsp:include page="side-menu.jsp"></jsp:include>
<!-- end::side menu -->

<!-- begin::navbar -->
<nav class="navbar">
    <div class="container-fluid">

        <div class="header-logo">
            <a href="#">
                <img src="/shop2/assets/media/image/light-logo.png" alt="...">
                <span class="logo-text d-none d-lg-block">Gramos</span>
            </a>
        </div>

        <div class="header-body">
            <ul class="navbar-nav">
                <li class="nav-item dropdown d-none d-lg-block">
                    <a href="#" class="nav-link" data-toggle="dropdown">
                        <i class="fa fa-th-large"></i>
                    </a>
                    <div class="dropdown-menu dropdown-menu-big dropdown-menu-nav-grid">
                        <div class="dropdown-menu-title">Quick menu</div>
                        <div class="dropdown-menu-body">
                            <div class="nav-grid">
                                <div class="nav-grid-row">
                                    <a href="#" class="nav-grid-item">
                                        <i class="fa fa-address-book-o"></i>
                                        <span>App</span>
                                    </a>
                                    <a href="#" class="nav-grid-item">
                                        <i class="fa fa-envelope-o"></i>
                                        <span>Mail</span>
                                    </a>
                                </div>
                                <div class="nav-grid-row">
                                    <a href="#" class="nav-grid-item">
                                        <i class="fa fa-sticky-note"></i>
                                        <span>Chat</span>
                                    </a>
                                    <a href="#" class="nav-grid-item">
                                        <i class="fa fa-dashboard"></i>
                                        <span>Dashboard</span>
                                    </a>
                                </div>
                            </div>
                        </div>
                    </div>
                </li>
            </ul>
            <form class="search">
                <div class="input-group">
                    <input type="text" class="form-control" placeholder="Search ..."
                           aria-label="Recipient's username"
                           aria-describedby="button-addon2">
                    <div class="input-group-append">
                        <button class="btn" type="button" id="button-addon2">
                            <i class="fa fa-search"></i>
                        </button>
                    </div>
                </div>
            </form>
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a href="#" class="d-lg-none d-sm-block nav-link search-panel-open">
                        <i class="fa fa-search"></i>
                    </a>
                </li>
                <li class="nav-item dropdown">
                    <a href="#" class="nav-link nav-link-notify" data-toggle="dropdown">
                        <i class="fa fa-envelope"></i>
                    </a>
                    <div class="dropdown-menu dropdown-menu-right dropdown-menu-big">
                        <div class="dropdown-menu-title d-flex justify-content-between">
                            <div>
                                <h6 class="text-uppercase font-size-12 m-b-0">Messages</h6>
                                <small class="font-size-11 opacity-7">1 unread messages</small>
                            </div>
                        </div>
                        <div class="dropdown-menu-body">
                            <ul class="list-group list-group-flush">
                                <a href="#" class="list-group-item d-flex link-1 hide-show-toggler">
                                    <div>
                                        <figure class="avatar avatar-sm m-r-15">
                                            <span class="avatar-title bg-success rounded-circle">M</span>
                                        </figure>
                                    </div>
                                    <div class="flex-grow-1">
                                        <h6 class="m-b-0 d-flex justify-content-between">
                                            Malanie Hanvey
                                            <i title="Read Mark" data-toggle="tooltip"
                                               class="hide-show-toggler-item fa fa-check font-size-11"></i>
                                        </h6>
                                        <span class="text-muted m-r-10 small">PM 08:50</span>
                                        <span class="text-muted small">Have you mad...</span>
                                    </div>
                                </a>
                                <a href="#" class="list-group-item d-flex link-1 bg-light hide-show-toggler">
                                    <div>
                                        <figure class="avatar avatar-sm m-r-15">
                                            <span class="avatar-title bg-primary rounded-circle">TB</span>
                                        </figure>
                                    </div>
                                    <div class="flex-grow-1">
                                        <h6 class="m-b-0 d-flex justify-content-between">
                                            Kenneth Hune
                                            <i title="Read Mark" data-toggle="tooltip"
                                               class="hide-show-toggler-item fa fa-circle-o font-size-11"></i>
                                        </h6>
                                        <span class="text-muted m-r-10 small">PM 10:23</span>
                                        <span class="text-muted small">I have a meetin...</span>
                                    </div>
                                </a>
                                <a href="#" class="list-group-item d-flex align-items-center link-1 hide-show-toggler">
                                    <div>
                                        <figure class="avatar avatar-sm m-r-15">
                                            <span class="avatar-title bg-danger rounded-circle">M</span>
                                        </figure>
                                    </div>
                                    <div class="flex-grow-1">
                                        <h6 class="m-b-0 d-flex justify-content-between">
                                            Kevin added
                                            <i title="Read Mark" data-toggle="tooltip"
                                               class="hide-show-toggler-item fa fa-check font-size-11"></i>
                                        </h6>
                                        <span class="text-muted m-r-10 small">PM 08:50</span>
                                        <span class="text-muted small">Have you mad...</span>
                                    </div>
                                </a>
                                <a href="#" class="list-group-item d-flex align-items-center link-1 hide-show-toggler">
                                    <div>
                                        <figure class="avatar avatar-sm m-r-15">
                                            <span class="avatar-title bg-info rounded-circle">KC</span>
                                        </figure>
                                    </div>
                                    <div class="flex-grow-1">
                                        <h6 class="m-b-0 d-flex justify-content-between">
                                            Katherine Ember
                                            <i title="Read Mark" data-toggle="tooltip"
                                               class="hide-show-toggler-item fa fa-check font-size-11"></i>
                                        </h6>
                                        <span class="text-muted m-r-10 small">PM 20:13</span>
                                        <span class="text-muted small">I have a meetin...</span>
                                    </div>
                                </a>
                            </ul>
                        </div>
                        <div class="dropdown-menu-footer text-right">
                            <ul class="list-inline small">
                                <li class="list-inline-item">
                                    <a href="#">Mark All Read</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </li>
                <li class="nav-item">
                    <a href="#" class="nav-link nav-link-notify sidebar-open" data-sidebar-target="#notifications">
                        <i class="fa fa-bell"></i>
                    </a>
                </li>
                <li class="nav-item dropdown">
                    <a href="#" data-toggle="dropdown">
                        <figure class="avatar avatar-sm avatar-state-success">
                            <img class="rounded-circle" src="/shop2/assets/media/image/avatar.jpg" alt="...">
                        </figure>
                    </a>
                    <div class="dropdown-menu dropdown-menu-right">
                        <a href="profile.html" class="dropdown-item">Profile</a>
                        <a href="#" data-sidebar-target="#settings" class="sidebar-open dropdown-item">Settings</a>
                        <div class="dropdown-divider"></div>
                        <a href="/shop2/login.jsp"  class="text-danger dropdown-item">${admin.aname}  Logout</a>
                    </div>
                </li>
                <li class="nav-item d-lg-none d-sm-block">
                    <a href="#" class="nav-link side-menu-open">
                        <i class="ti-menu"></i>
                    </a>
                </li>
            </ul>
        </div>

    </div>
</nav>
<!-- end::navbar -->

<!-- begin::main content -->
<main class="main-content">

    <div class="container-fluid">

        <!-- begin::page header -->
        <div class="page-header d-md-flex justify-content-between align-items-center">
            <div>
                <h4>Sales</h4>
                <nav aria-label="breadcrumb">
                    <ol class="breadcrumb">
                        <li class="breadcrumb-item"><a href="#">Dashboard</a></li>
                        <li class="breadcrumb-item active" aria-current="page">Sales</li>
                    </ol>
                </nav>
            </div>
            <div>
                <div class="reportrange btn btn-light">
                    <i class="ti-calendar m-r-10"></i>
                    <span></span>
                    <i class="ti-angle-down m-l-10"></i>
                </div>
            </div>
        </div>
        <!-- end::page header -->

        <div class="row">
            <div class="col-md-3">
                <div class="card">
                    <div class="card-body">
                        <div class="d-flex justify-content-between align-items-center">
                            <div>
                                <h6>Conversion Rate</h6>
                                <h4 class="m-b-0 font-weight-bold">
                                    0.32%
                                    <small data-toggle="tooltip" title="Than last week"
                                           class="text-success font-size-11">
                                        1.2%
                                        <i class="ti-arrow-up"></i>
                                    </small>
                                </h4>
                            </div>
                            <div>
                                <span class="pie"
                                      data-peity='{ "fill": ["#5d78ff", "#eeeeee"], "radius": 30 }'>1/5</span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-3">
                <div class="card">
                    <div class="card-body">
                        <div class="d-flex justify-content-between align-items-center">
                            <div>
                                <h6>Unique Purchases</h6>
                                <h4 class="m-b-0 font-weight-bold">
                                    3,137
                                    <small data-toggle="tooltip" title="Than last week"
                                           class="text-danger font-size-11">
                                        0.2%
                                        <i class="ti-arrow-down"></i>
                                    </small>
                                </h4>
                            </div>
                            <div>
                                <span class="pie"
                                      data-peity='{ "fill": ["#0abb87", "#eeeeee"], "radius": 30 }'>226/360</span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-3">
                <div class="card">
                    <div class="card-body">
                        <div class="d-flex justify-content-between align-items-center">
                            <div>
                                <h6>Avg. Order Value</h6>
                                <h4 class="m-b-0 font-weight-bold">
                                    $306.20
                                    <small data-toggle="tooltip" title="Than last week"
                                           class="text-danger font-size-11">
                                        2.1%
                                        <i class="ti-arrow-down"></i>
                                    </small>
                                </h4>
                            </div>
                            <div>
                                <span class="pie"
                                      data-peity='{ "fill": ["#ea4141", "#eeeeee"], "radius": 30 }'>1,4</span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-3">
                <div class="card">
                    <div class="card-body">
                        <div class="d-flex justify-content-between align-items-center">
                            <div>
                                <h6>Order Quantity</h6>
                                <h4 class="m-b-0 font-weight-bold">
                                    1,650
                                    <small data-toggle="tooltip" title="Than last week"
                                           class="text-success font-size-11">
                                        1.2%
                                        <i class="ti-arrow-up"></i>
                                    </small>
                                </h4>
                            </div>
                            <div>
                                <span class="pie" data-peity='{ "fill": ["#3a3f51", "#eeeeee"], "radius": 30 }'>0.52,1.041</span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="col-md-6">
                <div class="card">
                    <div class="card-body">
                        <div class="d-md-flex justify-content-between align-items-start">
                            <div>
                                <h5 class="card-title">Sales Report</h5>
                                <h6 class="card-subtitle">Sales graph of last 7 months</h6>
                            </div>
                            <div class="reportrange btn btn-sm btn-light">
                                <i class="ti-calendar m-r-10"></i>
                                <span></span>
                                <i class="ti-angle-down m-l-10"></i>
                            </div>
                            <div class="d-lg-none d-sm-block m-t-15"></div>
                        </div>
                        <div class="row m-b-20">
                            <div class="col-md-6">
                                <div class="bg-light text-success p-15 text-center m-b-10">
                                    <h4 class="font-weight-bold">$560.234,076</h4>
                                    <h6 class="m-b-0">Total Sales</h6>
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="bg-light text-warning p-15 text-center m-b-10">
                                    <h4 class="font-weight-bold">$620,076</h4>
                                    <h6 class="m-b-0">Average</h6>
                                </div>
                            </div>
                        </div>
                        <canvas id="chartjs_one"></canvas>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-6">
                        <div class="card">
                            <div class="card-header">Total Customers</div>
                            <div class="card-body text-center">
                                <h2 class="text-danger font-weight-bold">700+</h2>
                                <p class="m-b-0">
                                    <i class="fa fa-caret-up text-primary m-r-5"></i> 23% increase in Last week
                                </p>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="card">
                            <div class="card-header">Average Order Value</div>
                            <div class="card-body text-center">
                                <h2 class="text-success font-weight-bold">$32.52</h2>
                                <p class="m-b-0">
                                    <i class="fa fa-caret-down text-danger m-r-5"></i> 4 lead less than last week
                                </p>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="card">
                    <div class="card-header">
                        <i class="fa fa-download text-muted m-r-5"></i>
                        Download your earnings in CSV format
                    </div>
                    <div class="card-body">
                        <p class="text-muted text-center">Open it in a spreadsheet and perform your own
                            calculations, graphing etc. The
                            CSV file contains additional details, such as the buyer location.</p>
                        <div class="row">
                            <div class="col-md-12 d-flex">
                                <div class="reportrange btn btn-outline-primary btn-block">
                                    <i class="ti-calendar m-r-10"></i>
                                    <span></span>
                                    <i class="ti-angle-down m-l-10"></i>
                                </div>
                                <button class="btn btn-success m-l-10">
                                    <i class="fa fa-download"></i>
                                </button>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="card">
                    <div class="card-header d-flex justify-content-between">
                        Sales Channels
                        <ul class="list-inline">
                            <li class="list-inline-item">
                                <a href="#" class="js-card-refresh link-1">
                                    <i class="fa fa-refresh"></i>
                                </a>
                            </li>
                            <li class="list-inline-item">
                                <div class="dropdown">
                                    <a href="#" class="link-1" data-toggle="dropdown" aria-haspopup="true"
                                       aria-expanded="false">
                                        <i class="fa fa-ellipsis-v" aria-hidden="true"></i>
                                    </a>
                                    <div class="dropdown-menu dropdown-menu-right">
                                        <a href="#" class="dropdown-item">Action</a>
                                        <a href="#" class="dropdown-item">Another action</a>
                                        <a href="#" class="dropdown-item">Something else here</a>
                                    </div>
                                </div>
                            </li>
                        </ul>
                    </div>
                    <div class="card-body">
                        <div class="m-b-30">
                            <div class="position-relative d-flex align-items-center justify-content-center">
                                <span class="pie"
                                      data-peity='{ "fill": ["#00bcd4", "#eeeeee"], "radius": 60 }'>65/100</span>
                                <div class="m-l-15">
                                    <div class="d-flex align-items-center">
                                        <h6 class="m-r-10 text-muted">Average</h6>
                                        <h3 class="m-b-0 font-weight-bold">65%</h3>
                                    </div>
                                    <p class="text-muted m-b-0">Lorem ipsum dolor sit amet, consectetur adipisicing
                                        elit. Dicta iusto magni modi vel.</p>
                                </div>
                            </div>
                        </div>
                        <div class="mb-4">
                            <h6>Google</h6>
                            <div class="d-flex align-items-center">
                                <div class="progress flex-grow-1" style="height: 5px">
                                    <div class="progress-bar bg-google" role="progressbar" style="width: 42%;"
                                         aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"></div>
                                </div>
                                <span class="small m-l-10">42%</span>
                            </div>
                        </div>
                        <div class="mb-4">
                            <h6>Instagram</h6>
                            <div class="d-flex align-items-center">
                                <div class="progress flex-grow-1" style="height: 5px">
                                    <div class="progress-bar bg-instagram" role="progressbar" style="width: 34%;"
                                         aria-valuenow="72" aria-valuemin="0" aria-valuemax="100"></div>
                                </div>
                                <span class="small m-l-10">34%</span>
                            </div>
                        </div>
                        <div class="mb-4">
                            <h6>Whatsapp</h6>
                            <div class="d-flex align-items-center">
                                <div class="progress flex-grow-1" style="height: 5px">
                                    <div class="progress-bar bg-whatsapp" role="progressbar" style="width: 60%;"
                                         aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"></div>
                                </div>
                                <span class="small m-l-10">60%</span>
                            </div>
                        </div>
                        <div>
                            <h6>Facebook</h6>
                            <div class="d-flex align-items-center">
                                <div class="progress flex-grow-1" style="height: 5px">
                                    <div class="progress-bar bg-facebook" role="progressbar" style="width: 20%;"
                                         aria-valuenow="52" aria-valuemin="0" aria-valuemax="100"></div>
                                </div>
                                <span class="small m-l-10">20%</span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-6">
                <div class="card">
                    <div class="card-body">
                        <div class="d-flex justify-content-between">
                            <div>
                                <h5 class="card-title">Regional Sales</h5>
                                <h6 class="card-subtitle">Graph of total sales of regions. Total and returned
                                    sales.</h6>
                            </div>
                            <div>
                                <div class="btn-group">
                                    <button class="btn btn-light btn-sm active">Yearly</button>
                                    <button class="btn btn-light btn-sm">Monthly</button>
                                </div>
                            </div>
                        </div>
                        <canvas id="chartjs_two"></canvas>
                        <div class="row text-center m-t-20">
                            <div class="col-md-4 m-t-20">
                                <h4 class="font-weight-bold text-primary">$34.234,076</h4>
                                <h6 class="m-b-0">Total Sales</h6>
                            </div>
                            <div class="col-md-4 m-t-20">
                                <h4 class="font-weight-bold text-warning">$1.620,076</h4>
                                <h6 class="m-b-0">Average</h6>
                            </div>
                            <div class="col-md-4 m-t-20">
                                <h4 class="font-weight-bold text-danger">$20,076</h4>
                                <h6 class="m-b-0">Return</h6>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="card">
                    <div class="card-header">Product Sales</div>
                    <div class="card-body">
                        <div class="m-b-20 d-flex align-items-center">
                            <div class="icon-block icon-block-outline-success icon-block-floating m-r-10">
                                <i class="fa fa-cube font-size-18"></i>
                            </div>
                            <h2 class="m-0 font-weight-bold">65,353</h2>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <h3 class="m-b-10">
                                    4,324
                                    <small class="text-uppercase font-size-11 m-l-5">Total Price</small>
                                </h3>
                                <div class="progress m-b-10" style="height: 5px;">
                                    <div class="progress-bar" role="progressbar" style="width: 25%;" aria-valuenow="25"
                                         aria-valuemin="0" aria-valuemax="100"></div>
                                </div>
                                <i class="fa fa-caret-up text-success"></i> 10% decrease
                            </div>
                            <div class="col-md-6">
                                <h3 class="m-b-10">
                                    2,214
                                    <small class="text-uppercase font-size-11 m-l-5">Total Stock</small>
                                </h3>
                                <div class="progress m-b-10" style="height: 5px;">
                                    <div class="progress-bar" role="progressbar" style="width: 25%;" aria-valuenow="25"
                                         aria-valuemin="0" aria-valuemax="100"></div>
                                </div>
                                <i class="fa fa-caret-down text-danger"></i> 14% increases
                            </div>
                        </div>
                    </div>
                </div>
                <div class="card">
                    <div class="card-header d-flex justify-content-between">
                        <span>Income Distribution</span>
                        <div class="dropdown">
                            <a class="btn btn-outline-light btn-sm" href="#" data-toggle="dropdown">
                                USA <i class="ti-angle-down m-l-5"></i>
                            </a>
                            <div class="dropdown-menu dropdown-menu-right">
                                <a href="#" class="dropdown-item">USA</a>
                                <a href="#" class="dropdown-item">Germany</a>
                                <a href="#" class="dropdown-item">France</a>
                                <a href="#" class="dropdown-item">Italy</a>
                            </div>
                        </div>
                    </div>
                    <div class="card-body">
                        <div id="vmap_usa_en" class="vmap" style="height: 300px"></div>
                        <div class="table-responsive">
                            <table class="table table-borderless m-b-0">
                                <thead>
                                <tr>
                                    <th class="wd-40">States</th>
                                    <th class="wd-25 text-right">Orders</th>
                                    <th class="wd-35 text-right">Earnings</th>
                                </tr>
                                </thead>
                                <tbody>
                                <tr>
                                    <td class="tx-medium">California</td>
                                    <td class="text-right">12,201</td>
                                    <td class="text-right text-success">$10,200.80</td>
                                </tr>
                                <tr>
                                    <td class="tx-medium">Texas</td>
                                    <td class="text-right">11,950</td>
                                    <td class="text-right text-success">$138,910.20</td>
                                </tr>
                                <tr>
                                    <td class="tx-medium">Wyoming</td>
                                    <td class="text-right">11,198</td>
                                    <td class="text-right text-success">$32,050.00</td>
                                </tr>
                                <tr>
                                    <td class="tx-medium">Florida</td>
                                    <td class="text-right">9,885</td>
                                    <td class="text-right text-success">$117,762.10</td>
                                </tr>
                                <tr>
                                    <td class="tx-medium">Florida</td>
                                    <td class="text-right">9,885</td>
                                    <td class="text-right text-success">$42,662.40</td>
                                </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="col-md-12">
                <div class="card">
                    <div class="card-body">
                        <div class="d-md-flex justify-content-between">
                            <h5 class="card-title">Your Most Recent Earnings</h5>
                            <div>
                                <div class="reportrange btn btn-light">
                                    <i class="ti-calendar m-r-10"></i>
                                    <span></span>
                                    <i class="ti-angle-down m-l-10"></i>
                                </div>
                                <div class="d-lg-none d-sm-block m-t-15"></div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-8">
                                <div class="row">
                                    <div class="col-md-4">
                                        <div class="d-flex align-items-center m-b-20">
                                            <div class="icon-block m-r-15 icon-block-lg icon-block-outline-success text-success">
                                                <i class="fa fa-bar-chart"></i>
                                            </div>
                                            <div>
                                                <h6>Gross Earnings</h6>
                                                <h4 class="m-b-0 font-weight-bold">$201,958,104</h4>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-4">
                                        <div class="d-flex align-items-center m-b-20">
                                            <div class="icon-block m-r-15 icon-block-lg icon-block-outline-danger  text-danger">
                                                <i class="fa fa-hand-lizard-o"></i>
                                            </div>
                                            <div>
                                                <h6>Tax Withheld</h6>
                                                <h4 class="m-b-0 font-weight-bold">$12,769.00</h4>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-4">
                                        <div class="d-flex align-items-center m-b-20">
                                            <div class="icon-block m-r-15 icon-block-lg icon-block-outline-warning text-warning">
                                                <i class="fa fa-dollar"></i>
                                            </div>
                                            <div>
                                                <h6>Net Earnings</h6>
                                                <h4 class="m-b-0 font-weight-bold">$491,608,469</h4>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="table-responsive">
                            <table class="table m-b-0">
                                <thead>
                                <tr>
                                    <th>Date</th>
                                    <th>Sales Count</th>
                                    <th>Gross Earnings</th>
                                    <th>Tax Withheld</th>
                                    <th>Sales Rate</th>
                                    <th class="text-right">Net Earnings</th>
                                </tr>
                                </thead>
                                <tbody>
                                <tr>
                                    <td>03/15/2018</td>
                                    <td>1,050</td>
                                    <td>+ $32,580.00</td>
                                    <td>- $3,023.10</td>
                                    <td>
                                        <span class="pie" data-peity='{ "fill": ["#5d78ff", "#eeeeee"], "radius": 15 }'>70/100</span>
                                    </td>
                                    <td class="text-right">$28,670.90</td>
                                </tr>
                                <tr>
                                    <td>03/14/2018</td>
                                    <td>780</td>
                                    <td>+ $30,065.10</td>
                                    <td>- $2,780.00</td>
                                    <td>
                                        <span class="pie" data-peity='{ "fill": ["#5d78ff", "#eeeeee"], "radius": 15 }'>40/100</span>
                                    </td>
                                    <td class="text-right">$26,930.40</td>
                                </tr>
                                <tr>
                                    <td>03/13/2018</td>
                                    <td>1.980</td>
                                    <td>+ $30,065.10</td>
                                    <td>- $2,780.00</td>
                                    <td>
                                        <span class="pie" data-peity='{ "fill": ["#5d78ff", "#eeeeee"], "radius": 15 }'>60/100</span>
                                    </td>
                                    <td class="text-right">$22,930.40</td>
                                </tr>
                                <tr>
                                    <td>03/12/2018</td>
                                    <td>300</td>
                                    <td>+ $30,065.10</td>
                                    <td>- $2,780.00</td>
                                    <td>
                                        <span class="pie" data-peity='{ "fill": ["#5d78ff", "#eeeeee"], "radius": 15 }'>18/100</span>
                                    </td>
                                    <td class="text-right">$32,130.40</td>
                                </tr>
                                <tr>
                                    <td>03/11/2018</td>
                                    <td>940</td>
                                    <td>+ $30,065.10</td>
                                    <td>- $2,780.00</td>
                                    <td>
                                        <span class="pie" data-peity='{ "fill": ["#5d78ff", "#eeeeee"], "radius": 15 }'>25/100</span>
                                    </td>
                                    <td class="text-right">$19,230.40</td>
                                </tr>
                                <tr>
                                    <td>03/10/2018</td>
                                    <td>1.280</td>
                                    <td>+ $30,065.10</td>
                                    <td>- $2,780.00</td>
                                    <td>
                                        <span class="pie" data-peity='{ "fill": ["#5d78ff", "#eeeeee"], "radius": 15 }'>78/100</span>
                                    </td>
                                    <td class="text-right">$17,830.40</td>
                                </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="col-md-4">
                <div class="card">
                    <div class="card-header d-flex justify-content-between">
                        New Customers
                        <a href="#" class="js-card-refresh link-1">
                            <i class="fa fa-refresh"></i>
                        </a>
                    </div>
                    <div class="card-body">
                        <ul class="list-group list-group-flush">
                            <li class="list-group-item d-flex align-items-center p-l-r-0">
                                <figure class="avatar avatar-sm avatar-state-success m-r-15">
                                    <span class="avatar-title bg-primary rounded-circle">V</span>
                                </figure>
                                <div>
                                    <h6 class="m-b-0">Valentine Maton</h6>
                                    <small class="text-muted">Engineer</small>
                                </div>
                                <div class="dropdown ml-auto">
                                    <a href="#" data-toggle="dropdown" class="btn btn-primary btn-sm"
                                       aria-haspopup="true" aria-expanded="false">
                                        <i class="fa fa-ellipsis-h" aria-hidden="true"></i>
                                    </a>
                                    <div class="dropdown-menu dropdown-menu-right">
                                        <a href="#" class="dropdown-item">View</a>
                                        <a href="#" class="dropdown-item">Send Message</a>
                                        <a href="#" class="dropdown-item">Assign</a>
                                    </div>
                                </div>
                            </li>
                            <li class="list-group-item d-flex align-items-center p-l-r-0">
                                <figure class="avatar avatar-sm avatar-state-success m-r-15">
                                    <img src="/shop2/assets/media/image/avatar.jpg" class="rounded-circle" alt="image">
                                </figure>
                                <div>
                                    <h6 class="m-b-0">Holmes Cherryman</h6>
                                    <small class="text-muted">Human resources</small>
                                </div>
                                <div class="dropdown ml-auto">
                                    <a href="#" data-toggle="dropdown" class="btn btn-primary btn-sm"
                                       aria-haspopup="true" aria-expanded="false">
                                        <i class="fa fa-ellipsis-h" aria-hidden="true"></i>
                                    </a>
                                    <div class="dropdown-menu dropdown-menu-right">
                                        <a href="#" class="dropdown-item">View</a>
                                        <a href="#" class="dropdown-item">Send Message</a>
                                        <a href="#" class="dropdown-item">Assign</a>
                                    </div>
                                </div>
                            </li>
                            <li class="list-group-item d-flex align-items-center p-l-r-0">
                                <figure class="avatar avatar-sm avatar-state-success m-r-15">
                                    <span class="avatar-title bg-primary rounded-circle">AE</span>
                                </figure>
                                <div>
                                    <h6 class="m-b-0">Malanie Hanvey</h6>
                                    <small class="text-muted">Real estate agent</small>
                                </div>
                                <div class="dropdown ml-auto">
                                    <a href="#" data-toggle="dropdown" class="btn btn-primary btn-sm"
                                       aria-haspopup="true" aria-expanded="false">
                                        <i class="fa fa-ellipsis-h" aria-hidden="true"></i>
                                    </a>
                                    <div class="dropdown-menu dropdown-menu-right">
                                        <a href="#" class="dropdown-item">View</a>
                                        <a href="#" class="dropdown-item">Send Message</a>
                                        <a href="#" class="dropdown-item">Assign</a>
                                    </div>
                                </div>
                            </li>
                            <li class="list-group-item d-flex align-items-center p-l-r-0">
                                <figure class="avatar avatar-sm avatar-state-success m-r-15">
                                    <span class="avatar-title bg-dark rounded-circle">KC</span>
                                </figure>
                                <div>
                                    <h6 class="m-b-0">Kenneth Hune</h6>
                                    <small class="text-muted">Engineer</small>
                                </div>
                                <div class="dropdown ml-auto">
                                    <a href="#" data-toggle="dropdown" class="btn btn-primary btn-sm"
                                       aria-haspopup="true" aria-expanded="false">
                                        <i class="fa fa-ellipsis-h" aria-hidden="true"></i>
                                    </a>
                                    <div class="dropdown-menu dropdown-menu-right">
                                        <a href="#" class="dropdown-item">View</a>
                                        <a href="#" class="dropdown-item">Send Message</a>
                                        <a href="#" class="dropdown-item">Assign</a>
                                    </div>
                                </div>
                            </li>
                            <a href="#" class="list-group-item text-center text-uppercase font-size-11 p-b-0">
                                View All
                            </a>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="col-md-4">
                <div class="card">
                    <div class="card-header d-flex justify-content-between">
                        Users Assigned to Me
                        <a href="#" class="js-card-refresh link-1">
                            <i class="fa fa-refresh"></i>
                        </a>
                    </div>
                    <div class="card-body">
                        <ul class="list-group list-group-flush">
                            <li class="list-group-item d-flex align-items-center p-l-r-0">
                                <figure class="avatar avatar-sm m-r-15">
                                    <span class="avatar-title bg-success rounded-circle">E</span>
                                </figure>
                                <div>
                                    <h6 class="m-b-0">Emma Maton</h6>
                                    <small class="text-muted">Engineer</small>
                                </div>
                                <span class="badge badge-danger ml-auto">Denied</span>
                            </li>
                            <li class="list-group-item d-flex align-items-center p-l-r-0">
                                <figure class="avatar avatar-sm m-r-15">
                                    <span class="avatar-title bg-danger rounded-circle">K</span>
                                </figure>
                                <div>
                                    <h6 class="m-b-0">Kevin Cherryman</h6>
                                    <small class="text-muted">Human resources</small>
                                </div>
                                <span class="badge badge-success ml-auto">Completed</span>
                            </li>
                            <li href="" class="list-group-item d-flex align-items-center p-l-r-0">
                                <figure class="avatar avatar-sm m-r-15">
                                    <span class="avatar-title bg-warning rounded-circle">SA</span>
                                </figure>
                                <div>
                                    <h6 class="m-b-0">Sarah Hanvey</h6>
                                    <small class="text-muted">Real estate agent</small>
                                </div>
                                <span class="badge badge-warning ml-auto">Pending</span>
                            </li>
                            <li href="#" class="list-group-item d-flex align-items-center p-l-r-0">
                                <figure class="avatar avatar-sm m-r-15">
                                    <span class="avatar-title bg-info rounded-circle">T</span>
                                </figure>
                                <div>
                                    <h6 class="m-b-0">Thomas Hune</h6>
                                    <small class="text-muted">Engineer</small>
                                </div>
                                <span class="badge badge-success ml-auto">Completed</span>
                            </li>
                            <a href="#" class="list-group-item text-center text-uppercase font-size-11 p-b-0">
                                View All
                            </a>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="col-md-4">
                <div class="card">
                    <div class="card-header d-flex justify-content-between">
                        Daily Task List
                        <a href="#" class="link-1">
                            <i class="fa fa-refresh"></i>
                        </a>
                    </div>
                    <div class="card-body">
                        <div class="custom-control custom-checkbox-success custom-checkbox todo-item">
                            <input type="checkbox" class="custom-control-input" id="customCheck1">
                            <label class="custom-control-label d-flex justify-content-between" for="customCheck1">Talk
                                to new customers
                                <small class="text-muted font-size-11">13 May 2019</small>
                            </label>
                        </div>
                        <div class="custom-control custom-checkbox-success custom-checkbox-success custom-checkbox todo-item">
                            <input type="checkbox" class="custom-control-input" id="customCheck2" checked>
                            <label class="custom-control-label d-flex justify-content-between" for="customCheck2">Older
                                users will be deleted from
                                the system
                                <small class="text-muted font-size-11">20 Apr 2019</small>
                            </label>
                        </div>
                        <div class="custom-control custom-checkbox-success custom-checkbox todo-item">
                            <input type="checkbox" class="custom-control-input" id="customCheck3">
                            <label class="custom-control-label d-flex justify-content-between" for="customCheck3">Assignment
                                will be
                                completed
                                <small class="text-muted font-size-11">13 May 2019</small>
                            </label>
                        </div>
                        <div class="custom-control custom-checkbox-success custom-checkbox todo-item">
                            <input type="checkbox" class="custom-control-input" id="customCheck4" checked>
                            <label class="custom-control-label d-flex justify-content-between" for="customCheck4">Customer
                                notes
                                <small class="text-muted font-size-11">10 Jan 2018</small>
                            </label>
                        </div>
                        <div class="custom-control custom-checkbox-success custom-checkbox todo-item">
                            <input type="checkbox" class="custom-control-input" id="customCheck5">
                            <label class="custom-control-label d-flex justify-content-between" for="customCheck5">Clear
                                old log records and backup
                                will be taken
                                <small class="text-muted font-size-11">13 May 2019</small>
                            </label>
                        </div>
                        <div class="custom-control custom-checkbox todo-item">
                            <input type="checkbox" class="custom-control-input" id="customCheck6">
                            <label class="custom-control-label d-flex justify-content-between" for="customCheck6">Talk
                                to new customers
                                <small class="text-muted font-size-11">27 Feb 2019</small>
                            </label>
                        </div>
                        <div class="custom-control custom-checkbox-success custom-checkbox todo-item">
                            <input type="checkbox" class="custom-control-input" id="customCheck7" checked>
                            <label class="custom-control-label d-flex justify-content-between" for="customCheck7">Older
                                users will be deleted from
                                the system
                                <small class="text-muted font-size-11">13 May 2019</small>
                            </label>
                        </div>
                    </div>
                </div>
            </div>
        </div>

    </div>

</main>
<!-- end::main content -->

<!-- begin::global scripts -->
<script src="/shop2/assets/vendors/bundle.js"></script>
<!-- end::global scripts -->

<!-- begin::charts -->
<script src="/shop2/assets/vendors/charts/chartjs/chart.min.js"></script>
<script src="/shop2/assets/vendors/charts/peity/jquery.peity.min.js"></script>
<script src="/shop2/assets/js/examples/charts/chartjs.js"></script>
<script src="/shop2/assets/js/examples/charts/peity.js"></script>
<!-- end::charts -->

<!-- begin::daterangepicker -->
<script src="/shop2/assets/vendors/datepicker/daterangepicker.js"></script>
<!-- end::daterangepicker -->

<!-- begin::dashboard -->
<script src="/shop2/assets/js/examples/dashboard.js"></script>
<!-- end::dashboard -->

<!-- begin::vamp -->
<script src="/shop2/assets/vendors/vmap/jquery.vmap.min.js"></script>
<script src="/shop2/assets/vendors/vmap/maps/jquery.vmap.usa.js"></script>
<script src="/shop2/assets/js/examples/vmap.js"></script>
<!-- end::vamp -->

<!-- begin::custom scripts -->
<script src="/shop2/assets/js/custom.js"></script>
<script src="/shop2/assets/js/app.js"></script>
<!-- end::custom scripts -->

</body>
</html>