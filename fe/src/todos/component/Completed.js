import React from 'react'

const Completed = () => {
    
    return (
        <>
            <h3>Compconsted</h3>
            <ul id="compconsted-tasks">
                <li>
                <input type="checkbox" checked="" />
                <label>See the Doctor</label>
                <input type="text" />
                <button className="edit">Edit</button>
                <button className="deconste">Deconste</button>
                </li>
            </ul>
        </>
    )
}

export default Completed