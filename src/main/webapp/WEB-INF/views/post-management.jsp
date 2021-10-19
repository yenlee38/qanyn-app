<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Admin home</title>

    <%--    <link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.no-icons.min.css" rel="stylesheet">--%>
    <link href="//netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.css" rel="stylesheet">
    <link
            href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
            rel="stylesheet">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>

<style>
    .content {
        justify-content:center;
        flex-direction: row;
        display: inline-block;
    }

    .table-account{
        display: block;
    }

    .btn {
        display: inline-block;
    }

    .search-div {
        display: inline-block;
    }

    .form-control:focus {
        outline: none !important;
        box-shadow: none !important;
    }

    .form-group {
        display: flex;
        margin-bottom: 0 !important;
        width: 30rem;
    }

    .form-group i {
        position: absolute;
        font-size: 1rem;
        font-weight: 200;
        margin-top: 8px;
        margin-left: 19px;
        color: rgb(194, 193, 193);
    }

    .search-input {
        font-size: 0.8rem;
        color: rgb(43, 41, 41);
    }

    .form-group .form-control {
        border-radius: 50px;
        padding-left: 38px;
        margin-left: 0px;
    }

    .container {
        justify-content: center;
        align-items: center;
        display: flex;
        margin-top: 20px;
    }

    .main_screen {
        display: flex;
        justify-content: center;
        flex-direction: column;

    }

    .table-account {
        margin-top: 20px;
    }

    .txt-input {
        outline: none;
        border-radius: 5px;
        border: solid 1px #aaa;
        padding: 5px;
    }

    .group-input {
        padding: 5px;
        justify-content: center;
        align-items: center;
        display: flex;

    }

</style>

<body>
<div class = "main_screen">
    <%@include file="common/nav-admin.jsp"%>
    <div class = "container">
        <div class = "content">
            <button  class = "btn btn-primary"  data-bs-toggle="modal" data-bs-target="#addnewaccount">Add new post</button>
            <div class = "search-div">
                <div class="d-flex form-group">
                    <i class="fa fa-search icon-search"></i>
                    <input class="form-control search-input"  placeholder="search account management" />
                </div>
            </div>
            <!-- Modal add new post-->
            <div class="modal fade" id="addnewaccount" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <form action="/qanyn/admin/create-post" method="post" class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title" id="exampleModalLabel">Create new post</h5>
                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>
                        <div class="modal-body">
                           <table>
                               <tr>
                                   <th><lable>Title post:</lable></th>
                                   <th><input name = "post_title"/></th>
                               </tr>
                               <tr>
                                   <th><lable>Content post:</lable></th>
                                   <th><textarea name = "content_post"/></th>
                               </tr>
                           </table>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                            <button type="submit" class="btn btn-primary">Save changes</button>
                        </div>
                    </form>
                </div>
            </div>
            <div class = "table-account">

                <!-- Page Heading -->
                <div class="card shadow mb-4">
                    <div class="card-header py-3">
                        <h6 class="m-0 font-weight-bold text-primary">Quản lý tài khoản</h6>
                    </div>
                    <div class="card-body">
                        <div class="table-responsive">
                            <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                <thead>
                                <tr>
                                    <th>Title</th>
                                    <th>Content</th>
                                    <th>Created by</th>
                                    <th>Created At</th>
                                    <th>Updated At</th>
                                    <th>Status</th>
                                    <th>Action</th>
                                </tr>
                                </thead>
                                <tbody>
                                <tr>
                                    <td>Quan 1</td>
                                    <td>Hôm nay mưa lớn nhiều nơi!!</td>
                                    <td>yen</td>
                                    <td>2011/04/25</td>
                                    <td>2011/04/25</td>
                                    <td>Pendding</td>
                                    <td><div class = "">
                                        <a class = "btn btn-primary">Edit</a>
                                        <a class = "btn btn-danger">Delete</a>
                                    </div></td>

                                </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>

            </div>
        </div>
    </div>

</body>

</html>