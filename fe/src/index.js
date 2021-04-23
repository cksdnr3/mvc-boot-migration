import React from 'react';
import ReactDOM from 'react-dom';
import 'index.css';
import App from 'App';
import reportWebVitals from 'reportWebVitals';
import { BrowserRouter } from 'react-router-dom';
// import store from 'app/store'
import { Provider } from 'react-redux'
import { combineReducers } from 'redux'
import { configureStore } from '@reduxjs/toolkit';
import todosReducer from 'todos/reducer/todos.reducer'

const rootReducer = combineReducers({
  todosReducer
})

const store = configureStore({
  reducer: rootReducer
})

ReactDOM.render((
  <Provider store={store}>
    <BrowserRouter>
      <App />
    </BrowserRouter>
  </Provider> 
), document.getElementById('root'));

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
