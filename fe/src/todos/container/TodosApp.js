import Footer from 'common/component/Footer';
import Navigation from 'common/component/Navigation';
import React from 'react'
import { useDispatch } from 'react-redux';
import { Add, Todos } from 'todos';
import Completed from 'todos/component/Complete';
import 'todos/style/Todo.css'

const TodosApp = () => {
    const dispatch = useDispatch()

    return (
        <>
        <Navigation />
        <div className="todo">
            <div className="container">
                <Add />
                <Todos />
                <Completed />
            </div>
        </div>
        <Footer/>
        </>
    )
}

export default TodosApp