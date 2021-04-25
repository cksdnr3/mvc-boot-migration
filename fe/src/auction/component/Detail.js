import React, { useCallback, useEffect, useState } from 'react'
import axios from 'axios'

const Detail = (props) => {
    const [auctionDetail, setAuctionDetail] = useState({});
    const [userList, setUserList] = useState([]);
    const [user, setUser] = useState({});

    const getAuctionDetail = useCallback(() => {
        axios.get(`http://localhost:8080/auctions/${props.match.params.id}`)
        .then(res => {
            setAuctionDetail(res.data);
        })
        .catch(err => {
          console.log(err)
        })
    }, [auctionDetail, props.match.params.id])

    const update = () => {
        axios.put(`http://localhost:8080/auctions/${props.match.params.id}`, {})
        .then(res => {
            setAuctionDetail(res.data);
        })
        .catch(err => {
            console.log(err)
        })
    }

    const deleteAuction = () => {
        axios.delete(`http://localhost:8080/auctions/${props.match.params.id}`)
        .then(res => {
            console.log(res.data)
            alert("삭제되었습니다.")
            props.history.push('/list')
        })
        .catch(err => {
            console.log(err);
        })
    }

    const join = () => {
        axios.get(`http://localhost:8080/auctions/${localStorage.getItem("0")}`)
        .then(res => {
            setUser(...res.data)
        })
        .catch(err => console.log(err))
    }

    useEffect(() => {
        getAuctionDetail()
        setUserList(user);
    }, [auctionDetail.reservedPrice])

    return (
        <>
        <div>{auctionDetail.product} 경매</div>
        <div>productNo: {auctionDetail.productNo}</div>
        <div>제시 가격: {auctionDetail.reservedPrice}</div>
        <div>경매 단위: {auctionDetail.placedPrice}</div>
        <button onClick={update}>Place Bid!</button>
        <button onClick={deleteAuction}>delete</button>

        <div>
            <table>
                <thead />
                <tbody>
                {userList.length ? userList.map(user => {
                    <td>{user.username}</td>
                }) : 
                    <td>참가자가 없습니다.</td>
                }
                </tbody>
            </table>

        </div>
        </>
    )
}

export default Detail