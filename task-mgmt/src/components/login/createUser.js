import React, { Component } from 'react';

import './create.css'
import Axios from 'axios'

export class CreateUser extends Component {
    constructor(props) {
        super(props)
        this.state = {
            empId: '',
            empName: '',
            email: '',
            password: '',
            designation: '',
            isUpdate: false,
            show:false
        }
    }

    cancel(e) {
        e.preventDefault();
        this.props.history.push('/')
    }
    create(e) {
        e.preventDefault();

        Axios.post('http://localhost:8080/createUser', this.state)
            .then((response) => {
                console.log(" details" + this.state.empId)

                console.log(response.data.message)
                if (response.data.statusCode === 201) {
                    alert("User Created successfully => Redirecting to loginPage")
                    this.props.history.push('/')
                    
                } else {
                    
                    this.pRef.current.style.visibility = "visible"
                }

            }).catch((error) => {
                this.setState({show:true})
                console.log(error)
            })
    }
    render() {
        return (
            <div className="mainHeader">
                {this.state.show?<div id="alert" class="alert alert-danger" role="alert">User Creation Failed check connection </div>:null}
                <div className="adduser">
                    <div>
                        <div className="row col-sm-4 offset-4">
                            <div className="col-sm">
                                <div id="card" className="card">
                                    <h5 id="chead" className="card-header ">
                                        <legend className="mx-auto " style={{ width: '115px'}}>User Form </legend>
                                    </h5>
                                    <div className="card-body">
                                        <p className="card-text">
                                        </p>
                                        <form role="form" onSubmit={this.create.bind(this)}>
                                            <div className="input-group mb-3">
                                                <div className="input-group-prepend">
                                                    <span style={{ width: '100px' }}  className="input-group-text" id="basic-addon1">Name</span>
                                                </div>
                                                <input aria-describedby="basic-addon1" type="text" name="Name" id="Name" class="form-control input-sm" onChange={(event) => {
                                                    this.setState({
                                                        empName: event.target.value
                                                    })
                                                }} placeholder="Enter name of Employee" />
                                            </div>



                                            <div className="input-group mb-3">
                                                <div className="input-group-prepend">
                                                    <span style={{ width: '100px' }}  className="input-group-text" id="basic-addon1">Email</span>
                                                </div>
                                                <input required="required" type="email" name="email" id="email" class="form-control input-sm" placeholder="Enter email address" onChange={(event) => {
                                                    this.setState({
                                                        email: event.target.value
                                                    })
                                                }} />
                                            </div>
                                            <div className="input-group mb-3">
                                                <div className="input-group-prepend">
                                                    <span style={{ width: '100px' }}  className="input-group-text" id="basic-addon1">Designation</span>
                                                </div>
                                                <input type="text" name="Designation" id="Designation" class="form-control input-sm" placeholder="Enter Designation" onChange={(event) => {
                                                    this.setState({
                                                        designation: event.target.value
                                                    })
                                                }} />
                                            </div>
                                            <div className="input-group mb-3">
                                                <div className="input-group-prepend">
                                                    <span style={{ width: '100px' }}  className="input-group-text" id="basic-addon1">Password</span>
                                                </div>
                                                <input type="password" name="password" id="password" onChange={(event) => {
                                                    this.setState({
                                                        password: event.target.value
                                                    })
                                                }} class="form-control input-sm" placeholder="Enter Password"  required="required"/>
                                            </div>
                                            <div className="input-group mb-3">
                                                <div className="input-group-prepend">
                                                    <span style={{ width: '150px' }}  className="input-group-text" id="basic-addon1">Confirm Password</span>
                                                </div>
                                                <input type="password" name="password_confirmation" id="password_confirmation" class="form-control input-sm" placeholder="Confirm Password" />
                                            </div>

                                            <div className=" mx-auto" style={{ width: '233px', marginBottom: '20px' }}>
                                                <button type="reset" className="btn btn-outline-primary"  style={{marginRight:'10px'}}>Reset</button>
                                                <button type="submit"   className="btn btn-outline-success">Submit</button>
                                                <button type="cancel"  style={{marginTop:'-38px',width:'75px',marginLeft:'161px'}}  onClick={this.cancel.bind(this)} class="btn btn-outline-info btn-block">Cancel</button>
                                            </div>
                                            <p/>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        )
    }
}

export default CreateUser
