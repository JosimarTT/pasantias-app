import React, { Component } from 'react';
import LoadingIndicator  from '../common/LoadingIndicator';
import { Button, Icon, notification } from 'antd';
import { withRouter } from 'react-router-dom';
import './Home.css';

class Home extends Component {
	
  render() {
  	if(!this.props.isAuthenticated){
  		this.props.handleLogout("/login", "success", "prueba home.");
  	}
    return (
            <div className="polls-container">
            <h1>Pagina inicial</h1>
            </div>
    );
  }
}

export default withRouter(Home);
