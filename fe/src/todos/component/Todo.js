import React from 'react'
import { useDispatch } from 'react-redux'
import { Link } from 'react-router-dom'
import { removeTodo } from 'todos/reducer/todos.slice'

const Todo = ({todo}) => {
    const dispatch = useDispatch()

    return (
        <>
        <h1>todo detail</h1>
        </>
    )
}

export default Todo