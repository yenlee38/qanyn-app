
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="path/to/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="styles/login.css">
    <title>Login form</title>
</head>
<style>
    .login-form{
        background-color: aquamarine;
        display: flex;
        justify-content: center;
        flex-direction: column;
        margin-top: 30vh;
        align-items: center;
        border-radius: 8px;
    }

    .btn-login{
        background-color: aquamarine;

    }

    .screen-main{
        justify-content: center;
        display: flex;
        align-items: center;
    }
    .input-div{
        display: flex;
        justify-content: center;
        flex-direction: column;
        margin: 10px;
    }

    .input-tag{
        margin: 5px;
        padding: 5px;
    }
</style>
<body>
    <div class = "screen-main">
        <form class = "login-form">
            <label>Login</label>
            <div class = "input-div">
                <label>Nhập username:</label>
                <span><i class="fas fa-user"></i></span>
                <input class="input-tag" name = "username" placeholder="Nhập username">
            </div>
            <div class = "input-div">
                <label>Nhập password:</label>
                <span><i class="fas fa-user"></i></span>
                <input class="input-tag" name = "password" placeholder="Nhập password">
            </div>
            <Button type = "submit" class = "btn-login">Login</Button>
        </form>
    </div>
</body>
</html>
