import React, { Component } from 'react'
import Axios from 'axios';

export class CreateAccount extends Component {
    constructor(props) {
        super(props);
        this.state = {
            name: '',
            email: '',
            phoneno: '',
            password: ''
        }
        this.postData = this.postData.bind(this);
    }

    postData(event) {
        event.preventDefault();
        console.log('Post Data', this.state);
        let accountData = this.state;
        Axios.post('https://emp-app1-c56e1.firebaseio.com/accounts.json', accountData).then((response) => {
            console.log('Response Object', response);
            this.setState({
                name: '',
                email: '',
                phoneno: '',
                password: ''
            })
        }).catch((error) => {
            console.log('Error Object', error);
        })
    }

    // function validate(){
    //     var x=document.forms["a"]["name"].value;
    //     if(x=='') {
    //     alert('name field cannot be empty');
    // }}

    
    render() {
        return (
            <div>
                <form name="a" onSubmit={this.postData} className="p-5">
                    <div className="row ">
                        <div className="col">
                            <input type="text" onChange={(event) => {
                                this.setState({
                                    name: event.target.value
                                })
                            }}
                                value={this.state.name} className="form-control" placeholder="Name" />
                        </div>
                        <div className="col">
                            <input type="text"
                                onChange={(event) => {
                                    this.setState({
                                        email: event.target.value
                                    })
                                }}
                                value={this.state.email} className="form-control" placeholder="Email" />
                        </div>
                    </div>
                    <br />
                    <div className="row">
                        <div className="col">
                            <input type="number"
                                onChange={(event) => {
                                    this.setState({
                                        phoneno: event.target.value
                                    })
                                }}
                                value={this.state.phoneno} className="form-control" placeholder="Phone Number" />
                        </div>
                        <div className="col">
                            <input type="password"
                                onChange={(event) => {
                                    this.setState({
                                        password: event.target.value
                                    })
                                }}
                                value={this.state.password} className="form-control" placeholder="Password" />
                        </div>
                    </div>
                    <br />
                    <div className="row">
                        <div className="col-md-2 offset-5">
                            <button className="btn btn-success w-100" type="submit" onClick="validate()">Add</button>
                        </div></div>
                </form>
            </div>
        )
    }
}

export default CreateAccount
