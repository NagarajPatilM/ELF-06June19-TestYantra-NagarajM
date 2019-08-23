import React, { Component } from 'react'
import './BookLoan.css'

export class BookLoan extends Component {
    render() {
        return (
            <div className="top">
        <div className="container" style={{marginLeft: '500px'}}>
          <div className="row">
            <div className="col-md-6">
              <div className="card">
                <h5 className="card-header ">
                  <legend className="mx-auto " style={{width: '130px', color: 'aliceblue'}}>Book Loan </legend>
                </h5>
                <div className="card-body">
                  <p className="card-text">
                  </p><form>
                    <div className="input-group mb-3">
                      <div className="input-group-prepend">
                        <span className="input-group-text" id="basic-addon1">Book ID</span>
                      </div>
                      <input type="number" className="form-control" id="id" name="id" placeholder=" Enter Book ID" aria-label="Book ID" aria-describedby="basic-addon1" />
                    </div>
                    <div className="input-group mb-3">
                      <div className="input-group-prepend">
                        <span className="input-group-text" id="basic-addon1">Date Issued</span>
                      </div>
                      <input id="DateIssued" name="DateIssued" type="date" className="form-control" placeholder=" Enter Date Issued" aria-label="Date Issued" aria-describedby="basic-addon1" />
                    </div>
                    <div className="input-group mb-3">
                      <div className="input-group-prepend">
                        <span className="input-group-text" id="basic-addon1">Date due for return</span>
                      </div>
                      <input id="DateDueForReturn" name="DateDueForReturn" type="date" className="form-control" placeholder=" Enter Date due for return" aria-label="Date due for return" aria-describedby="basic-addon1" />
                    </div>
                    <div className="input-group mb-3">
                      <div className="input-group-prepend">
                        <span className="input-group-text" id="basic-addon1">Fine</span>
                      </div>
                      <input id="fine" name="fine" type="number" className="form-control" placeholder=" Enter Fine" aria-label="fine" aria-describedby="basic-addon1" />
                    </div>
                    <div className="input-group mb-3">
                      <div className="input-group-prepend">
                        <span className="input-group-text" id="basic-addon1">User ID</span>
                      </div>
                      <input id="uid" name="uid" type="number" className="form-control" placeholder=" Enter User ID" aria-label="User ID" aria-describedby="basic-addon1" />
                    </div>
                    <div className="input-group mb-3">
                      <div className="input-group-prepend">
                        <span className="input-group-text" id="basic-addon1">Book Renew</span>
                      </div>
                      <input id="bookRenew" name="bookRenew" type="date" className="form-control" placeholder=" Enter Renewing Date" aria-label="User ID" aria-describedby="basic-addon1" />
                    </div>
                    <p />
                  </form></div>
                <div className=" mx-auto" style={{width: '150px', marginBottom: '20px'}}>
                  <button type="reset" className="btn btn-outline-primary">Reset</button>
                  <button type="submit" className="btn btn-outline-success">Submit</button>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
        )
    }
}

export default BookLoan
