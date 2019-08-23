import React, { Component } from 'react'
import Axios from 'axios'
import './AddUser.css'

export class AddUser extends Component {

  constructor(props) {
    super(props)
    this.state = {
      userId: '',
      userType: '',
      firstName: '',
      lastName: '',
      password: '',
      phoneNo: '',
      email: '',
      //cardValidity: '',
      // address: ''

    }
    this.postAddData = this.postAddData.bind(this);
  }
  openUser(event) {
    this.props.history.push('/AdminHomePage');
    this.props.history.push('/AddUser');
    this.props.history.push('/DeleteUser');
    this.props.history.push('/UpdateUser');
  }
  logoutApp(event) {
    event.preventDefault();
    this.props.history.push('/'); // redirect to home page
  }
  postAddData(event) {
    console.log("postAddData method is called");
    event.preventDefault();
    let accountData = this.state;
    console.log("Account data", accountData);
    //Call the API using Axios and Validate the Employee Login
    Axios.post('http://localhost:9001/addUser', null, {
      params: {
        userId: this.state.userId,
        userType: this.state.userType,
        firstName: this.state.firstName,
        password: this.state.password,
        phoneNo: this.state.phoneNo,
        email: this.state.email
      }
    }).then((response) => {

      console.log(response.data);
      console.log(response.data.statusCode)
      if (response.data.statusCode === 501) {
        this.props.history.push('/AddUser');
      } else {
        console.log("user added successfully");
      }
    }).catch((error) => {
      console.log('Errorrrr', error);
    });
  }

  render() {
    return (
      <div className="add">
        <div className="container" style={{ marginLeft: '500px' }}>
          <a id="a" href="./AdminHomePage">Home</a>
          <div className="row">
            <div className="col-md-6">
              <div className="card">
                <h5 className="card-header ">
                  <legend className="mx-auto " style={{ width: '200px', color: 'aliceblue' }}>User Registration </legend>
                </h5>
                <div className="card-body">
                  <p className="card-text">
                  </p>
                  <form onSubmit={this.postAddData}>
                    <div className="input-group mb-3">
                      <div className="input-group-prepend">
                        <span className="input-group-text" id="basic-addon1">ID</span>
                      </div>
                      <input type="text" id="userId" name="userId" onChange={(event) => { this.setState({ userId: event.target.value }) }} value={this.state.userId} className="form-control" placeholder=" Enter ID" aria-label="ID" aria-describedby="basic-addon1" />
                    </div>


                    <div className="input-group mb-3">
                      <div className="input-group-prepend">
                        <span className="input-group-text" id="basic-addon1">firstName</span>
                      </div>
                      <input type="text" id="firstName" name="firstName" placeholder="firstNamee" onChange={(event) => { this.setState({ firstName: event.target.value }) }} value={this.state.firstName} className="form-control" placeholder=" Enter firstName" aria-label="Password" aria-describedby="basic-addon1" />
                    </div>


                    <div className="input-group mb-3">
                      <div className="input-group-prepend">
                        <span className="input-group-text" id="basic-addon1">lastName</span>
                      </div>
                      <input type="text" id="lastName" name="lastName" placeholder="lastNamee" onChange={(event) => { this.setState({ lastName: event.target.value }) }} value={this.state.lastName} className="form-control" placeholder=" Enter lastName" aria-label="Password" aria-describedby="basic-addon1" />
                    </div>


                    <div className="input-group mb-3">
                      <div className="input-group-prepend">
                        <span className="input-group-text" id="basic-addon1">Password</span>
                      </div>
                      <input type="password" id="password" name="password" placeholder="password" onChange={(event) => { this.setState({ password: event.target.value }) }} value={this.state.password} className="form-control" placeholder=" Enter Password" aria-label="Password" aria-describedby="basic-addon1" />
                    </div>

                    {/* <div className="input-group mb-3">
                      <div className="input-group-prepend">
                        <span className="input-group-text" id="basic-addon1">address</span>
                      </div>
                      
                    </div> */}
                    <div className="input-group mb-3">
                      <div className="input-group-prepend">
                        <span className="input-group-text" id="basic-addon1">Phone Number</span>
                      </div>
                      <input type="number" id="phoneNo" name="phoneNo" onChange={(event) => { this.setState({ phoneNo: event.target.value }) }} value={this.state.phoneNo} className="form-control" placeholder=" Enter Phone number" aria-label="phone number" aria-describedby="basic-addon1" />
                    </div>
                    <div className="input-group mb-3">
                      <div className="input-group-prepend">
                        <span className="input-group-text" id="basic-addon1">email</span>
                      </div>
                      <input type="text" id="email" name="email" onChange={(event) => { this.setState({ email: event.target.value }) }} value={this.state.email} className="form-control" placeholder=" Enter Email" aria-label="email" aria-describedby="basic-addon1" />
                    </div>



                    <div className="input-group mb-3">
                      <div className="input-group-prepend">
                        <label className="input-group-text" htmlFor="inputGroupSelect01">User Type</label>
                      </div>
                      <select className="custom-select" id="userType" name="userType" onChange={(event) => { this.setState({ userType: event.target.value }) }} value={this.state.userType}>
                        <option selected>Choose...</option>
                        <option value="admin">Admin</option>
                        <option value="librarian">Librarian</option>
                        <option value="student">Student</option>
                      </select>
                    </div>
                    <div className=" mx-auto" style={{ width: '150px', marginBottom: '20px' }}>
                      <button type="reset" className="btn btn-outline-primary">Reset</button>
                      <button type="submit" className="btn btn-outline-success">Submit</button>
                    </div>
                    <p />

                  </form>
                </div>


              </div>
            </div>
          </div>
        </div>
      </div>
    )
  }
}

export default AddUser
