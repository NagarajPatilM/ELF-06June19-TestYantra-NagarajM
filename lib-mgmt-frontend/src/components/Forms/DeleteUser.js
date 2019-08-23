import React, { Component } from 'react'
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import './Deleteuser.css'
import Axios from 'axios'

export class DeleteUser extends Component {
  constructor(props) {
    super(props);

    this.state = {
      userId: '',
      errorMessage: ''
    }

    this.postLoginData = this.postLoginData.bind(this);
  }
  
  postLoginData(event) {
    console.log("post Login data method called")
    event.preventDefault();
    //let accountData = this.state;
    const {userId} = this.state;
    const loginData = {userId};
    console.log(loginData);
/* 
    if(this.validateLogin(loginData)){ */
      if(true){
        //Call the API using Axios and Validate the user Login
        Axios.post('http://localhost:9001/deactivateUser',null,{
            params:{
              userId:this.state.userId           
               
            }
        }).then((response)=>{
            console.log(response.data);
           console.log(response.data.statusCode)

         
        }).catch((error)=>{
            console.log('Error',error);
        });
    }
}




    render() {
        return (
            <div className="delete">
            <div className="container" style={{marginLeft: '500px'}}>
               <button  id="b" className="btn btn-danger"  ><Link style={{color: 'aliceblue'}} to="./AdminHomePage">Home</Link></button> 
              <div className="row">
                <div className="col-md-6">
                  <div className="card">
                    <h5 className="card-header ">
                      <legend className="mx-auto " style={{width: '200px', color: 'aliceblue'}}>User Removal </legend>
                    </h5>
                    <form onSubmit={this.postLoginData}>
                      <div className="card-body">
                        <p className="card-text">
                        </p><div className="input-group mb-3">
                          <div className="input-group-prepend">
                            <span className="input-group-text" id="basic-addon1">ID</span>
                          </div>
                          <input type="number" onChange={(event)=>{this.setState({userId:event.target.value})}} value={this.state.userId}  className="form-control" placeholder=" Enter ID" aria-label="ID" aria-describedby="basic-addon1" />
                        </div>
                        <div className="input-group mb-3">
                          <div className="input-group-prepend">
                            <span className="input-group-text" id="basic-addon1">Name</span>
                          </div>
                          <input type="text"  className="form-control" placeholder=" Enter Username" aria-label="Username" aria-describedby="basic-addon1" />
                        </div>
                        <div className="input-group mb-3">
                          <div className="input-group-prepend">
                            <label className="input-group-text" htmlFor="inputGroupSelect01">User Type</label>
                          </div>
                          <select className="custom-select" id="userType" name="userType">
                            <option selected>Choose...</option>
                            <option value="admin">Admin</option>
                            <option value="librarian">Librarian</option>
                            <option value="student">Student</option>
                          </select>
                        </div>
                        <p />
                      </div>
                      <div className=" mx-auto" style={{width: '150px', marginBottom: '20px'}}>
                        <button type="reset" className="btn btn-outline-primary">Reset</button>
                        <button type="submit" className="btn btn-outline-success">Submit</button>
                      </div></form>
                  </div>
                </div>
              </div>
            </div>
          </div>
        )
    }
}

export default DeleteUser
