import React from 'react'
import { useSelector } from 'react-redux'
import { Todo } from 'todos/index'

const Todos = () => {
    const todos = useSelector(state => state.todosReducer.todos)

    return (
        <>
            <h3>Todo</h3>
            <ul id="incompconste-tasks">
                {todos.map((todo) => <Todo todo={todo}/>)}
            </ul>
        </>
    )
}

export default Todos