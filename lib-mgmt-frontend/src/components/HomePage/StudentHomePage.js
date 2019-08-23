import React, { Component } from 'react'
import './StudentHomePage.css';

export class StudentHomePage extends Component {
    render() {
        return (
            <div className="student">
                 <nav className="navbar navbar-expand-lg navbar-light bg-light">
        <a className="navbar-brand" href="#">Student</a>
        <button className="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span className="navbar-toggler-icon" />
        </button>
        <div className="collapse navbar-collapse" id="navbarSupportedContent">
          <ul className="navbar-nav mr-auto">
            <li className="nav-item active">
              <a className="nav-link" href="#">Home <span className="sr-only">(current)</span></a>
            </li>
            <li className="nav-item">
              <a className="nav-link" href="#">view Request</a>
            </li>
            <li className="nav-item">
              <a className="nav-link" href="/BookRequest">Request Book</a>
            </li>
            <li className="nav-item">
              <a className="nav-link" href="#">Renew Book</a>
            </li>
            <div style={{marginRight: '200px'}} />
            <li className="nav-item">
              <form className=" form-inline">
                <input className="form-control" type="search" placeholder="Search User" aria-label="Search" />
                <button className="btn btn-outline-success" type="submit">Search</button>
              </form>
            </li>
          </ul>
          <ul className="nav navbar-nav" style={{float: 'right'}}>
            <li>
              <button type="button" className="btn btn-danger"><a style={{color: 'aliceblue'}} href="/">logout</a></button>
            </li>
          </ul>
        </div>
      </nav>
            </div>
        )
    }
}

export default StudentHomePage
