import React from 'react'
import { Link } from 'react-router-dom'

const Navigation = () => {

    return (
        <>
            <nav className="navbar navbar-default">
                <div className="container">
                    <div className="navbar-header">
                        <button type="button" className="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                            <span className="icon-bar"></span>
                            <span className="icon-bar"></span>
                            <span className="icon-bar"></span>                        
                        </button>
                        <a className="navbar-brand" href="#">Me</a>
                    </div>
                    <div className="collapse navbar-collapse" id="myNavbar">
                        <ul className="nav navbar-nav navbar-right">
                            <li><a href="#">Login</a></li>
                            <li><a href="#">WHAT</a></li>
                            <li><Link to='/article/seoul-cctv'>서울시 유동 인구</Link></li>
                            <li><Link to='/board/news'>News</Link></li>
                        </ul>
                    </div>
                </div>
            </nav>
        </>
    )
}

export default Navigation