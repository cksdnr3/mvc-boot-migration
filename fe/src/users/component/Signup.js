import React, { useCallback, useState } from 'react'
import DatePicker from 'react-datepicker'
import 'react-datepicker/dist/react-datepicker.css';
import { useDispatch } from 'react-redux';
import { signup } from 'users/reducer/user.reducer'

const Signup = (props) => {
    const dispatch = useDispatch();
    
    // const [birthday, setBirthday] = useState(new Date());
    const [inputs, setInputs] = useState({
        username: "",
        password: "",
        name: "",
        email: "",
        // gender: "man",
        // phoneNumber: "",
        // birthday,
    })

    const onChange = useCallback(e => {
        setInputs({
            ...inputs, [e.target.name]: e.target.value
        })
    }, [inputs])
asdasda
    return (
        <>
        <h2>Signup</h2>
        <form onSubmit={ e => {
            e.preventDefault()
            dispatch(signup(inputs))
            props.history.push("/")
        } }>
            <label>ID:
                <input type="text" name="username" value={inputs.username} onChange={onChange} />
            </label><br/>
            <label>Password:
                <input type="password" name="password" value={inputs.password} onChange={onChange} />
            </label><br/>
            <label>Name:
                <input type="text" name="name" value={inputs.name} onChange={onChange} />
            </label><br/>
            <label>E-mail:
                <input type="text" name="email" value={inputs.email} onChange={onChange} />
            </label><br/>
            {/* <label>Phone Number:
                <input type="text" name="phoneNumber" value={inputs.phoneNumber} onChange={onChange} />
            </label><br/>
            <label>Birthday:
            <DatePicker selected={inputs.birthday} onChange={date => setBirthday(date)} 
                        className="input-datepicker" dateFormat="yyyy-MM-dd" />
            </label><br/>
            <label>Gender:
                <select name="gender" value={inputs.gender} onChange={onChange}>
                    <option value="man">Man</option>
                    <option value="woman">Woman</option>
                </select>
            </label><br/> */}

            <button type="submit">signup</button>
        </form>
        </>
    )
}

export default Signup