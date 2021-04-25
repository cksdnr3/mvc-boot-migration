import React, { useState } from 'react'
import { useDispatch, useSelector } from 'react-redux'
import { addTodo } from 'todos/reducer/todos.slice'

const Add = () => {
    const [input, setInput] = useState("")

    const dispatch = useDispatch()
  
    return (
        <>
            <form onSubmit={(e) => {
                e.preventDefault()
                const el = document.getElementById("new-task");
                el.value = ""
            }}>
                <label>Add Item</label>
                <input id="new-task" type="text" value={input} onChange={e => setInput(e.target.value)} />
                <button onClick={() => dispatch(addTodo(input))}>Add</button>
            </form>
        </>
    )
}

export default Add