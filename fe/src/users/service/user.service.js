const { default: axios } = require("axios");

const findAll = () => axios.get("http://localhost:8080/users/findAll");

const signup = (args) => {
    console.log("service Call")

    return axios({
        url: "http://localhost:8080/users/signup",
        method: 'post',
        data: args.data,
        headers: args.headers
    })
};

const getDetail = () => axios.get(`http://localhost:8080/users/`)

const signin = (args) => {

    return axios({
        url: `http://localhost:8080/users/signin`, 
        method: 'post', 
        data: args.data, 
        headers: args.headers
    })
}

const userEdit = (args) => axios({
    url: `hhttp://localhost:8080/users/${args.data.username}`, 
    method: 'put', 
    data: args.data, 
    headers: args.headers
})

const userDelete = (args) => axios({
    url: `http://localhost:8080/users/${args.username}`,
    method: 'delete',
    headers: args.headers
})



export default { findAll, signup, getDetail, signin, userEdit, userDelete }