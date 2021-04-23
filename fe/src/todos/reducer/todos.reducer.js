import { createSlice } from '@reduxjs/toolkit'
import uuid from 'uuid/v4'

const initialState = {
    input: '',
    todos: [
        {id: 1, text: '리액트 학습', done: true},
        {id: 2, text: '리덕스 학습', done: true},
    ]
}
// add, find, edit, del
const todosSlice = createSlice({
    name: 'todos',
    initialState,
    reducers: {
        setInput(state, {payload}) {
            return {
                ...state,
                input: payload
            }
        },
        addTodo(state, {payload}) {
            const copied = state.todos.slice(0)
            copied.push({ id: uuid(), text: payload, done: false })

            return {
                ...state,
                todos: copied
            }
        }
    }
})

export const { addTodo, setInput } = todosSlice.actions
export default todosSlice.reducer