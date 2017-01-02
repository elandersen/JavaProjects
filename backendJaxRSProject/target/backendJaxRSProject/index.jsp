<html>
<body>
    <h1>Evaluation Project</h1>
    <h2><b>Create Employees</b></h2>
    <form action="../backendJaxRSProject/webapi/employees" method="POST">
        <label for="firstName">First Name</label>
        <input name="firstName"/>
        <label for="middleName">Middle Name</label>
        <input name="middleName"/>
        <label for="lastName">Last Name</label>
        <input name="lastName"/><br/>
        <label for="email">Email</label>
        <input name="email"/>
        <label for="phone">Phone Number</label>
        <input name="phone"/><br/>
        <label for="position">Position Category</label>
        <select name="position">
            <option value="indirect">Indirect</option>
            <option value="direct">Direct</option>
            <option value="manager">Program Manager</option>
            <option value="director">Director</option>
            <option value="executive">Executive</option>
        </select><br/>
        <label for="date">Date Hired</label>
        <input name="date"/><br/>
        <label for="address1">Address 1</label>
        <input name="address1"/><br/>
        <label for="address2">Address 2</label>
        <input name="address2"/><br/>
        <label for="city">City</label>
        <input name="city"/>
        <label for="state">State</label>
        <input name="state"/>
        <label for="zipcode">Zipcode</label>
        <input name="zipcode"/><br/>
        <input type="checkbox" name="activeFlag" value="activeFlag">Active<br/>
        <br/>
        <input type="submit" value="Add Employee" />
    </form>
    <h2><b>Retrieve Employees</b></h2>
    <p><a><b>Get All Employees</b></a>
    <form action="../backendJaxRSProject/webapi/employees/all" method="GET">
        <input type="submit" value="Get All Employees" />
    </form>
    <p><a><b>Get Employee by ID</b></a>
    <form action="../backendJaxRSProject/webapi/employees/getById" method="POST">
        <label for="id">Employee ID</label>
        <input name="id"/>
        <br/>
        <input type="submit" value="Get Employee" />
    </form>
    <p><a><b>Get Employee by Last Name</b></a>
    <form action="../backendJaxRSProject/webapi/employees/getBylastName" method="POST">
        <label for="lastName">Employee Last Name</label>
        <input name="lastName"/>
        <br/>
        <input type="submit" value="Get Employee" />
    </form>
    <h2><b>Update Employees (Tested with Junit)</b></h2>
    <h2><b>Delete Employees (Tested with Junit)</b></h2>
</body>
</html>
