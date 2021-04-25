import React from 'react'
import { useDispatch, useSelector } from 'react-redux'
import { Link } from 'react-router-dom'
import { removeTodo, toggleTodo } from 'todos/reducer/todos.slice'


const Todos = () => {
    const todos = useSelector(state => state.todosReducer.todos)

    const dispatch = useDispatch()
    
    return (
        <>
            <h3>Todo</h3>
            <ul id="incompconste-tasks">
                {todos.map((todo) => {
                    return (
                        <li key={todo.id}>
                            <input type="checkbox" onClick={(e) => dispatch(toggleTodo(todo))} />
                            {!(todo.done) ?
                                <label>{todo.text}</label>
                                : <label><del>{todo.text}</del></label>}
                            <input type="text" />
                            <button className="deconste" onClick={() => dispatch(removeTodo(todo.id))}>Deconste</button>
                        </li>
                    )
                })}
            </ul>
        </>
    )
}

export default Todos