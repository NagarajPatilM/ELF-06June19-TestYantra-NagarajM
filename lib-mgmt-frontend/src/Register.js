import React from 'react';
import { BrowserRouter as Router, Route, Link } from 'react-router-dom';
import Loginform from './loginform';
import './Register.css'

class Register extends React.Component {
    render() {
        return (
            <div class="container">
                <div class="registration mx-auto d-block w-100">
                    <div class="page-header text-center">
                        <h1>Sign up</h1>
                    </div>

                    <form id="member-registration" action="/astroidnew/index.php/pages/register?task=registration.register" method="post" class="form-validate form-horizontal well" enctype="multipart/form-data">
                        <fieldset>
                            <legend>User Registration</legend>
                            <div class="form-group">
                                <label for="exampleInputPassword1">Name *</label>
                                <input type="text" class="form-control" id="exampleInputPassword1" />
                            </div>
                            <div class="form-group">
                                <label for="exampleInputPassword1">Username *</label>
                                <input type="text" class="form-control" id="exampleInputPassword1" />
                            </div>
                            <div class="form-group">
                                <label for="exampleInputPassword1">Password *</label>
                                <input type="password" class="form-control" id="exampleInputPassword1" />
                            </div>
                            <div class="form-group">
                                <label for="exampleInputPassword1">Confirm Password *</label>
                                <input type="password" class="form-control" id="exampleInputPassword1" />
                            </div>
                            <div class="form-group">
                                <label for="exampleInputEmail1">Email Address *</label>
                                <input type="email" class="form-control" id="exampleInputEmail1" />
                            </div>
                            <div class="form-group">
                                <label for="exampleInputEmail1">Confirm Email Address *</label>
                                <input type="email" class="form-control" id="exampleInputEmail1" />
                            </div>
                            <div class="d-flex justify-content-between align-items-center">
                                <div class="form-group d-flex justify-content-start">
                                    <button type="submit" class="btn btn-primary">Submit</button>
                                </div>
                                
                                    <Router>
                                        <Link class="a">Sign in Instead</Link>
                                        <Route path="/loginform" Component={Loginform}></Route>
                                    </Router>
                                </div>
                          
                        </fieldset>
                    </form>
                </div>
            </div>
        )
    }
}
export default Register;