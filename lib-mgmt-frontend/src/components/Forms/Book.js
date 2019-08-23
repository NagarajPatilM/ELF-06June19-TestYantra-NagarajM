import React, { Component } from 'react'

export class Book extends Component {
    render() {
        return (
            <div className="top">
            <div className="container" style={{marginLeft: '500px'}}>
              <div className="row">
                <div className="col-md-6">
                  <div className="card">
                    <h5 className="card-header ">
                      <legend className="mx-auto " style={{width: '200px', color: 'aliceblue'}}>Book Registration </legend>
                    </h5>
                    <div className="card-body">
                      <p className="card-text">
                      </p><form>
                        <div className="input-group mb-3">
                          <div className="input-group-prepend">
                            <span className="input-group-text" id="basic-addon1">Book ID</span>
                          </div>
                          <input type="text" className="form-control" id="id" name="id" placeholder=" Enter Book ID" aria-label="Book ID" aria-describedby="basic-addon1" />
                        </div>
                        <div className="input-group mb-3">
                          <div className="input-group-prepend">
                            <span className="input-group-text" id="basic-addon1">Book title</span>
                          </div>
                          <input id="book_title" name="book_title" type="text" className="form-control" placeholder=" Enter Book title" aria-label="book title" aria-describedby="basic-addon1" />
                        </div>
                        <div className="input-group mb-3">
                          <div className="input-group-prepend">
                            <span className="input-group-text" id="basic-addon1">Book Author</span>
                          </div>
                          <input id="book_author" name="book_author" type="text" className="form-control" placeholder=" Enter Book Author" aria-label="book Author" aria-describedby="basic-addon1" />
                        </div>
                        <div className="input-group mb-3">
                          <div className="input-group-prepend">
                            <span className="input-group-text" id="basic-addon1">Category</span>
                          </div>
                          <input id="category" name="category" type="text" className="form-control" placeholder=" Enter Category" aria-label="Category" aria-describedby="basic-addon1" />
                        </div>
                        <div className="input-group mb-3">
                          <div className="input-group-prepend">
                            <label className="input-group-text" htmlFor="inputGroupSelect01">Options</label>
                          </div>
                          <select className="custom-select" id="inputGroupSelect01">
                            <option selected>Choose...</option>
                            <option value="true">Yes</option>
                            <option value="false">No</option>
                          </select>
                        </div>
                        <div className="input-group mb-3">
                          <div className="input-group-prepend">
                            <span className="input-group-text" id="basic-addon1">NumberOfCopies</span>
                          </div>
                          <input id="number_of_copies" name="number_of_copies" type="number" className="form-control" placeholder=" Enter NumberOfCopies" aria-label="NumberOfCopies" aria-describedby="basic-addon1" />
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

export default Book
