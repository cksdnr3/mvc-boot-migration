import Footer from 'common/component/Footer'
import Navigation from 'common/component/Navigation'
import React, { useState } from 'react'
import { useSelector } from 'react-redux'

const Counter = () => {
    const [count, setCount] = useState(0)

    return (
        <>
        <Navigation/>
        <div style={{textAlign: "center"}}>
        <h1>Counter</h1>
        <div>
            <button
            aria-label="Increment value"
            onClick={() => setCount(count + 1)}>
                Increment
            </button>
            <span style={{fontSize: "80px"}}>{count}</span>
            <button
            aria-label="Decrement value"
            onClick={() => setCount(count - 1)}>
                Decrement
            </button>
        </div>
        </div>
        <Footer/>
        </>
    )
}

export default Counter