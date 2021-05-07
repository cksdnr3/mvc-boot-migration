import React, { useEffect } from 'react'
import { useDispatch, useSelector } from 'react-redux'
import  { getUserList }  from 'users/reducer/user.reducer';

const UserList = () => {
    const dispatch = useDispatch();
    const users = useSelector(state => {
        console.log("state: " + JSON.stringify(state))
        return state.userReducer
    });

    useEffect(() => {
        dispatch(getUserList())
    } , [])

    console.log("users dispatch: " + JSON.stringify(users));

    return (
        <>
        <h1>User List</h1>
        <table style={{border: "10"}}>
            <thead>
                <tr>
                    <th>username</th>
                    <th>name</th>
                    <th>email</th>
                </tr>
            </thead>
            <tbody>
            {users.map((user, id) => {
                return (
                    <tr key={id}>
                            <td>{user.username}</td>
                            <td>{user.name}</td>
                            <td>{user.email}</td>
                    </tr>)
            })}
            </tbody>
        </table>
        </>
    )
}

export default UserList