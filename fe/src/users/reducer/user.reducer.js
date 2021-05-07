import {createAsyncThunk, createSlice} from "@reduxjs/toolkit"
import { UserService } from 'users/index'

const API_URL = "/data/users.json"

export const getUserList = createAsyncThunk("GET_USER_LIST", async () => {
    const response = await UserService.findAll();
    // console.log("getUserList(): " + response.data);
    return response.data;
});

export const signup = createAsyncThunk("ADD_USER", async (args) => {
    const response = await UserService.signup(args);
    // console.log("signup(): " + response.data);
    return response.data;
})

export const getDetail = createAsyncThunk("GET_USER", async () => {
    const response = await UserService.getDetail().data;
    // console.log("getDetail(): " + response.dat);
    return response.data;
})

const userSlice = createSlice({
    name: "users",
    initialState: {
        users: [],
        user: {

        }
    },
    reducers: {

    },
    extraReducers: (builder) => {
        builder
            .addCase(getUserList.fulfilled, (state, { payload }) => {
                // console.log("getUserList.fulfilled(): " + JSON.stringify(payload))

                state.users = payload;
            })
            .addCase(getUserList.rejected, (state, { payload }) => {
                // console.log("getUserList.rejected(): " + JSON.stringify(payload))
            })
            .addCase(signup.fulfilled, (state, { payload }) => {
                // console.log("signup.fulfilled(): " + JSON.stringify(payload))
            })
            .addCase(getDetail.fulfilled, (state, { payload }) => {
                // console.log("signup.fulfilled(): " + JSON.stringify(payload))
                state.user = payload
            })
    }
})

export default userSlice.reducer