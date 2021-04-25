import { createSlice } from '@reduxjs/toolkit'
import uuid from 'uuid/v4'

const initialState = {
    todos: [],
    complete: []
}

// add, find, edit, del
const todosSlice = createSlice({
    name: 'todos',
    initialState,
    reducers: {
        addTodo(state, {payload}) {
            state.todos.push({ id: uuid(), text: payload, done: false })
        },
        removeTodo(state, {payload}) {
            state.todos = state.todos.filter((el) => el.id !== payload)
        },
        toggleTodo(state, {payload}) {
            let checkId = el => el.id === payload.id

            if (!payload.done) {
                state.todos[state.todos.findIndex(checkId)].done = !(state.todos[state.todos.findIndex(checkId)].done)
                state.complete.push(state.todos[state.todos.findIndex(checkId)])
                state.todos = state.todos.filter(el => el.done === false)
            } else {
                state.complete[state.complete.findIndex(checkId)].done = !(state.complete[state.complete.findIndex(checkId)].done)
                state.todos.push(state.complete[state.complete.findIndex(checkId)])
                state.complete = state.complete.filter(el => el.done === true)
            }
        }
    }
})

export const { addTodo, removeTodo, toggleTodo } = todosSlice.actions
export default todosSlice.reducer