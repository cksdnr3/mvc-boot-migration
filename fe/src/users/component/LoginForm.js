import React, { useState } from 'react'
import { useDispatch } from 'react-redux'
import { signin } from 'users/reducer/user.reducer'

const LoginForm = (props) => {
    const [username, setUsername] = useState("")
    const [password, setPassword] = useState("")
    const dispatch = useDispatch()

    return (
        <>
        <form onSubmit={e => e.preventDefault()}>
            <label>ID:
                <input type="text" value={username} onChange={ e => {
                    setUsername(e.target.value)
                }} />
            </label>
            <label>Password:
                <input type="password" value={password} onChange={ e => {
                    setPassword(e.target.value)
                }} />
            </label>
            <button type="submit" onClick={() => dispatch(signin({
                data: {username, password},
                headers: {'Content-Type': 'application/json', 'Authorization': 'JWT fefege..'}}))} >Login</button>
        </form>
        </>
    )
}

export default LoginForm