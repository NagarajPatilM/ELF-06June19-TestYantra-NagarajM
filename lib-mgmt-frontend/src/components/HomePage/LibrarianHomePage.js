import React, { Component } from 'react'
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import './LibrarianHomePage.css';

export class LibrarianHomePage extends Component {

  openUser(event) {
    event.preventDefault();
    this.props.history.push('/Book');
    this.props.history.push('/AllocateBook');
    this.props.history.push('/ViewUser');
  }

    render() {
        return (
            <div class="librarian">
                  <nav className="navbar navbar-expand-lg navbar-light bg-light">
        <Link className="navbar-brand" to="/LibrarianHomePage">Librarian</Link>
        <button className="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span className="navbar-toggler-icon" />
        </button>
        <div className="collapse navbar-collapse" id="navbarSupportedContent">
          <ul className="navbar-nav mr-auto">
            <li className="nav-item active">
              <Link className="nav-link" to="/LibrarianHomePage">Home <span className="sr-only">(current)</span></Link>
            </li>
            <li className="nav-item">
              <Link className="nav-link" to="/Book">Add Book</Link>
            </li>
            <li className="nav-item">
              <Link className="nav-link" to="#">Remove Book</Link>
            </li>
            <li className="nav-item">
              <Link className="nav-link" to="/BookRequest">Allocate Book</Link>
            </li>
            <li className="nav-item">
              <Link className="nav-link" to="#">De-Allocate Book</Link>
            </li>
            <div style={{marginRight: '100px'}} />
            <li className="nav-item">
              <form className=" form-inline">
                <input className="form-control" type="search" placeholder="Search User" aria-label="Search" />
                <button className="btn btn-outline-success" type="submit">Search</button>
              </form>
            </li>
          </ul>
          <ul className="nav navbar-nav" style={{float: 'right'}}>
            <li>
              <button type="button" className="btn btn-danger"><Link style={{color: 'aliceblue'}} to="/">logout</Link></button>
            </li>
          </ul>
        </div>
      </nav>
            </div>
        )
    }
}

export default LibrarianHomePage
