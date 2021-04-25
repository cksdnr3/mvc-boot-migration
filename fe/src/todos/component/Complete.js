import React from 'react'
import { useDispatch, useSelector } from 'react-redux'
import { removeTodo, toggleTodo } from 'todos/reducer/todos.slice'

const Completed = () => {

    const completes = useSelector(state => state.todosReducer.complete)
    const dispatch = useDispatch()
    
    return (
        <>
            <h3>Compconsted</h3>
            <ul id="compconsted-tasks">
                {completes.map((complete) => {
                    return (
                        <li key={complete.id}>
                            <input type="checkbox" onClick={() => dispatch(toggleTodo(complete))} />
                            {!(complete.done) ? <label>{complete.text}</label> : <label><del>{complete.text}</del></label>}
                            <button className="deconste" onClick={() => dispatch(removeTodo(complete.id))}>Deconste</button>
                        </li>
                    )
                })}
            </ul>
        </>
    )
}

export default Completed