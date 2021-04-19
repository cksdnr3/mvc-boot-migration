import React, { useEffect, useState } from 'react'
import 'common/style/Common.css'
import 'article/style/ArticleList.css'
import Navigation from 'common/component/Navigation'
import Footer from 'common/component/Footer'
import axios from 'axios'
// import CCTV from 'board/data/SeoulCCTV.json'

const SeoulCCTV = () => {
  const [cctvs, setCctvs] = useState([])
  const [a, setA] = useState("A")
  const [b, setB] = useState("B")
  
  console.log("lexical cctvs: " + JSON.stringify(cctvs))

  const getCctvs = () => {
    axios.get('/data/SeoulCCTV.json')
    .then(res => {
      setCctvs(res.data.DATA)
      console.log("axios cctvs: " + JSON.stringify(cctvs))
    })
  .catch(err => {console.log(err)})
  }
  
  useEffect(() => getCctvs(), [])

  return (
    <>
    {console.log("render() cctvs: " + JSON.stringify(cctvs))}
    <Navigation />
    <div className="article_list">
      <table>
        <thead>
          <tr>
            <th>No</th>
            <th>기준 날짜</th>
            <th>카메라 코드</th>
            <th>카메라 명칭</th>
            <th>설명</th>
          </tr>
        </thead>
        <tbody>
          {cctvs.map((cctv, id) => {
            return (
              <tr key={id}>
                <td>{id}</td>
                <td>{cctv.checktime}</td>
                <td>{cctv.deviceid}</td>
                <td>{cctv.devicename}</td>
                <td>{cctv.description}</td>
            </tr>
            )
          })}
        </tbody>
      </table>
      </div>
      <Footer />
    </>
  )
}

export default SeoulCCTV