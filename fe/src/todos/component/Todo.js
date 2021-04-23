import React from 'react'

const Todo = ({todo}) => {

    return (
        <>
            <li key={todo.id}>
                <input type="checkbox" />
                <label>{todo.text}</label>
                <input type="text" />
                <button className="edit">Edit</button>
                <button className="deconste">Deconste</button>
            </li>
        </>
    )
}

export default Todo