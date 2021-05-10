import React, { useCallback, useEffect, useState } from 'react'
import axios from 'axios'
import { useDispatch } from 'react-redux'
import { getDetail, userDelete, userEdit } from 'users/reducer/user.reducer'

const MyPage = (props) => {
    const [user, setUser] = useState({})
    const onChange = useCallback( e => {
        setUser({
            ...user,
            [e.target.name]: e.target.value
        })
    }, [user])

    const dispatch = useDispatch()


    // useEffect(() => getDetail(), [])

    return (
        <>
        <h1>MyPage</h1>
        <form onSubmit={e => e.preventDefault()}>
            <label>ID:
                <input type="text" name="username" value={user.username || ""} onChange={onChange} />
            </label><br/>
            <label>Password:
                <input type="text" name="password" value={user.password || ""} onChange={onChange} />
            </label><br/>
            <label>Birthday:
                <input type="text" name="birthday" value={user.birthday || ""} onChange={onChange} />
            </label><br/>
            <label>Name:
                <input type="text" name="realName" value={user.realName || ""} onChange={onChange} />
            </label><br/>
            <label>E-mail:
                <input type="text" name="email" value={user.email || ""} onChange={onChange} />
            </label><br/>
            <label>E-Gender:
                <input type="text" name="gender" value={user.gender || ""} onChange={onChange} />
            </label><br/>
            <label>PhoneNumber:
                <input type="text" name="phoneNumber" value={user.phoneNumber || ""} onChange={onChange} />
            </label><br/>
            <button type="submit" onClick={() => {
                const del = window.confirm("정보를 수정하시겠습니까?")
                if (del) {
                    dispatch(userEdit({
                        data: user,
                        headers: {'Content-Type':'application/json','Authorization': 'Bearer ' + localStorage.getItem("token")}
                        }))}}}>modify</button>
            <button onClick={() => {
                const del = window.confirm("정말 탈퇴하시겠습니까?")
                if (del) {
                    dispatch(userDelete({
                        username: user.username,
                        headers: {'Content-Type':'application/json','Authorization': 'Bearer ' + localStorage.getItem("token")}
                        }))}}}>delete</button>
        </form>
        </>
    )
}

export default MyPage