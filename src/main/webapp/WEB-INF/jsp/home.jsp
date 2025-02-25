<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>BankApp (Home)</title>
		<link rel="stylesheet" href="home.css">
		<script src="functions.js"></script>
	</head>
	<body>
		<!--<jsp:include page="navbar.jsp"/>-->
		<nav>
		    <ul>
		      <li><a href="/">Bank of Beacon</a>
		      <li><a href="/">Home</a></li>
			  <li><a href="/new_account">Create New Account</a></li>
			  <li><a href="/login">Login</a><li>
		    </ul>
		  </nav>
		<div class="hero">
			<div class="hero-overlay"></div>
			<div class="hero-content">
				<h1>Welcome to Your Trusted Bank</h1>
				<h3>Your One Stop Banking Solution</h3>
			</div>
		</div>

		<!-- Products Section -->
		<div class="products">
			<h2>Our Products</h2>
			<div class="card-container">
				<div class="card">
					<img src="images/savings-bg.jpg" alt="Savings Account">
					<h3>Savings Account</h3>
					<p>Secure and flexible savings options for your future.</p>
				</div>
				<div class="card">
					<img src="images/current-bg-2.jpg" alt="Current Account">
					<h3>Current Account</h3>
					<p>Manage your day-to-day transactions with ease.</p>
				</div>
				<div class="card">
					<img src="images/credit-card-bg.jpg" alt="Credit Cards">
					<h3>Credit Cards</h3>
					<p>Enjoy rewards and benefits on every spend.</p>
				</div>
			</div>
		</div>

		<!-- Latest Schemes Section -->
		<div class="schemes">
			<h2>Latest Schemes</h2>
			<div class="scheme-list">
				<div class="scheme">
					<h3>Home Loan Scheme</h3>
					<p>Low interest rates and flexible repayment options for your dream home.</p>
				</div>
				<div class="scheme">
					<h3>Education Loan Scheme</h3>
					<p>Make education affordable with our tailored loan options.</p>
				</div>
				<div class="scheme">
					<h3>Personal Loan Scheme</h3>
					<p>Quick approval process and competitive rates for your personal needs.</p>
				</div>
			</div>
		</div>

		<!-- Quick Links Section -->
		<div class="quick-links">
			<h3>Quick Links</h3>
			<ul>
				<li><a href="/">Home</a></li>
				<li><a href="/about">About Us</a></li>
				<li><a href="#products">Products</a></li>
			</ul>
		</div>
		<script src="home.js"></script>
	</body>
</html>
