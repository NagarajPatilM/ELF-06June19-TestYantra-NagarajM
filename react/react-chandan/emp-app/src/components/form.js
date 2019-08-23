import React, { Component } from 'react'
import ReactDOM from 'react-dom';

class Form extends Component{
    constructor(props){

    }
    render() {
        return(
            <form>
                <input type="text" name="fname" />
                <input type="password" name="password"/>
            </form>
        )
    }
}
export default Form