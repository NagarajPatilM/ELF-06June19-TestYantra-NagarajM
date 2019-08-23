import React from 'react';
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import './App.css';
import Login from './components/login/Login';
import AddUser from './components/Forms/AddUser';
import Book from './components/Forms/Book';
import BookLoan from './components/Forms/BookLoan';
import BookRequest from './components/Forms/BookRequest';
import AdminHomePage from './components/HomePage/AdminHomePage';
import LibrarianHomePage from './components/HomePage/LibrarianHomePage';
import StudentHomePage from './components/HomePage/StudentHomePage';
import DeleteBook from './components/Forms/DeleteBook';
import DeleteUser from './components/Forms/DeleteUser';

function App() {
  return (
     <Router>
    <Route exact path='/' component={Login} />
    <Route  path='/AddUser' component={AddUser} />
    <Route  path='/Book' component={Book} />
    <Route  path='/BookLoan' component={BookLoan} />
    <Route  path='/BookRequest' component={BookRequest} />
    <Route  path='/AdminHomePage' component={AdminHomePage} />
    <Route exact path='/LibrarianHomePage' component={LibrarianHomePage} />
    <Route exact path='/StudentHomePage' component={StudentHomePage} />
    <Route exact path='/DeleteBook' component={DeleteBook} />
    <Route exact path='/DeleteUser' component={DeleteUser} />
    </Router>
  );
}

export default App;
