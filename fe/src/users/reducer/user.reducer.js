import {createAsyncThunk, createSlice} from "@reduxjs/toolkit"
import { UserService } from 'users/index'

export const getUserList = createAsyncThunk("GET_USER_LIST", async () => {
    const response = await UserService.findAll();
    // console.log("getUserList(): " + response.data);
    return response.data;
});

export const signup = createAsyncThunk("SIGN_UP", async (args) => {
    console.log("reducer call")
    const response = await UserService.signup(args);
    // console.log("signup(): " + response.data);
    return response.data;
})

export const signin = createAsyncThunk("SIGN_IN", async (args) => {
    const response = await UserService.signin(args);
    // console.log("signup(): " + response.data);
    return response.data;
})

export const getDetail = createAsyncThunk("GET_USER", async () => {
    const response = await UserService.getDetail().data;
    return response.data;
})

export const userEdit = createAsyncThunk("USER_EDIT", async (args) => {
    const response = await UserService.userEdit(args).data;
    return response.data;
})

export const userDelete = createAsyncThunk("USER_DELETE", async (args) => {
    await UserService.userDelete(args).data;
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
            .addCase(signup.fulfilled, (state, { payload }) => {
                // console.log("signup.fulfilled(): " + JSON.stringify(payload))

            })
            .addCase(getDetail.fulfilled, (state, { payload }) => {
                // console.log("signup.fulfilled(): " + JSON.stringify(payload))
                state.user = payload
            })
            .addCase(signin.fulfilled, (state, { payload }) => {
                console.log("Signin success JWT: " + payload);
            })
            .addCase(userEdit.fulfilled, (state, { payload }) => {
            })
            .addCase(userDelete.fulfilled, (state, { payload }) => {

            })
    }
})

export default userSlice.reducer