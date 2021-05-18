<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html> 
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">

    <title>ICIN Bank</title>
  </head>
  <body style="background:lightgreen">
  
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
	  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
	    <span class="navbar-toggler-icon"></span>
	  </button>
	  <div class="collapse navbar-collapse" id="navbarTogglerDemo01">
	
	    <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
	      <li class="nav-item active">
	        <a class="nav-link" href="/HomeBackground" target="iframe">Home <span class="sr-only">(current)</span></a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="DepositMoney" target="iframe">Deposit Money</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="WithdrawMoney" target="iframe">Withdraw money</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="UserTransactions?account-number=${user.accountNumber}" target="iframe">Transactions</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="UserBalance?id=${user.id}" target="iframe">Balance</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="TransferFunds" target="iframe">Transfer funds</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="RequestChequeBook" target="iframe">Request cheque books</a>
	      </li>
	    </ul>
	    <% 
	    if(request.getAttribute("user")!=null){
	    %>
	    <span style="align-content: right;padding-right: 10px;">Welcome ${user.name}</span>
	    <ul class="navbar-nav mr-auto mt-2 mt-lg-0" style="align-content: right">
	      <li class="nav-item">
	        <a class="nav-link" href="/">Logout</a>
	      </li>
	    </ul>
	    <% 
	    }
	    else{
	    %>
		<ul class="navbar-nav mr-auto mt-2 mt-lg-0" style="align-content: right">
	      <li class="nav-item">
	        <a class="nav-link" href="UserLogin">User Login</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="#">Admin Login</a>
	      </li>
	    </ul>
	   	<%
	    }
	   	%>    
	  </div>
	</nav>
	<iframe src="HomeBackground" style="height:590px;width:100%;" name="iframe"></iframe>
	
    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: jQuery and Bootstrap Bundle (includes Popper) -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>

    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <!--
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.min.js" integrity="sha384-+YQ4JLhjyBLPDQt//I+STsc9iw4uQqACwlvpslubQzn4u2UU2UFM80nGisd026JF" crossorigin="anonymous"></script>
    -->
  </body>
</html>