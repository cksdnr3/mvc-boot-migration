import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import Home from './common/component/Home'
import AtricleList from './board/component/ArticleList'
import reportWebVitals from './reportWebVitals';
import UserDetail from './user/component/UserDetail'

ReactDOM.render(
    <UserDetail />,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
