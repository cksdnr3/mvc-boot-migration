import React from 'react'
import { useDispatch, useSelector } from 'react-redux'
import { addTodo, setInput } from 'todos/reducer/todos.reducer'

const Add = () => {
    const dispatch = useDispatch()

    const text = useSelector(state => state.todosReducer.input)


        
    return (
        <>
        <p>
            <form onSubmit={(e) => {
                e.preventDefault()
                const el = document.getElementById("new-task");
                el.value = ""
            }}>
                <label>Add Item</label>
                <input id="new-task" type="text" value={text} onChange={e => dispatch(setInput(e.target.value))} />
                <button onClick={() => dispatch(addTodo(text))}>Add</button>
            </form>
        </p>
        </>
    )
}

export default Add