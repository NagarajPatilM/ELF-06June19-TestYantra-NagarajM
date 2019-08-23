import React, { Component } from 'react'
import './BookRequest.css'

export class BookRequest extends Component {
    render() {
        return (
            <div className="top">
            <div className="container" style={{marginLeft: '500px'}}>
              <div className="row">
                <div className="col-md-6">
                  <div className="card">
                    <h5 className="card-header ">
                      <legend className="mx-auto " style={{width: '200px', color: 'aliceblue'}}>Book Request </legend>
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
                            <span className="input-group-text" id="basic-addon1">User ID</span>
                          </div>
                          <input id="uid" name="uid" type="number" className="form-control" placeholder=" Enter User ID" aria-label="User ID" aria-describedby="basic-addon1" />
                        </div>
                        <div className="input-group mb-3">
                          <div className="input-group-prepend">
                            <label className="input-group-text" htmlFor="inputGroupSelect01">Request Sanction</label>
                          </div>
                          <select className="custom-select" id="requestSanction" name="requestSanction">
                            <option selected>Choose...</option>
                            <option value="true">Yes</option>
                            <option value="false">No</option>
                          </select>
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

export default BookRequest
