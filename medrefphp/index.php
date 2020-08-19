<?php
    
    require_once 'user.php';
    
    $username = "";
    $password = "";
    $email = "";
    $city = "";
    $phone = "";
    
    if(isset($_POST['username'])){
        
        $username = $_POST['username'];
        
    }
    
    if(isset($_POST['email'])){
        
        $email = $_POST['email'];
        
    }

    if(isset($_POST['password'])){
        
        $password = $_POST['password'];
        
    }

    if(isset($_POST['city'])){
        
        $email = $_POST['city'];
        
    }

    if(isset($_POST['phone'])){
        
        $email = $_POST['phone'];
        
    }
    
    $userObject = new User();
    
    // Registration
    
    if(!empty($username) && !empty($email) && !empty($password) && !empty($city) && !empty($phone)){
        
        $hashed_password = md5($password);
        
        $json_registration = $userObject->createNewRegisterUser($username, $email, $hashed_password, $city, $phone);
        
        echo json_encode($json_registration);
        
    }
    
    // Login
    
    if(!empty($username) && !empty($password) && empty($email)){
        
        $hashed_password = md5($password);
        
        $json_array = $userObject->loginUsers($username, $hashed_password);
        
        echo json_encode($json_array);
    }
    ?>