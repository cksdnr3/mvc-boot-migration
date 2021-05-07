const { default: axios } = require("axios");

const findAll = () => axios.get("http://localhost:8080/users/findAll");

const signup = (args) => axios.post("http://localhost:8080/users/signup", args);

const getDetail = () => axios.get(`http://localhost:8080/users/`)

export default { findAll, signup, getDetail }