import React, { Component } from 'react'
import Axios from 'axios';
import {Modal,Button} from 'react-bootstrap'

export class ViewAccounts extends Component {
    constructor(props){
        super(props);
        this.state={
            accounts:[],
            show:false,
            name :'',
            email :'',
            phoneno :'',
            password :''
        }
    }
    componentDidMount() {
        Axios.get('https://emp-app1-c56e1.firebaseio.com/accounts.json').then((response)=>{
            console.log('Response Data', response.data);
            let fetchedAccounts = [];
            for(let key in response.data){
                console.log(response.data[key])
                fetchedAccounts.push({
                    ...response.data[key],
                    id: key
                })
            }
            console.log('Fetched Accounts', fetchedAccounts);
        }).catch((error)=>{
            console.log('Error',error);
        })
    }
    editAccount(account){
        this.setState({
            name : account.name,
            email : account.email,
            phoneno : account.phoneno,
            password : account.password,
            show : !this.state.show
        })
    }

    handleClose(){
        this.setState({
            show :!this.state.show
        })
    }
    updateAccountData(){
        const{id,name,email,password,phone}=this.state;
        const account = {name,email,password,phone};
        console.log('Account data',account);
        //Axios.put('https://emp-app1-c56e1.firebaseio.com/accounts/'+id)

    }


//     deleteAccount(account){
//         console.log('Account id',account.id)
//         Axios.delete('https://emp-app1-c56e1.firebaseio.com/accounts'+.then(response)=>{
//         alert('Deleted successfully')
//    let allAccounts = this.state.Accounts;
//     let index = allAccounts.indexOf(account);
//    let newAccounts =allAccounts.splice(index,1);
//   console.log('New Accounts',newAccounts);
//    console.log('NewAccounts')
//     })
//     .catch((error))=>{
//         alert('Deletion failed')
//     });
//     // 
    
    render() {
        return (
            <div>
                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th scope="col">Name</th>
                            <th scope="col">Email</th>
                            <th scope="col">Phone Number</th>
                            <th scope="col">Password</th>
                            
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <th scope="row">1</th>
                            <td>Mark</td>
                            <td>Otto</td>
                            <td>@mdo</td>
                            <th><button type="submit" class="btn btn-primary">Delete</button></th>
                            <th><button type="submit" class="btn btn-primary">Edit</button></th>
                        </tr>
                    </tbody>
                </table>
                <div>
      <Button variant="primary" >
        Launch demo modal
      </Button>

      <Modal show={this.state.show} onHide={this.handleClose.bind(this)}>
        <Modal.Header closeButton>
          <Modal.Title>Modal heading</Modal.Title>
        </Modal.Header>
        <Modal.Body>
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
        </Modal.Body>
        <Modal.Footer>
          <Button variant="secondary" onClick={this.handleClose.bind(this)}>
            Close
          </Button>
          <Button variant="primary" onClick={this.updateAccountData.bind(this)}>
            Save Changes
          </Button>
        </Modal.Footer>
      </Modal>
    </div>
            </div>
        )
    }
}

export default ViewAccounts
