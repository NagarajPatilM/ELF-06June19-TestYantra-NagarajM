import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import React, { Component } from 'react'
import Axios from 'axios'
import './Login.css'
//import { threadId } from 'worker_threads';

export class Login extends Component {
  constructor(props) {
    super(props);

    this.state = {
      userId: '',
      password: '',
      userType:'',
      errorMessage: ''
    }

    this.postLoginData = this.postLoginData.bind(this);
  }
  
  postLoginData(event) {
    event.preventDefault();
    //let accountData = this.state;
    const {userId,password,userType} = this.state;
    const loginData = {userId,password,userType};
/* 
    if(this.validateLogin(loginData)){ */
      if(true){
        //Call the API using Axios and Validate the user Login
        Axios.post('http://localhost:9001/authenticate',null,{
            params:{
              userId:this.state.userId,
                password:this.state.password,
                userType:this.state.userType
            }
        }).then((response)=>{
            console.log(response.data);
            if(response.data.statusCode===201 && loginData.userType==="Admin"){
              this.props.history.push('/AdminHomePage');
            }else if(response.data.statusCode===201 && loginData.userType==="Librarian"){
              this.props.history.push('/LibrarianHomePage');
            }else if(response.data.statusCode===201 && loginData.userType==="Student"){
              this.props.history.push('/StudentHomePage');
            }else{
              this.setState ({
                 userId :'',
                 password :'',
                 userType :''
               })
              this.props.history.push('/');
            }
        }).catch((error)=>{
            console.log('Error',error);
        });
    }
}

validateLogin(loginData){
    let validationSuccess = false;

    if(loginData.userId==="" || loginData.userId===null){
        alert('Please enter User Id');
        document.getElementById("userId").focus();
        return validationSuccess;
    } else if(loginData.password.trim()==="" || loginData.password.trim()===null){
        alert('Please enter Password');
        document.getElementById("password").focus();
        return validationSuccess;
    } else{
        validationSuccess = true;
    }

    return validationSuccess;
}

  render() {
   /*  const { navigation } = this.props;
    if (navigation) {
      console.log(navigation)
      const message = navigation.getParam('message');} */
     return (
      <div  className="a">
        <div className="login-purple-pink p-3 shadow-lg rounded">
          <div className="pt-3">
            <h2 className="text-white ">User Login</h2>
          </div>
          <form className="mt-5" onSubmit={this.postLoginData}>
            <div className="form-group">
              <input  type="text" onChange={(event)=>{this.setState({userId:event.target.value})}} value={this.state.userId} class="form-control" placeholder="User ID" />
            </div>
            <div className="form-group">
              <input type="password" onChange={(event)=>{this.setState({password:event.target.value})}} value={this.state.password} class="form-control" placeholder="Enter Password"/>
            </div>
            <div className="input-group mt-3">
                          <div className="input-group-prepend">
                            <label className="input-group-text" htmlFor="inputGroupSelect01">User Type</label>
                          </div>
                          <select className="custom-select" id="userType" name="userType" onChange={(event)=>{this.setState({userType:event.target.value})}} value={this.state.userType}>
                            <option selected>Choose...</option>
                            <option value="Admin">Admin</option>
                            <option value="Librarian">Librarian</option>
                            <option value="Student">Student</option>
                          </select>
                        </div>

            <div className="mt-5">
              <button type="submit" className="btn btn-sm btn-light col">
                Login
            </button>
            </div>
            </form>
            <div className="text-center mt-2">
              <Link to="/AddUser" className="text-warning">Forgot Password?</Link>
            </div>
         
        </div>
      </div>
    );
  }
}

export default Login
















