<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Taco Order</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
    <div class="container mt-5">
        <h2>Order Your Taco</h2>
        <form action="DemoServlet" method="post">
            <div class="form-group">
                <label for="size">Size:</label>
                <select class="form-control" id="size" name="size">
                    <option>Small</option>
                    <option>Medium</option>
                    <option>Large</option>
                </select>
            </div>
            <div class="form-group">
                <label for="Sauces">Sauces:</label>
                <select class="form-control" id="sauceType" name="sauceType">
                    <option>Buffalo Sauce</option>
                    <option>Honey Mustard</option>
                    <option>Spicy</option>
                </select>
            </div>
            <div class="form-group">
                <label>Fillings</label><br>
                <input type="checkbox" name="Fillings" value="Cheese"> Cheese<br>
                <input type="checkbox" name="Fillings" value="Chicken"> Chicken<br>
                <input type="checkbox" name="Fillings" value="Beef"> Beef<br>
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>
</body>
</html>