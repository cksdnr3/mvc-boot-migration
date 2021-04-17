import React from 'react'
import 'user/style/UserDetail.css'

const UserDetail = () => {

    return (
        <>
        <div className="side">
            <h2>About Me</h2>
            <h5>Photo of me:</h5>
            <div className="fakeimg height_200">Image</div>
            <div className="height_60">
                <label>이름: 
                    <input></input>
                </label>
            </div><br />
            <div className="height_60">나이: </div><br />
            <div className="height_60">성별: </div><br />
            <div className="height_60">소개: </div>
            <p>Some text about me in culpa qui officia deserunt mollit anim..</p>
            <h3>More Text</h3>
            <p>Lorem ipsum dolor sit ame.</p>
        </div>
        </>
    )
}

export default UserDetail