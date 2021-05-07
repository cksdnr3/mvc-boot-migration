import userReducer from 'users/reducer/user.reducer'
import todosReducer from 'todos/reducer/todos.slice'
import { combineReducers } from 'redux'
import { configureStore, getDefaultMiddleware } from '@reduxjs/toolkit'

const rootReducer = combineReducers({
    userReducer,
    todosReducer
})

export default configureStore({
    reducer: rootReducer,
    middleware: [...getDefaultMiddleware()]
})

