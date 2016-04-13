package com.example.android.login_register;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by N_J on 4/13/2016.
 */
public class loginRequest extends StringRequest {
    private static final String Login_REQUEST_URL = "http://localhost/androidlogin/login.php";
    private Map<String, String> params;

    public loginRequest(String username, String password, Response.Listener<String> listner){
        super(Request.Method.POST, Login_REQUEST_URL, listner, null);
        params = new HashMap<>();
        params.put("username", username);
        params.put("password", password);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
